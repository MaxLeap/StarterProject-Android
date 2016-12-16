# MaxLeap-StarterProject-Android

MaxLeap-StarterProject-Android

##  Install the SDK

1. Clone the repository.

2. Open the project

	In Android Studio, go to `File → Open…`
	Select `settings.gradle` in the root of StarterProject-Android.

## Connect your app to MaxLeap

Before continuing, select your MaxLeap app from the menu.

Add your keys to your project in `App.onCreate()`:

```java
public void onCreate() {
  MaxLeap.initialize(this, "your app id", "your api key", MaxLeap.REGION_CN);
}
```
Compile and run!

## Test the SDK

After installing the SDK, copy and paste this code into your app, for example in `MainActivity.onCreate()`:

```java
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
```

Run your app. Check the output of logcat.