package com.vendrov.plugins;

import android.app.IntentService;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;

public class WiseNotificationService extends IntentService {


	public WiseNotificationService(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public WiseNotificationService() {
        super("WiseNotificationService");
    }
	
	@Override
	protected void onHandleIntent(Intent intent) {
		
		if (intent.getStringExtra("DoIt").equals("sharon"))
		{
			//Handler handler = new Handler();
			
			Log.d("TagMe","success");
		}
		else
			Log.d("TagMe","fail");	
	}

}
