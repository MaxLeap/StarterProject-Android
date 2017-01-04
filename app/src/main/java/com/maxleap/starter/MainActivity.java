package com.maxleap.starter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.maxleap.GetCallback;
import com.maxleap.MLDataManager;
import com.maxleap.MLObject;
import com.maxleap.MLQuery;
import com.maxleap.MLUserManager;
import com.maxleap.MaxLeap;
import com.maxleap.exception.MLException;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
