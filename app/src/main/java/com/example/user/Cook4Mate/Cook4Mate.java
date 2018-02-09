package com.example.user.Cook4Mate;


import android.app.Application;

import com.firebase.client.Firebase;


public class Cook4Mate extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
