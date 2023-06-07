package com.example.medic;

import android.app.Application;

public class MainForFont extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TypefaceUtil.overrideFont(getApplicationContext(), "SANS_SERIF", "font/sfpro_h.otf");
    }
}
