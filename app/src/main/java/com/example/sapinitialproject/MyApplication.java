package com.example.sapinitialproject;

import android.app.Application;

import com.sap.cloud.mobile.foundation.authentication.AppLifecycleCallbackHandler;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(AppLifecycleCallbackHandler.getInstance());
    }
}