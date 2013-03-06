package com.android.recapture.lib;

import java.util.Timer;

import android.content.Context;

public class ApplicationEvent {
/*
 * The ApplicationEvent class is the execution unit of the emulator.
 * If an app is scheduled, the corresponding event is created. Note
 * that each application's real execution will be in a different
 * thread in order to control the time line (you cannot use wait()
 * in the main thread). The EmulationScheduler has been threaded,
 * so we do not consider more threading topics here.
 * */
	private static Context _ApplicationEnvironment_;
	private static ApplicationTriggers _ApplicationTrigger_;
	private static TouchGenerator _Toucher_;
	private static SystemMonitor _Monitor_;
	
	private static Timer _ScheduleTimer_;
	
	public ApplicationEvent(
			Context env, 
			ApplicationTriggers trigger, 
			TouchGenerator toucher, 
			SystemMonitor monitor) {
		_ApplicationEnvironment_ = env;
		_ApplicationTrigger_ = trigger;
		_Toucher_ = toucher;
		_Monitor_ = monitor;
	}
	
	/*
	 * The execution of any application is the same, which
	 * strictly follow the rule below:
	 * 
	 * <1> Open and rest for 5 seconds.
	 * <2> ...
	 * 
	 * TODO: make the execution dynamic configurable.
	 * */
	public void execute() {
		// trigger the event.
		_ApplicationTrigger_.triggerApplication();
	}
}
