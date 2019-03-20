package com.example.sapinitialproject;


import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sapinitialproject.ESPM.ESPMContainer;
import com.example.sapinitialproject.ESPM.ESPMContainerMetadata;
import com.example.sapinitialproject.ESPM.Product;
import com.sap.cloud.mobile.foundation.authentication.BasicAuthDialogAuthenticator;
import com.sap.cloud.mobile.foundation.authentication.OAuth2BrowserProcessor;
import com.sap.cloud.mobile.foundation.authentication.OAuth2Configuration;
import com.sap.cloud.mobile.foundation.authentication.OAuth2Interceptor;
import com.sap.cloud.mobile.foundation.authentication.OAuth2WebViewProcessor;
import com.sap.cloud.mobile.foundation.authentication.SamlConfiguration;
import com.sap.cloud.mobile.foundation.authentication.SamlInterceptor;
import com.sap.cloud.mobile.foundation.authentication.SamlWebViewProcessor;
import com.sap.cloud.mobile.foundation.common.ClientProvider;
import com.sap.cloud.mobile.foundation.common.EncryptionError;
import com.sap.cloud.mobile.foundation.common.EncryptionUtil;
import com.sap.cloud.mobile.foundation.common.SettingsParameters;
import com.sap.cloud.mobile.foundation.configurationprovider.ConfigurationLoader;
import com.sap.cloud.mobile.foundation.configurationprovider.ConfigurationLoaderCallback;
import com.sap.cloud.mobile.foundation.configurationprovider.ConfigurationPersistenceException;
import com.sap.cloud.mobile.foundation.configurationprovider.ConfigurationProvider;
import com.sap.cloud.mobile.foundation.configurationprovider.ConfigurationProviderError;
import com.sap.cloud.mobile.foundation.configurationprovider.DefaultPersistenceMethod;
import com.sap.cloud.mobile.foundation.configurationprovider.DiscoveryServiceConfigurationProvider;
import com.sap.cloud.mobile.foundation.configurationprovider.FileConfigurationProvider;
import com.sap.cloud.mobile.foundation.configurationprovider.ProviderIdentifier;
import com.sap.cloud.mobile.foundation.configurationprovider.ProviderInputs;
import com.sap.cloud.mobile.foundation.configurationprovider.UserInputs;
import com.sap.cloud.mobile.foundation.logging.Logging;
import com.sap.cloud.mobile.foundation.networking.AppHeadersInterceptor;
import com.sap.cloud.mobile.foundation.networking.WebkitCookieJar;
import com.sap.cloud.mobile.foundation.securestore.OpenFailureException;
import com.sap.cloud.mobile.foundation.securestore.SecureKeyValueStore;
import com.sap.cloud.mobile.foundation.user.UserInfo;
import com.sap.cloud.mobile.foundation.user.UserRoles;
import com.sap.cloud.mobile.foundation.usage.AppUsage;
import com.sap.cloud.mobile.foundation.usage.AppUsageInfo;
import com.sap.cloud.mobile.foundation.usage.AppUsageUploader;
import com.sap.cloud.mobile.odata.DataQuery;
import com.sap.cloud.mobile.odata.EntitySet;
import com.sap.cloud.mobile.odata.EntityType;
import com.sap.cloud.mobile.odata.EntityValue;
import com.sap.cloud.mobile.odata.EntityValueList;
import com.sap.cloud.mobile.odata.OnlineODataProvider;
import com.sap.cloud.mobile.odata.Property;
import com.sap.cloud.mobile.odata.core.AndroidSystem;
import com.sap.cloud.mobile.odata.offline.OfflineODataDefiningQuery;
import com.sap.cloud.mobile.odata.offline.OfflineODataDelegate;
import com.sap.cloud.mobile.odata.offline.OfflineODataException;
import com.sap.cloud.mobile.odata.offline.OfflineODataFileDownloadProgress;
import com.sap.cloud.mobile.odata.offline.OfflineODataParameters;
import com.sap.cloud.mobile.odata.offline.OfflineODataProgress;
import com.sap.cloud.mobile.odata.offline.OfflineODataProvider;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.util.StatusPrinter;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    private Integer numberOfPresses = 0;
    private final String myTag = "myDebuggingTag";
    private OkHttpClient myOkHttpClient;
    private String deviceID;
    private  String serviceURL;
    private  String appID;
    private  String connectionID;
    private String messageToToast;
    private Toast toast;
    private String currentUser;
    private org.slf4j.Logger myLogger;
    private ch.qos.logback.classic.Logger myRootLogger;
    private Logging.UploadListener myLogUploadListener;

    private ESPMContainer myServiceContainer;
    private OnlineODataProvider myDataProvider;

    private ESPMContainer myOfflineServiceContainer;
    private OfflineODataProvider myOfflineDataProvider;

    private BasicAuthPersistentStore bapStore;
    private long startTime;

    // Don't attempt to unbind from the service unless the client has received some
