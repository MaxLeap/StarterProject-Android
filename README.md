# LAS-StarterProject-Android
LAS-StarterProject-Android

##  Install the SDK

1. Clone the repository.

2. Open the project

	In Android Studio, go to `File → Open…`
	Select `build.gradle` in the root of LAS-StarterProject-Android.

## Connect your app to LAS

Before continuing, select your LAS app from the menu.

Add your keys to your project:

```java
public void onCreate() {
  LASConfig.initialize(this, "your app id", "your api key");
}
```
Compile and run!

## Test the SDK

After installing the SDK, copy and paste this code into your app, for example in `MainActivity.onCreate()`:

```java
LASObject testObject = new LASObject("TestObject");
testObject.put("foo", "bar");
LASDataManager.saveInBackground(testObject);
```

Run your app. A new object of class `TestObject` will be sent to the LAS Cloud and saved.