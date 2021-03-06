package com.android.recapture.lib;

import android.os.Environment;

public class ConfigurationManager {

	/*
	 * The application event execution configuration.
	 * */
	public static final int APP_EVENT_SLEEP_DURATION = 10000; // sleep 20 seconds
	public static final int APP_EVENT_CLICK_DURATION = 5000; // random click 5 seconds
	public static final int APP_EVENT_CLICK_GAP = 1000; // every 1 second issue a click
	
	/*
	 * The canonical application name
	 * */
	public static final String APP_AMAZON = "amazon";
	public static final String APP_GMAIL = "gmail";
	public static final String APP_TELEPHONE = "telephone";
	public static final String APP_SMS = "sms";
	public static final String APP_TWITTER = "twitter";
	public static final String APP_MAPS = "maps";
	public static final String APP_FACEBOOK = "facebook";
	
	/*
	 * The screen injection commands. The value is unique to machines.
	 * Currently, the code is tested on emulator.
	 * TODO: figure out the right code for right machine.
	 * */
	public static final String [] TOUCH_SWIPE_RIGHT = {
		"/system/bin/sendevent /dev/input/event0 0003 0035 000000da",
		"/system/bin/sendevent /dev/input/event0 0003 0036 000001a2",
		"/system/bin/sendevent /dev/input/event0 0003 003a 00000037",
		"/system/bin/sendevent /dev/input/event0 0003 0030 00000004",
		"/system/bin/sendevent /dev/input/event0 0003 0039 00000000",
		"/system/bin/sendevent /dev/input/event0 0000 0002 00000000",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000"
	};
	
	public static final String [] TOUCH_SWIPE_LEFT = {
		"/system/bin/sendevent /dev/input/event0 0003 0035 00000324",
		"/system/bin/sendevent /dev/input/event0 0003 0036 00000235",
		"/system/bin/sendevent /dev/input/event0 0003 003a 0000002b",
		"/system/bin/sendevent /dev/input/event0 0003 0030 00000003",
		"/system/bin/sendevent /dev/input/event0 0003 0039 00000000",
		"/system/bin/sendevent /dev/input/event0 0000 0002 00000000",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000"
	};
	
	public static final String [] TOUCH_SWIPE_DOWN = {
		"/system/bin/sendevent /dev/input/event0 0003 0035 00000285",
		"/system/bin/sendevent /dev/input/event0 0003 0036 0000023a",
		"/system/bin/sendevent /dev/input/event0 0003 003a 00000039",
		"/system/bin/sendevent /dev/input/event0 0003 0030 00000003",
		"/system/bin/sendevent /dev/input/event0 0003 0039 00000000",
		"/system/bin/sendevent /dev/input/event0 0000 0002 00000000",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000"
	};
	
	public static final String [] TOUCH_SWIPE_UP = {
		"/system/bin/sendevent /dev/input/event0 0003 0035 0000034a",
		"/system/bin/sendevent /dev/input/event0 0003 0036 000002ab",
		"/system/bin/sendevent /dev/input/event0 0003 003a 00000026",
		"/system/bin/sendevent /dev/input/event0 0003 0030 00000003",
		"/system/bin/sendevent /dev/input/event0 0003 0039 00000000",
		"/system/bin/sendevent /dev/input/event0 0000 0002 00000000",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000"
	};
	
	public static final String [] KEYBOARD_SCREEN_UP = {
		"/system/bin/sendevent /dev/input/event0 0001 0074 00000001",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000"
	};
	
	public static final String [] KEYBOARD_SCREEN_DOWN = {
		"/system/bin/sendevent /dev/input/event0 0001 0074 00000001",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000"
	};
	
	public static final String [] KEYBOARD_BACK = {
		"/system/bin/sendevent /dev/input/event0 0001 009e 00000001",
		"/system/bin/sendevent /dev/input/event0 0001 009e 00000000"
	};
	
	public static final String [] KEYBOARD_HOME = {
		"/system/bin/sendevent /dev/input/event0 1 102 1",
		"/system/bin/sendevent /dev/input/event0 1 102 0"
	};
	
	public static final String [] TOUCH_CLICK = {
		"/system/bin/sendevent /dev/input/event0 0003 0000 000000fd",
		"/system/bin/sendevent /dev/input/event0 0003 0001 000002f4"
	};
	
	/*
	 * File and data directory.
	 * */
	public static final String TRACE_PATH = Environment.getExternalStorageDirectory() + "/ReCapture/trace";
	public static final String DATA_PATH = Environment.getExternalStorageDirectory() + "/ReCapture/data";
	
	/*
	 * Communication Host and Port
	 * */
	public static String MASTER_HOST = "192.168.10.144";
	public static int MASTER_PORT = 15100;
}
