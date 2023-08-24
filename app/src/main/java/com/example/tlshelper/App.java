package com.example.tlshelper;

import android.app.Application;

import com.example.tlshelper.data.local.pref.AppIntroPrefManager;

public class App extends Application {
    private AppIntroPrefManager appIntroPrefManager;
    @Override
    public void onCreate() {
        super.onCreate();
        appIntroPrefManager = AppIntroPrefManager.getInstance(this);
    }

    public AppIntroPrefManager getAppIntroPrefManager() {
        return appIntroPrefManager;
    }

}
