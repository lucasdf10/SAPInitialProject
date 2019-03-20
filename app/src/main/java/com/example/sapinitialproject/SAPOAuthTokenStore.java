package com.example.sapinitialproject;

import android.net.Uri;

import com.sap.cloud.mobile.foundation.authentication.OAuth2Token;
import com.sap.cloud.mobile.foundation.authentication.OAuth2TokenStore;
import com.sap.cloud.mobile.foundation.securestore.SecureKeyValueStore;

/**
 * Singleton class which is used for store of OAuth tokens. The tokens are persisted simple
 * in the application's secure store.
 */
public class SAPOAuthTokenStore implements OAuth2TokenStore {
    SecureKeyValueStore store;

    public SAPOAuthTokenStore(SecureKeyValueStore secureKeyValueStore) {
        store = secureKeyValueStore;
    }

    @Override
    public void storeToken(OAuth2Token oAuth2Token, String url) {
        if (store != null && store.isOpen()) {
            store.put(this.key(url), oAuth2Token);
        }
    }

    @Override
    public OAuth2Token getToken(String url) {
        OAuth2Token token = null;
        if (store != null && store.isOpen()) {
            token = (OAuth2Token) store.getSerializable(key(url));
        }
        return  token;
    }

    @Override
    public void deleteToken(String url) {
        if (store != null && store.isOpen()) {
            store.remove(key(url));
        }
    }

    public void deleteAllTokens() {
        if (store != null) {
            String[] keys = store.keys();
            for (String key:keys) {
                store.remove(key);
            }
        }
    }

    private String key(String url) {
        return Uri.parse(url).getHost();
    }
}