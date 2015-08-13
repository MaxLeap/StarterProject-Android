# LeapCloud-StarterProject-Android
LeapCloud-StarterProject-Android

##  Install the SDK

1. Clone the repository.

2. Open the project

	In Android Studio, go to `File → Open…`
	Select `build.gradle` in the root of LC-StarterProject-Android.

## Connect your app to LeapCloud

Before continuing, select your LeapCloud app from the menu.

Add your keys to your project:

```java
public void onCreate() {
  LeapCloud.initialize(this, "your app id", "your api key");
}
```
Compile and run!

## Test the SDK

After installing the SDK, copy and paste this code into your app, for example in `MainActivity.onCreate()`:

```java
LCObject testObject = new LCObject("TestObject");
testObject.put("foo", "bar");
LCDataManager.saveInBackground(testObject);
```

Run your app. A new object of class `TestObject` will be sent to the LeapCloud and saved.