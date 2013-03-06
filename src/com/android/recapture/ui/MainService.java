package com.android.recapture.ui;

import java.util.Timer;
import java.util.TimerTask;

import com.android.recapture.lib.ApplicationTriggers;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MainService extends Service {
/*
 * The main purpose of this service is to schedule the emulation.
 * 
 * Basically, it takes the trace from file, then make a timeline
 * for all those traces. Then it schedule the execution by pulling
 * the activity to the front end, where touch simulator will
 * generate the touch events. In the meantime, the builtin monitor
 * services will record the important information from the system,
 * such as CPU, memory, network and battery.
 * 
 * After an event has finished, the scheduler will continue to
 * another event until the whole event trace has been executed.
 * */
	
	private static ApplicationTriggers apt = null;
	private static Timer timer;
	private static int counter = 0;
	
	@Override
	public void onCreate() {
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if (counter % 2 == 0) {
					apt = new ApplicationTriggers(ApplicationTriggers.APP_GMAIL_PACKAGE_NAME, MainService.this);
					apt.triggerApplication();
				}
				else {
					apt = new ApplicationTriggers(ApplicationTriggers.APP_AMAZON_PACKAGE_NAME, MainService.this);
					apt.triggerApplication();
				}
				counter += 1;
				if (counter == 10) this.cancel();
			}}, 1000, 3000);
	}
	
	@Override
	public void onDestroy() {
		
	}
	
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
