package com.vendrov.plugins;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

public class NotificationManager extends CordovaPlugin {
	
	 @Override
	    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
	     /*   if ("beep".equals(action)) {
	            final long duration = args.getLong(0);
	            cordova.getThreadPool().execute(new Runnable() {
	                public void run() {
	                    callbackContext.success(); // Thread-safe.
	                }
	            });
	            return true;
	        }*/
	        
		 Log.w("TagMe", "Success Plugin");
		 return false;
	    }
}