// information about the service's state.
    private boolean shouldUnbind;
    // To invoke the bound service, first make sure that this value is not null.
    private OfflineODataForegroundService boundService;

    private ServiceConnection connection = new ServiceConnection() {
        public void onServiceConnected(ComponentName className, IBinder service) {
            // This is called when the connection with the service has been
            // established, giving us the service object we can use to
            // interact with the service.  Because we have bound to a explicit
            // service that we know is running in our own process, we can
            // cast its IBinder to a concrete class and directly access it.
            boundService = ((OfflineODataForegroundService.LocalBinder)service).getService();
        }

        public void onServiceDisconnected(ComponentName className) {
            /*
            This is called when the connection with the service has been
            unexpectedly disconnected -- that is, its process crashed.
            Because it is running in our same process, we should never
            see this happen.
            */
            boundService = null;
        }
    };

    private ConfigurationLoader discoveryServiceConfigurationLoader;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startTime = System.currentTimeMillis();
        Log.d(myTag, "onCreate");
        deviceID = Settings.Secure.getString(this.getContentResolver(), Settings.Secure.ANDROID_ID);
        Logging.ConfigurationBuilder cb = new Logging.ConfigurationBuilder()
                .logToConsole(true)
                .initialLevel(Level.ERROR);  //levels in order are all, trace, debug, info, warn, error, off
        //cb.logFileCount(4);
        //cb.logFileSize("1MB");
        Logging.initialize(this.getApplicationContext(), cb);
        myRootLogger = Logging.getRootLogger();
        myLogger =  LoggerFactory.getLogger(MainActivity.class);
        doBindService();
        SecureKeyValueStore myStore = new SecureKeyValueStore(this.getApplicationContext(), "mySecureStore");
        try {
            myStore.open(EncryptionUtil.getEncryptionKey("myAlias"));  //For additional security, consider using a passcode screen.
            bapStore = new BasicAuthPersistentStore(myStore);
        }
        catch (OpenFailureException e) {
            e.printStackTrace();
        }
        catch (EncryptionError encryptionError) {
            encryptionError.printStackTrace();
        }
        getConfigurationFromDiscoveryService();
        setContentView(R.layout.activity_main);
    }

    public void onLogALine(View view) {
        myLogger.warn("Logged with warn, log level is {}", ((ch.qos.logback.classic.Logger)myLogger).getEffectiveLevel());  //not logged as myLogger inherits from RootLogger
        myRootLogger.warn("Logged with warn, log level is {}", myRootLogger.getEffectiveLevel()); //not logged as rootLog was set to error in onCreate
        ((ch.qos.logback.classic.Logger)myLogger).setLevel(ch.qos.logback.classic.Level.WARN);
        myLogger.warn("Logged with warn, log level is {}", ((ch.qos.logback.classic.Logger)myLogger).getEffectiveLevel());  //logged
        myRootLogger.warn("Logged with warn, log level is {}", myRootLogger.getEffectiveLevel()); //not logged as rootLog was set to error in onCreate
        myRootLogger.error("Logged with error, log level is {}", myRootLogger.getEffectiveLevel());  //logged

        //StatusPrinter.print(((ch.qos.logback.classic.Logger)myLogger).getLoggerContext());  //shows where the log is on the device
        //String p = Logging.getConsoleLoggerPattern(); //pattern used for the log can be seen and changed via setConsoleLoggerPattern
    }

    public void onRegister(View view) {
        Log.d(myTag, "In onRegister");
        Logger authLogger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.sap.cloud.mobile.foundation.authentication");
        authLogger.setLevel(Level.DEBUG);
        SamlConfiguration samlConfiguration = new SamlConfiguration.Builder()
                .authUrl(serviceURL + "/SAMLAuthLauncher")
                .build();
        myOkHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new AppHeadersInterceptor(appID, deviceID, "1.0"))
                .addInterceptor(new SamlInterceptor(new SamlWebViewProcessor(samlConfiguration)))
                .cookieJar(new WebkitCookieJar())
                .build();

        Request request = new Request.Builder()
                .get()
                .url(serviceURL + "/" + connectionID + "/")
                .build();

        Callback updateUICallback = new Callback() {
            @Override
            public void onFailure(Call call, final IOException e) { //called if there is no network
                Log.d(myTag, "onFailure called during authentication " + e.getMessage());
                toastAMessage("Registration failed " + e.getMessage());
                setupOfflineOData();
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                if (response.isSuccessful()) {
                    myDataProvider = new OnlineODataProvider("ESPMContainer", serviceURL + "/" + connectionID , myOkHttpClient);
                    myServiceContainer = new ESPMContainer(myDataProvider);
                    Log.d(myTag, "Successfully authenticated");
                    toastAMessage("Successfully authenticated");
                    enableButtonsOnRegister(true);
                    getUser();
                    setupOfflineOData();
                    long registerTime = System.currentTimeMillis() - startTime;
                    float registerTimeInSeconds = new Float(Math.round(registerTime/10)) / 100;
                    Log.d(myTag, "Registration finished " + registerTimeInSeconds + " seconds after the application started.");
                    initializeUsage();
                }
                else { //called if the credentials are incorrect
                    Log.d(myTag, "Registration failed " + response.networkResponse());
                    toastAMessage("Registration failed " + response.networkResponse());
                }
            }
        };

        myOkHttpClient.newCall(request).enqueue(updateUICallback);
    }

    public void onUploadLog(View view) {
        Log.d(myTag, "In onUploadLog");

        myLogUploadListener = new Logging.UploadListener() {
            @Override
            public void onSuccess() {
                Log.d(myTag, "log upload complete, successful!");
                toastAMessage("Log upload completed and was successful!");
                Logging.removeLogUploadListener(myLogUploadListener);
            }

            @Override
            public void onError(@NonNull Throwable throwable) {
                Log.d(myTag, "log upload encountered an error with message: " + throwable.getMessage());
                toastAMessage("Log upload failed with error message: " + throwable.getMessage());
                Logging.removeLogUploadListener(myLogUploadListener);
            }

            @Override
            public void onProgress(int percentUploaded) {
                Log.d(myTag,"log upload progress: " + percentUploaded);
            }
        };
        Logging.addLogUploadListener(myLogUploadListener);

        try {
            SettingsParameters sp = new SettingsParameters(serviceURL, appID, deviceID, "1.0");
            Logging.uploadLog(myOkHttpClient, sp, Logging.UploadType.MERGE);
        } catch (MalformedURLException e) {
            myLogger.error("MalformedURLException: " + e.getMessage(), e);
        }
    }

    public void onOnlineOData(View view) {
        //new ODataQueryTask().execute();
        asyncOData();
    }

    public void onOfflineOData(View view) {
        Log.d(myTag, "In onOfflineOData");
        if (myOfflineServiceContainer != null) {
            List<Product> products = myOfflineServiceContainer.getProducts();
            toastAMessage(products.size() + " products returned");
            for (Product product : products) {
                Log.d(myTag, product.getName());
            }
        }
        else {
            Log.d(myTag, "Offline service container is null.");
            toastAMessage("Offline service container is null.");
        }
    }

    private void toastAMessage(String msg) {
        if (toast != null && toast.getView().isShown()) {
            msg = messageToToast + "\n" + msg;
        }
        else {  //clear any previously shown toasts that have since stopped being displayed
            messageToToast = "";
        }
        messageToToast = msg;
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {

            @Override
            public void run() {
                if (toast != null) {
                    toast.cancel();
                }
                toast = Toast.makeText(getApplicationContext(),
                        messageToToast,
                        Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }

    private void getUser() {
        Log.d(myTag, "In getUser");
        SettingsParameters sp = null;
        try {
            sp = new SettingsParameters(serviceURL, appID, deviceID, "1.0");
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
        UserRoles roles = new UserRoles(myOkHttpClient, sp);
        UserRoles.CallbackListener callbackListener = new UserRoles.CallbackListener() {
            @Override
            public void onSuccess(@NonNull UserInfo ui) {
                Log.d(myTag, "User Name: " + ui.getUserName());
                Log.d(myTag, "User Id: " + ui.getId());
                String[] roleList = ui.getRoles();
                Log.d(myTag, "User has the following Roles");
                for (int i=0; i < roleList.length; i++) {
                    Log.d(myTag, "Role Name " + roleList[i]);
                }
                currentUser = ui.getId();
                toastAMessage("Currently logged with " + ui.getId());
            }

            @Override
            public void onError(@NonNull Throwable throwable) {
                toastAMessage("UserRoles onFailure " + throwable.getMessage());
            }
        };

        roles.load(callbackListener);
    }

    private void enableButtonsOnRegister(final boolean enable) {
        final Button uploadLogButton = (Button) findViewById(R.id.b_uploadLog);
        final Button onlineODataButton = (Button) findViewById(R.id.b_odata);
        final Button unregisterButton = (Button) findViewById(R.id.b_unregister);
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                uploadLogButton.setEnabled(enable);
                onlineODataButton.setEnabled(enable);
                unregisterButton.setEnabled(enable);

            }
        });
    }
    private void asyncOData() {
        Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.sap.cloud.mobile.odata");
        logger.setLevel(Level.ALL);
        myDataProvider.getServiceOptions().setCacheMetadata(false);
        myDataProvider.setTraceRequests(true);
        myDataProvider.setPrettyTracing(true);
        myDataProvider.setTraceWithData(true);


        Log.d(myTag, "In aysncOData");
        DataQuery query = new DataQuery()
                .from(ESPMContainerMetadata.EntitySets.products)
                .select(Product.name)
                .where(Product.category.equal("Notebooks"))
                .orderBy(Product.name);
        myServiceContainer.getProductsAsync(query, (List<Product> products) -> {
            toastAMessage(products.size() + " products returned");
            for (Product product : products) {
                Log.d(myTag, product.getName());
            }
        }, (RuntimeException re) -> {
            toastAMessage("Online OData request failed: " + re.getMessage());
            Log.d(myTag, "An error occurred during async query:  "  + re.getMessage());
        });
    }

    private void setupOfflineOData() {
        Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.sap.cloud.mobile.odata");
        //logger.setLevel(Level.ALL);
        long startOfOpenOfflineStore = System.currentTimeMillis();
        AndroidSystem.setContext(getApplicationContext());

        OfflineODataDelegate delegate = new OfflineODataDelegate() {
            @Override
            public void updateDownloadProgress(OfflineODataProvider provider, OfflineODataProgress progress) {
                super.updateDownloadProgress(provider, progress);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        // As an example, log the # of bytes received
                        Log.d(myTag, "Download Bytes Received: " + progress.getBytesReceived());
                    }
                });
            }

            @Override
            public void updateFileDownloadProgress(OfflineODataProvider provider, OfflineODataFileDownloadProgress progress) {
                super.updateFileDownloadProgress(provider, progress);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        // As an example, log the # of bytes received
                        Log.d(myTag, "Update File Download Bytes Received: " + progress.getBytesReceived());
                    }
                });
            }
        };

        try {
            URL url = new URL(serviceURL + "/" + connectionID);
            OfflineODataParameters offParam = new OfflineODataParameters();
            offParam.setEnableRepeatableRequests(false);
            myOfflineDataProvider = new OfflineODataProvider(url, offParam, myOkHttpClient, null, delegate);
            OfflineODataDefiningQuery myDefiningQuery = new OfflineODataDefiningQuery("Products", "Products", false);
            myOfflineDataProvider.addDefiningQuery(myDefiningQuery);
        } catch (OfflineODataException e) {
            e.printStackTrace();
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }

        myOfflineDataProvider.open(() -> {
            Log.d(myTag, "Offline store opened");
            toastAMessage("Offline store opened");
            long openOfflineStoreTime = System.currentTimeMillis() - startOfOpenOfflineStore;
            long appReadyTime = System.currentTimeMillis() - startTime;
            float openOfflineStoreTimeInSeconds = new Float(Math.round(openOfflineStoreTime/10)) / 100;
            float appReadyTimeInSeconds = new Float(Math.round(appReadyTime/10)) / 100;
            Log.d(myTag, "Offline store opened in " + openOfflineStoreTimeInSeconds + " seconds.");
            Log.d(myTag, "App is ready " + appReadyTimeInSeconds + " seconds after the application started.");
            AppUsage.event(
                    "timerType",
                    "appReadyEventKey",
                    4L,
                    new AppUsageInfo()
                            .action("App ready to be used")
                            .value(appReadyTimeInSeconds + "")
                            .category("App Metrics"));

            AppUsage.event(
                    "timerType",
                    "timeToOpenOfflineStoreEventKey",
                    4L,
                    new AppUsageInfo()
                            .action("Time for offline store to open")
                            .value(openOfflineStoreTimeInSeconds + "")
                            .category("App Metrics"));
            final Button offlineODataButton = (Button) findViewById(R.id.b_offlineOData);
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new Runnable() {
                @Override
                public void run() {
                    offlineODataButton.setEnabled(true);
                    findViewById(R.id.b_offlineSync).setEnabled(true);
                }
            });
            myOfflineServiceContainer = new ESPMContainer(myOfflineDataProvider);

        }, (OfflineODataException offlineOdataException) -> {
            Log.d(myTag, "Offline store did not open.", offlineOdataException);
            toastAMessage("Offline store failed to open.  " + offlineOdataException.getMessage());
        });


    }

    public void performSync(View v) {
        toastAMessage("Performing offline store sync.");
        Log.d(myTag, "Performing offline store sync.");
        Log.d(myTag, "Beginning offline store upload.");
        myOfflineDataProvider.upload(() -> {
            toastAMessage("Completed upload, beginning download.");
            Log.d(myTag, "Completed upload, beginning download.");
            myOfflineDataProvider.download(() -> {
                toastAMessage("Completed download, sync complete.");
                Log.d(myTag, "Completed download, sync complete.");
                EntitySet errorArchiveSet = myOfflineServiceContainer.getEntitySet("ErrorArchive");
                EntityType errorArchiveType = errorArchiveSet.getEntityType();

                Property affectedEntityNavProp = errorArchiveType.getProperty("AffectedEntity");
                Property requestIDProp = errorArchiveType.getProperty("RequestID");
// more properties such as RequestBody, RequestMethod, RequestURL, Message
// CustomTag, Domain, HTTpStatusCode, Code, and InnerError

                DataQuery query = new DataQuery().from(errorArchiveSet).orderBy(requestIDProp);
                EntityValueList errorEntities = myOfflineServiceContainer.executeQuery(query).getEntityList();

// Iterate through the entities that have errors
                for (EntityValue errorEntity : errorEntities) {
                    myOfflineServiceContainer.loadProperty(affectedEntityNavProp, errorEntity);
                    EntityValue affectedEntity = affectedEntityNavProp.getEntity(errorEntity);
                    // Process each affected entity
                    // For this example application, we just log the entity
                    Log.d(myTag,"Error found: " + affectedEntity.toString());
                }
            }, e -> {
                toastAMessage("Failed to download the offline store, sync failed with error: " + e.toString());
                Log.d(myTag, "Failed to download the offline store, sync failed with error: " + e.toString());
            });
        }, e -> {
            toastAMessage("Failed to upload the offline store, sync failed with error: " + e.toString());
            Log.d(myTag, "Failed to upload the offline store, sync failed with error: " + e.toString());
        });
    }

    void doBindService() {
        // Attempts to establish a connection with the service.
        if (bindService(new Intent(MainActivity.this, OfflineODataForegroundService.class),
                connection, Context.BIND_AUTO_CREATE)) {
            shouldUnbind = true;
        }
        else {
            Log.e(myTag, "Error: The requested service doesn't " +
                    "exist, or this client isn't allowed access to it.");
        }
    }

    void doUnbindService() {
        if (shouldUnbind) {
            // Release information about the service's state.
            unbindService(connection);
            shouldUnbind = false;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        doUnbindService();
    }

    private void logout() {
        Log.d(myTag, "In logout");
        Request request = new Request.Builder()
                .post(RequestBody.create(null, ""))
                .url(serviceURL + "/mobileservices/sessions/logout")
                .build();

        Callback updateUICallback = new Callback() {
            @Override
            public void onFailure(Call call, final IOException e) {
                Log.d(myTag, "onFailure called during registration " + e.getLocalizedMessage());
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                if (response.isSuccessful()) {
                    Log.d(myTag, "Successfully logged out");
                    toastAMessage("Successfully logged out");
                    enableButtonsOnRegister(false);
                    onRegister(null);
                }
                else {
                    Log.d(myTag, "Logout failed " + response.networkResponse());
                    toastAMessage("Logout failed " + response.networkResponse());
                }
            }
        };

        myOkHttpClient.newCall(request).enqueue(updateUICallback);
    }

    public void onUnregister(final View view) {
        Log.d(myTag, "In onUnregister");
        bapStore.deleteAllCredentials();
        logout();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(myTag, "onStop");
        try {
            AppUsage.eventEnd("appUsageType", "appDuration",
                    new AppUsageInfo().duration("App has stopped"));
            AppUsage.sessionEnd();
        }
        catch (IllegalStateException e) {
            //this might happen if there was a problem during the initialization of the app
            //and usage was not initialized before the onStop event fires
            Log.d(myTag, "In onStop, and an exception occurred with ending the usage session.");
        }
    }

    private void initializeUsage() {
        EncryptionUtil.initialize(getApplicationContext());
        try {
            SettingsParameters sp = new SettingsParameters(serviceURL, appID, deviceID, "1.0");
            AppUsage.initialize(getApplicationContext(), "myUsageStore", sp, EncryptionUtil.getEncryptionKey("sample_alias"));
            //uploadUsage();  //upload any previous usage
            AppUsage.sessionStart();
            AppUsage.eventStart("appUsageType", "appDuration",
                    new AppUsageInfo().duration("App has initialized"));
            uploadUsage();  //upload any previous usage
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
        catch (EncryptionError encryptionError) {
            encryptionError.printStackTrace();
        }
        catch (OpenFailureException ex) {
            myLogger.error("Failed to open Usage store.", ex);
        }
    }

    public void uploadUsage() {
        AppUsageUploader.UploadListener myUsageUploadListener = new AppUsageUploader.UploadListener() {
            @Override
            public void onSuccess() {
                Log.d(myTag,"Successfully uploaded usage data");
                toastAMessage("Successfully uploaded usage data");
            }

            @Override
            public void onError(Throwable throwable) {
                Log.d(myTag,"Encountered error while uploading Message: " + throwable.getMessage());
                toastAMessage("Encountered error while uploading.  Message: " + throwable.getMessage());
            }

            @Override
            public void onProgress(int percentage) {
                Log.d(myTag, "Usage upload % " + percentage);
            }
        };
        AppUsageUploader.setListener(myUsageUploadListener);
        AppUsageUploader.upload(myOkHttpClient);
    }
    private void getConfiguration() {
        ConfigurationLoaderCallback myConfigCallback = new ConfigurationLoaderCallback() {
            public void onCompletion(ProviderIdentifier providerId, boolean success) {
                Log.d(myTag, "Provider loaded successfully.  " + providerId);
                try {
                    JSONObject config = DefaultPersistenceMethod.getPersistedConfiguration(getApplicationContext());
                    serviceURL = config.getString("serviceURL");
                    appID = config.getString("appID");
                    connectionID = config.getString("connectionID");
                    Log.d(myTag, "Config data is:  " + config.toString());
                    onRegister(null);
                } catch (ConfigurationPersistenceException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            public void onError(ConfigurationLoader configurationLoader,
                                ProviderIdentifier providerId,
                                UserInputs requestedInput,
                                ConfigurationProviderError error) {
                Log.d(myTag, "Provider failed to load.  " + error);
            }

            public void onInputRequired(ConfigurationLoader configurationLoader, UserInputs requestedInput) {
                Log.d(myTag, "Provider requires input. " + requestedInput);
            }
        };

        final ConfigurationLoader myLoader = new ConfigurationLoader(getApplicationContext(), myConfigCallback);
        myLoader.loadConfiguration();
    }
    private void getConfigurationFromDiscoveryService() {
        ConfigurationLoaderCallback myConfigCallback = new ConfigurationLoaderCallback() {
            public void onCompletion(ProviderIdentifier providerId, boolean success) {
                Log.d(myTag, "Provider loaded successfully.  " + providerId);
                try {
                    JSONObject config = DefaultPersistenceMethod.getPersistedConfiguration(getApplicationContext());
                    serviceURL = config.getString("serviceURL");
                    appID = config.getString("appID");
                    connectionID = config.getString("connectionID");
                    Log.d(myTag, "Config data is:  " + config.toString());
                    onRegister(null);
                } catch (ConfigurationPersistenceException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            public void onError(ConfigurationLoader configurationLoader,
                                ProviderIdentifier providerId,
                                UserInputs requestedInput,
                                ConfigurationProviderError error) {
                Log.d(myTag, "Provider failed to load.  " + error);
            }

            public void onInputRequired(ConfigurationLoader configurationLoader, UserInputs requestedInput) {
                JSONObject config = null;
                //Don't try to download the configuration data if we already have saved data.
                try {
                    config = DefaultPersistenceMethod.getPersistedConfiguration(getApplicationContext());
                } catch (ConfigurationPersistenceException e) {
                    e.printStackTrace();
                }
                if (config.length() != 0) {
                    configurationLoader.processRequestedInputs(requestedInput);
                }
                else {
                    Log.d(myTag, "Provider requires input. " + requestedInput);
                    discoveryServiceConfigurationLoader = configurationLoader;
                    getEmail();
                }
            }
        };

        ConfigurationProvider[] providers = new ConfigurationProvider[] {
                //new DiscoveryServiceConfigurationProvider(getApplicationContext())  //explicitly using string below to show the value
                new DiscoveryServiceConfigurationProvider("com.example.sapinititalproject:1.0")
        };
        final ConfigurationLoader myLoader = new ConfigurationLoader(getApplicationContext(), myConfigCallback, providers);

        myLoader.loadConfiguration();
    }

    //https://stackoverflow.com/questions/10903754/input-text-dialog-android
    private void getEmail() {  //This dialog could also be provided by the Fiori Onboariding Library
        AlertDialog.Builder builder = new AlertDialog.Builder(this, android.R.style.Theme_DeviceDefault_Dialog_NoActionBar_MinWidth);
        builder.setMessage("Enter your email address to download the configuration for your app.");
        builder.setTitle("Enter email");

        //Set up the input
        View viewInflated = LayoutInflater.from(this).inflate(R.layout.email_edit_text_layout, (ViewGroup)findViewById(android.R.id.content), false);
        final EditText input = (EditText) viewInflated.findViewById(R.id.input);
        input.setText("Lucas@trial-p2001193513trial.sapmobileplace.com");  //TODO, hardcoded to make it easier to test
        builder.setView(viewInflated);

        // Set up the buttons
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String email4DiscoveryService = input.getText().toString();
                Log.d(myTag, "Email is: " + input.getText().toString());
                UserInputs inputs = new UserInputs();
                ProviderInputs discoveryInputs = new ProviderInputs();
                discoveryInputs.addInput(DiscoveryServiceConfigurationProvider.EMAIL_ADDRESS, email4DiscoveryService);
                inputs.addProvider(ProviderIdentifier.DISCOVERY_SERVICE_CONFIGURATION_PROVIDER, discoveryInputs);
                discoveryServiceConfigurationLoader.processRequestedInputs(inputs);
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.show();
    }
}
