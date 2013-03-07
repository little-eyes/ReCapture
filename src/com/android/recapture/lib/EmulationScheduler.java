package com.android.recapture.lib;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.util.Log;


public class EmulationScheduler implements Runnable {
/*
 * The emulation scheduler is the central control component for
 * the emualtion process. It is a runnable class which can be
 * executed in another thread in order to easily control the
 * time slot for different app.
 * */
	
	private static ArrayList <TraceItem> _TraceData_;
	private static Context _ApplicationEnvironment_;
	private static ApplicationEvent _Event_;
	private static ApplicationTriggers _Trigger_;
	private static TouchGenerator _Toucher_;
	
	public EmulationScheduler(ArrayList <TraceItem> data, Context env) {
		_TraceData_ = data;
		_ApplicationEnvironment_ = env;
	}

	@Override
	public void run() {
		for (TraceItem item : _TraceData_) {
			// prepare the event.
			Log.d("ReCapture", item.ApplicationName);
			_Trigger_ = new ApplicationTriggers(
					ApplicationTriggers.getPackageNameByApplicationName(item.ApplicationName), 
					_ApplicationEnvironment_);
			
			_Toucher_ = new TouchGenerator(_ApplicationEnvrionment_);
			// TODO: integrate the monitors and toucher
			_Event_ = new ApplicationEvent(_ApplicationEnvironment_, _Trigger_, null, null);
			
			// execute the event.
			_Event_.execute();
			
			// sleep for a certain time.
			try {
				Thread.sleep(ConfigurationManager.APP_EVENT_SLEEP_DURATION);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
