package com.lasstarter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import as.leap.LASDataManager;
import as.leap.LASLog;
import as.leap.LASObject;
import as.leap.callback.SaveCallback;
import as.leap.exception.LASException;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.click_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LASObject testObject = new LASObject("TestObject");
                testObject.put("foo", "bar");
                LASDataManager.saveInBackground(testObject, new SaveCallback() {
                    @Override
                    public void done(LASException e) {
                        if (e != null) {
                            LASLog.e(TAG, e);
                            return;
                        }
                        Toast.makeText(MainActivity.this, "Finish saving data on LAS server", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}
