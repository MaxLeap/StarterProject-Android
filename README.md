# MaxLeap-StarterProject-Android

MaxLeap-StarterProject-Android

##  Install the SDK

1. Clone the repository.

2. Open the project

	In Android Studio, go to `File → Open…`
	Select `build.gradle` in the root of StarterProject-Android.

## Connect your app to MaxLeap

Before continuing, select your MaxLeap app from the menu.

Add your keys to your project in `App.onCreate()`:

```java
public void onCreate() {
  MaxLeap.initialize(this, "your app id", "your api key");
}
```
Compile and run!

## Test the SDK

After installing the SDK, copy and paste this code into your app, for example in `MainActivity.onCreate()`:

```java
MLObject testObject = new MLObject("TestObject");
testObject.put("foo", "bar");
MLDataManager.saveInBackground(testObject);
```

Run your app. A new object of class `TestObject` will be sent to the MaxLeap and saved.