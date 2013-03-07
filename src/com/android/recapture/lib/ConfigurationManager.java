package com.android.recapture.lib;

public class ConfigurationManager {

	/*
	 * The application event execution configuration.
	 * */
	public static final int APP_EVENT_SLEEP_DURATION = 5000; // sleep 20 seconds
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
	 * The swipe right commands.
	 * */
	public static final String [] TOUCH_SWIPE_RIGHT = {
		"/system/bin/sendevent /dev/input/event0: 0003 0035 000000da",
		"/system/bin/sendevent /dev/input/event0: 0003 0036 000001a2",
		"/system/bin/sendevent /dev/input/event0: 0003 003a 00000037",
		"/system/bin/sendevent /dev/input/event0: 0003 0030 00000004",
		"/system/bin/sendevent /dev/input/event0: 0003 0039 00000000",
		"/system/bin/sendevent /dev/input/event0: 0000 0002 00000000",
		"/system/bin/sendevent /dev/input/event0: 0000 0000 00000000"
	};
	
	public static final String [] TOUCH_SWIPE_LEFT = {
		"/system/bin/sendevent /dev/input/event0: 0003 0035 00000324",
		"/system/bin/sendevent /dev/input/event0: 0003 0036 00000235",
		"/system/bin/sendevent /dev/input/event0: 0003 003a 0000002b",
		"/system/bin/sendevent /dev/input/event0: 0003 0030 00000003",
		"/system/bin/sendevent /dev/input/event0: 0003 0039 00000000",
		"/system/bin/sendevent /dev/input/event0: 0000 0002 00000000",
		"/system/bin/sendevent /dev/input/event0: 0000 0000 00000000"
	};
	
	public static final String [] TOUCH_SWIPE_DOWN = {
		"/system/bin/sendevent /dev/input/event0: 0003 0035 00000285",
		"/system/bin/sendevent /dev/input/event0: 0003 0036 0000023a",
		"/system/bin/sendevent /dev/input/event0: 0003 003a 00000039",
		"/system/bin/sendevent /dev/input/event0: 0003 0030 00000003",
		"/system/bin/sendevent /dev/input/event0: 0003 0039 00000000",
		"/system/bin/sendevent /dev/input/event0: 0000 0002 00000000",
		"/system/bin/sendevent /dev/input/event0: 0000 0000 00000000"
	};
	
	public static final String [] TOUCH_SWIPE_UP = {
		"/system/bin/sendevent /dev/input/event0: 0003 0035 0000034a",
		"/system/bin/sendevent /dev/input/event0: 0003 0036 000002ab",
		"/system/bin/sendevent /dev/input/event0: 0003 003a 00000026",
		"/system/bin/sendevent /dev/input/event0: 0003 0030 00000003",
		"/system/bin/sendevent /dev/input/event0: 0003 0039 00000000",
		"/system/bin/sendevent /dev/input/event0: 0000 0002 00000000",
		"/system/bin/sendevent /dev/input/event0: 0000 0000 00000000"
	};
	
	public static final String [] KEYBOARD_SCREEN_UP = {
		"/system/bin/sendevent /dev/input/event2 0001 0074 00000001",
		"/system/bin/sendevent /dev/input/event2 0000 0000 00000000"
	};
	
	public static final String [] KEYBOARD_SCREEN_DOWN = {
		"/system/bin/sendevent /dev/input/event2 0001 0074 00000001",
		"/system/bin/sendevent /dev/input/event2 0000 0000 00000000"
	};
	
	public static final String [] KEYBOARD_BACK = {
		"/system/bin/sendevent /dev/input/event0: 0001 009e 00000001",
		"/system/bin/sendevent /dev/input/event0: 0001 009e 00000000"
	};
	
	public static final String [] KEYBOARD_HOME = {
		"/system/bin/sendevent /dev/input/event0: 0001 0066 00000001",
		"/system/bin/sendevent /dev/input/event0: 0001 0066 00000000"
	};
}
