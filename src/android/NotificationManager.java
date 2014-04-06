package com.vendrov.plugins;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import android.content.Intent;
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
	        Context context=this.cordova.getActivity().getApplicationContext();
    		Intent intent=new Intent(context,Next_Activity.class);

		 Log.w("TagMe", "Success Plugin");
		Intent intent = new Intent(NotificationManager.this, com.vendrov.plugins.WiseNotificationService.class);
		intent.setAction(Intent.ACTION_SEND);
		intent.putExtra("DoIt", "sharon");
		context.startService(intent);	
		 return false;
	    }
}
