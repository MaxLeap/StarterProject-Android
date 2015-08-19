package com.lasstarter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import as.leap.LCDataManager;
import as.leap.LCLog;
import as.leap.LCObject;
import as.leap.SaveCallback;
import as.leap.exception.LCException;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.click_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCObject testObject = new LCObject("TestObject");
                testObject.put("foo", "bar");
                LCDataManager.saveInBackground(testObject, new SaveCallback() {
                    @Override
                    public void done(LCException e) {
                        if (e != null) {
                            LCLog.e(TAG, e);
                            return;
                        }
                        Toast.makeText(MainActivity.this, "Finish saving data on LC server", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}
