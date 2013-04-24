package com.android.recapture.lib;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ApplicationTriggers {
	
	/*
	 * The complete class path to trigger an app. For example,
	 * the full class path for facebook is com.android.facebook
	 * TODO: figure out all possible apps' class path and test.
	 * */
	public final static String APP_FACEBOOK_PACKAGE_NAME = "com.facebook.katana";
	public final static String APP_FACEBOOK_CLASS_NAME = null;
	
	public final static String APP_GMAIL_PACKAGE_NAME = "com.google.android.gm";
	public final static String APP_GMAIL_CLASS_NAME = null;
	
	public final static String APP_TWITTER_PACKAGE_NAME = "com.twitter.android";
	public final static String APP_TWITTER_CLASS_NAME = null;
	
	public final static String APP_PHONE_PACKAGE_NAME = "com.android.phone";
	public final static String APP_PHONE_CLASS_NAME = null;
	
	// TODO: figure out sms.
	public final static String APP_SMS_PACKAGE_NAME = "com.android.mms";
	public final static String APP_SMS_CLASS_NAME = null;
	
	public final static String APP_MAPS_PACKAGE_NAME = "com.google.android.apps.maps";
	public final static String APP_MAPS_CLASS_NAME = null;
	
	public final static String APP_AMAZON_PACKAGE_NAME = "com.amazon.mShop.android";
	public final static String APP_AMAZON_CLASS_NAME = null;
	
	/*
	 * Variable stores which application this trigger is for.
	 * */
	private String _ApplicationPackageName_;
	private String _ApplicationClassName_;
	private static Context _AppEnvironment_;
	
	public ApplicationTriggers(String pkgName, String className, Context context) {
		_ApplicationPackageName_ = pkgName;
		_ApplicationClassName_ = className;
		_AppEnvironment_ = context;
	}
	
	public ApplicationTriggers(String pkgName, Context context) {
		_ApplicationPackageName_ = pkgName;
		_ApplicationClassName_ = null;
		_AppEnvironment_ = context;
	}
	
	/*
	 * Launch the application by package name only or package name + main activity class.
	 * */
	public void triggerApplication() {
		if (_ApplicationClassName_ != null) {
			Intent intent = new Intent();
			intent.setComponent(new ComponentName(_ApplicationPackageName_, _ApplicationClassName_));
			_AppEnvironment_.startActivity(intent);
			Log.d("ReCapture", "trigger app with package name and class path");
		}
		else {
			Intent intent = _AppEnvironment_.getPackageManager().getLaunchIntentForPackage(_ApplicationPackageName_);
			_AppEnvironment_.startActivity(intent);
			Log.d("ReCapture", "trigger app with package name only => " + _ApplicationPackageName_);
		}
	}
	
	public String getPackageName() {
		return _ApplicationPackageName_;
	}
	
	public static String getPackageNameByApplicationName(String name) {
		System.out.println(name);
		if (name.equals(ConfigurationManager.APP_AMAZON)) return APP_AMAZON_PACKAGE_NAME;
		if (name.equals(ConfigurationManager.APP_FACEBOOK)) return APP_FACEBOOK_PACKAGE_NAME;
		if (name.equals(ConfigurationManager.APP_GMAIL)) return APP_GMAIL_PACKAGE_NAME;
		if (name.equals(ConfigurationManager.APP_MAPS)) return APP_MAPS_PACKAGE_NAME;
		if (name.equals(ConfigurationManager.APP_SMS)) return APP_SMS_PACKAGE_NAME;
		if (name.equals(ConfigurationManager.APP_TELEPHONE)) return APP_PHONE_PACKAGE_NAME;
		if (name.equals(ConfigurationManager.APP_TWITTER)) return APP_TWITTER_PACKAGE_NAME;
		return null;
	}
}
