package com.maxleap.starter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.maxleap.GetCallback;
import com.maxleap.MLDataManager;
import com.maxleap.MLObject;
import com.maxleap.exception.MLException;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.click_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MLDataManager.fetchInBackground(MLObject.createWithoutData("foobar", "123"),
                        new GetCallback<MLObject>() {
                            @Override
                            public void done(MLObject mlObject, MLException e) {
                                if (e != null && e.getCode() == MLException.INVALID_OBJECT_ID) {
                                    Log.d("MaxLeap", "Connect to MaxLeap server successfully！");
                                } else {
                                    Log.d("MaxLeap", "Invalid MaxLeap credentials!");
                                }
                            }
                        });
            }
        });
    }
}
