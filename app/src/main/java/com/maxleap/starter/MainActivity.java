package com.maxleap.starter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.maxleap.MLDataManager;
import com.maxleap.MLLog;
import com.maxleap.MLObject;
import com.maxleap.SaveCallback;
import com.maxleap.exception.MLException;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.click_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MLObject testObject = new MLObject("TestObject");
                testObject.put("foo", "bar");
                MLDataManager.saveInBackground(testObject, new SaveCallback() {
                    @Override
                    public void done(MLException e) {
                        if (e != null) {
                            MLLog.e(TAG, e);
                            return;
                        }
                        Toast.makeText(MainActivity.this, "Finish saving data on MaxLeap server", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}
