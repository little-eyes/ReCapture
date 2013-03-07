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
		"/system/bin/sendevent /dev/input/event0 0003 0039 000002a0",
		"/system/bin/sendevent /dev/input/event0 0003 0030 00000008",
		"/system/bin/sendevent /dev/input/event0 0003 003a 00000014",
		"/system/bin/sendevent /dev/input/event0 0003 0035 0000043f",
		"/system/bin/sendevent /dev/input/event0 0003 0036 000005ac",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 00000037",
		"/system/bin/sendevent /dev/input/event0 0003 0035 00000437",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 00000045",
		"/system/bin/sendevent /dev/input/event0 0003 0035 00000421",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 00000052",
		"/system/bin/sendevent /dev/input/event0 0003 0035 000003e9",
		"/system/bin/sendevent /dev/input/event0 0003 0036 000005b1",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 0000005d",
		"/system/bin/sendevent /dev/input/event0 0003 0035 000003b3",
		"/system/bin/sendevent /dev/input/event0 0003 0036 000005be",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 00000065",
		"/system/bin/sendevent /dev/input/event0 0003 0035 0000037d",
		"/system/bin/sendevent /dev/input/event0 0003 0036 000005d0",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 00000068",
		"/system/bin/sendevent /dev/input/event0 0003 0035 00000344",
		"/system/bin/sendevent /dev/input/event0 0003 0036 000005e6",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 00000067",
		"/system/bin/sendevent /dev/input/event0 0003 0035 0000030b",
		"/system/bin/sendevent /dev/input/event0 0003 0036 00000605",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 00000053",
		"/system/bin/sendevent /dev/input/event0 0003 0035 000002cd",
		"/system/bin/sendevent /dev/input/event0 0003 0036 00000625",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 0000003f",
		"/system/bin/sendevent /dev/input/event0 0003 0035 000002ae",
		"/system/bin/sendevent /dev/input/event0 0003 0036 00000635",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 00000030",
		"/system/bin/sendevent /dev/input/event0 0003 0035 000002a4",
		"/system/bin/sendevent /dev/input/event0 0003 0036 0000063a",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 00000024",
		"/system/bin/sendevent /dev/input/event0 0003 0035 00000290",
		"/system/bin/sendevent /dev/input/event0 0003 0036 00000644",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 0039 ffffffff",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 0039 000002a1",
		"/system/bin/sendevent /dev/input/event0 0003 003a 00000018",
		"/system/bin/sendevent /dev/input/event0 0003 0035 00000077",
		"/system/bin/sendevent /dev/input/event0 0003 0036 000004ce",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 00000045",
		"/system/bin/sendevent /dev/input/event0 0003 0035 00000082",
		"/system/bin/sendevent /dev/input/event0 0003 0036 000004cf",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 0000004f",
		"/system/bin/sendevent /dev/input/event0 0003 0035 000000a0",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 00000057",
		"/system/bin/sendevent /dev/input/event0 0003 0035 000000d5",
		"/system/bin/sendevent /dev/input/event0 0003 0036 000004ce",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 0000005d",
		"/system/bin/sendevent /dev/input/event0 0003 0035 0000010a",
		"/system/bin/sendevent /dev/input/event0 0003 0036 000004cb",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 00000061",
		"/system/bin/sendevent /dev/input/event0 0003 0035 00000141",
		"/system/bin/sendevent /dev/input/event0 0003 0036 000004c8",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 00000065",
		"/system/bin/sendevent /dev/input/event0 0003 0035 0000017f",
		"/system/bin/sendevent /dev/input/event0 0003 0036 000004c3",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 00000068",
		"/system/bin/sendevent /dev/input/event0 0003 0035 000001c4",
		"/system/bin/sendevent /dev/input/event0 0003 0036 000004be",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 0000006a",
		"/system/bin/sendevent /dev/input/event0 0003 0035 0000020e",
		"/system/bin/sendevent /dev/input/event0 0003 0036 000004b8",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 0000006b",
		"/system/bin/sendevent /dev/input/event0 0003 0035 00000260",
		"/system/bin/sendevent /dev/input/event0 0003 0036 000004b3",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 0000006a",
		"/system/bin/sendevent /dev/input/event0 0003 0035 000002b1",
		"/system/bin/sendevent /dev/input/event0 0003 0036 000004ae",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 0035 00000302",
		"/system/bin/sendevent /dev/input/event0 0003 0036 000004aa",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 00000066",
		"/system/bin/sendevent /dev/input/event0 0003 0035 00000359",
		"/system/bin/sendevent /dev/input/event0 0003 0036 000004a4",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 0000005e",
		"/system/bin/sendevent /dev/input/event0 0003 0035 000003a9",
		"/system/bin/sendevent /dev/input/event0 0003 0036 000004a0",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 00000048",
		"/system/bin/sendevent /dev/input/event0 0003 0035 000003d1",
		"/system/bin/sendevent /dev/input/event0 0003 0036 0000049e",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 00000037",
		"/system/bin/sendevent /dev/input/event0 0003 0035 000003de",
		"/system/bin/sendevent /dev/input/event0 0003 0036 0000049d",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 003a 0000002a",
		"/system/bin/sendevent /dev/input/event0 0003 0035 000003f9",
		"/system/bin/sendevent /dev/input/event0 0003 0036 0000049b",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000",
		"/system/bin/sendevent /dev/input/event0 0003 0039 ffffffff",
		"/system/bin/sendevent /dev/input/event0 0000 0000 00000000"};
}
