package com.example.tlshelper.data.local.pref;

import android.content.Context;
import android.content.SharedPreferences;

public class AppIntroPrefManager {
    private static AppIntroPrefManager instance;
    private final SharedPreferences pref;
    private final SharedPreferences.Editor editor;
    private static final String PREF_NAME = "AppIntroPref";
    private static final String KEY_IS_INTRO_SHOWN = "isIntroShown";

    private AppIntroPrefManager(Context context) {
        pref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = pref.edit();
    }

    public static synchronized AppIntroPrefManager getInstance(Context context) {
        if (instance == null) {
            instance = new AppIntroPrefManager(context.getApplicationContext());
        }
        return instance;
    }

    public void setIntroShown(boolean isShown) {
        editor.putBoolean(KEY_IS_INTRO_SHOWN, isShown);
        editor.apply();
    }

    public boolean isIntroShown() {
        return pref.getBoolean(KEY_IS_INTRO_SHOWN, false);
    }
}
