package com.example.sapinitialproject;

import com.sap.cloud.mobile.foundation.authentication.BasicAuthCredentialStore;
import com.sap.cloud.mobile.foundation.securestore.SecureKeyValueStore;

public class BasicAuthPersistentStore implements BasicAuthCredentialStore {
    SecureKeyValueStore mSecureStore;
    final String KEY_PREFIX = "basic auth key prefix";

    public BasicAuthPersistentStore() {}

    public BasicAuthPersistentStore(SecureKeyValueStore secureKeyValueStore) {
        mSecureStore = secureKeyValueStore;
    }

    @Override
    public void storeCredential(String host, String realm, String[] credentials) {
        if (mSecureStore != null) {
            mSecureStore.put(key(host, realm), credentials);
        }
    }

    @Override
    public String[] getCredential(String host, String realm) {
        if (mSecureStore != null) {
            return mSecureStore.getSerializable(key(host, realm));
        }
        return null;
    }

    @Override
    public void deleteCredential(String host, String realm) {
        if (mSecureStore != null) {
            mSecureStore.remove(key(host, realm));
        }
    }

    @Override
    public void deleteAllCredentials() {
        if (mSecureStore != null) {
            String[] keys = mSecureStore.keys();
            for (String key:keys) {
                if (key.startsWith(KEY_PREFIX)) {
                    mSecureStore.remove(key);
                }
            }
        }
    }

    public void setStore(SecureKeyValueStore secureKeyValueStore) {
        mSecureStore = secureKeyValueStore;
    }

    private String key(String host, String realm) {
        return KEY_PREFIX + host + ":" + realm;
    }
}