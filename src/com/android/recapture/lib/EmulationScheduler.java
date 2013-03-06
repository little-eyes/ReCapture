package com.android.recapture.lib;

import java.util.ArrayList;

import android.content.Context;


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
			ApplicationTriggers trigger = new ApplicationTriggers(
					ApplicationTriggers.getPackageNameByApplicationName(item.ApplicationName), 
					_ApplicationEnvironment_);
			ApplicationEvent event = new ApplicationEvent(_ApplicationEnvironment_, trigger, null, null);
			
			// execute the event.
			event.execute();
			
			// sleep for a certain time.
			try {
				wait(ConfigurationManager.APP_EVENT_SLEEP_DURATION);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
