package com.example.mybudgetapp.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;

public class BackgroundUtils {
    private static final String PREFS_NAME = "background_prefs";
    private static final String BACKGROUND_URI_KEY = "background_uri";

    public static void saveBackgroundUri(Context context, Uri uri) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(BACKGROUND_URI_KEY, uri.toString());
        editor.apply();
    }

    public static Uri getBackgroundUri(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        String uriString = sharedPreferences.getString(BACKGROUND_URI_KEY, null);
        return uriString != null ? Uri.parse(uriString) : null;
    }
}
