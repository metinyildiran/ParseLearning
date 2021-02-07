package com.example.parselearning;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterClass extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //set log level
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("LYJXS5CSzkfoFRKaTBFTyACdPxqBGqI1zIOJi4yi")
                .clientKey("zp7HFbKO51llIDbQPD9mEfTlZUTGsejKQ7Vy61R2")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
