package com.android.recapture.ui;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import com.android.recapture.lib.ApplicationTriggers;
import com.android.recapture.lib.EmulationScheduler;
import com.android.recapture.lib.TouchGenerator;
import com.android.recapture.lib.TraceItem;

import android.app.Activity;
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
	
	private static ArrayList <TraceItem> data;
	private static EmulationScheduler scheduler;
	
	@Override
	public void onCreate() {
		data = new ArrayList <TraceItem>();
		
		TraceItem item1 = new TraceItem("facebook", 5000);
		TraceItem item2 = new TraceItem("gmail", 5000);
		TraceItem item3 = new TraceItem("amazon", 5000);
		TraceItem item4 = new TraceItem("sms", 5000);
		
		data.add(item1);
		data.add(item2);
		data.add(item3);
		data.add(item4);
		
		scheduler = new EmulationScheduler(data, this);
		scheduler.run();
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
