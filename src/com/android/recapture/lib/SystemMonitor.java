package com.android.recapture.lib;

import android.content.Context;
import android.content.Intent;

public class SystemMonitor {
/*
 * The System Monitor interface which the emulator can access.
 * 
 * In fact, the monitor is running as a service, there are
 * four monitors: CPU, memory, network and battery.
 * 
 * When the emulator needs to monitor the metric within the
 * duration of an application event, this interface can
 * issue tags to the service where the recorded trace will
 * be marked and saved.
 * 
 * Note that only the start of the event needs the tag to
 * be sent because the end of the event is the beginning of
 * another one which will overwrite the tag issued by the
 * current one.
 * 
 * The core technique is the broadcast intent.
 * */
	
	private static Context _ApplicationEnvironment_;
	
	public SystemMonitor(Context env) {
		_ApplicationEnvironment_ = env;
	}
	
	public void issueTag(String tag) {
		Intent intent = new Intent();
	}
}
