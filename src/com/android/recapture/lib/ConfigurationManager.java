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
}
