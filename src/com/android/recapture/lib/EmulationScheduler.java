package com.android.recapture.lib;

import java.util.ArrayList;

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
	private static int _EmulationProgress_ = 0;
	private static ApplicationEvent _Event_;
	private static ApplicationTriggers _Trigger_;
	
	public EmulationScheduler(ArrayList <TraceItem> data, Context env) {
		_TraceData_ = data;
		_ApplicationEnvironment_ = env;
		_EmulationProgress_ = 0;
	}

	@Override
	public void run() {
		while (true) {
			if (_EmulationProgress_ >= _TraceData_.size()) return; // exit criteria: end of the data.
			
			// prepare the event.
			TraceItem item = _TraceData_.get(_EmulationProgress_);
			Log.d("ReCapture", item.ApplicationName);
			_Trigger_ = new ApplicationTriggers(
					ApplicationTriggers.getPackageNameByApplicationName(item.ApplicationName), 
					_ApplicationEnvironment_);
			// TODO: integrate the monitors and toucher
			_Event_ = new ApplicationEvent(_ApplicationEnvironment_, _Trigger_, null, null);
			
			// execute the event.
			_Event_.execute();
			
			++_EmulationProgress_;
			
			// sleep for a certain time.
			try {
				Thread.sleep(ConfigurationManager.APP_EVENT_SLEEP_DURATION);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
