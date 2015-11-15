package com.photomania.cordova;

import org.apache.cordova.CordovaPlugin;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.LoggingBehavior;
import com.facebook.FacebookSdk;

public class FacebookPlugin extends CordovaPlugin {
	protected void pluginInitialize() {
		// FacebookSdk.setIsDebugEnabled(true);
		// FacebookSdk.addLoggingBehavior(LoggingBehavior.APP_EVENTS);
	}

    public void onPause(boolean multitasking) {
		AppEventsLogger.deactivateApp(this.cordova.getActivity());
		super.onPause(multitasking);
    }

    public void onResume(boolean multitasking) {
		AppEventsLogger.activateApp(this.cordova.getActivity());
		super.onResume(multitasking);
    }
}