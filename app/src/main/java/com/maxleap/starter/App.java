package com.maxleap.starter;

import android.app.Application;
import android.util.Log;

import com.maxleap.GetCallback;
import com.maxleap.MLDataManager;
import com.maxleap.MLObject;
import com.maxleap.MaxLeap;
import com.maxleap.exception.MLException;

public class App extends Application {

    public static final String APP_ID = "57f896b0a160020007e0df77";
    public static final String API_KEY = "VnRmeDlHQjU1aTAzaVRLTmU4Y3Vmdw";

    @Override
    public void onCreate() {
        super.onCreate();

        if (APP_ID.startsWith("Replace") || API_KEY.startsWith("Replace")) {
            throw new IllegalArgumentException("Please replace with your app id and api key first before" +
                    "using MaxLeap SDK.");
        }

		/*
         * Fill in this section with your MaxLeap credentials
		 */
        MaxLeap.setLogLevel(MaxLeap.LOG_LEVEL_ERROR);
        MaxLeap.initialize(this, APP_ID, API_KEY, MaxLeap.REGION_CN);

        //check maxleap sdk if connect to server.
        MaxLeap.checkSDKConnection();

    }
}
