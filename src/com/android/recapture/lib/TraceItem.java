package com.android.recapture.lib;

public class TraceItem {
/*
 * The data structure to represent each trace item from the
 * existing trace file. Each item will be mapped to an
 * ApplicationEvent later before execute each event.
 * */
	public static String ApplicationName = null;
	public static int ApplicationDuration = 0;
	
	public TraceItem(String name, int duration) {
		ApplicationName = name;
		ApplicationDuration = duration;
	}
}
