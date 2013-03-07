package com.android.recapture.lib;

import java.io.IOException;

import android.content.Context;

public class TouchInjector {
/*
 * The class is to generate different touch action on
 * the screen, so that the emulator could operate the
 * app currently active.
 * 
 * The approache is a low level system command: sendevent.
 * Android provide the command through ADB shell, one
 * can use it through ADB shell command:
 * $ adb shell sendevent /dev/input/event[0-3] 2 54 0
 * 
 * We use the approach described in the following URL:
 * http://softteco.blogspot.com/2011/03/android-reproducing-swipe-motion-to.html
 * 
 * But we integrate the shell command into Android program,
 * which we use Runtime.exec() to perform this task.
 * 
 * The command string is defined in ConfigurationManager.java
 * 
 * TODO: make sure whether this techniques requires root
 * access.
 * */
	private static Context _ApplicationEnvironment_;
	
	public TouchInjector(Context env) {
		_ApplicationEnvironment_ = env;
	}
	
	// click event.
	public void injectClick() {
		try {
			for (String cmd : ConfigurationManager.TOUCH_SWIPE_RIGHT)
				Runtime.getRuntime().exec(cmd);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// swipe down event.
	public void injectSwipeDown() {
		try {
			for (String cmd : ConfigurationManager.TOUCH_SWIPE_DOWN)
				Runtime.getRuntime().exec(cmd);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// swipe up event.
	public void injectSwipeUp() {
		try {
			for (String cmd : ConfigurationManager.TOUCH_SWIPE_UP)
				Runtime.getRuntime().exec(cmd);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// swipe left event.
	public void injectSwipeLeft() {
		try {
			for (String cmd : ConfigurationManager.TOUCH_SWIPE_LEFT)
				Runtime.getRuntime().exec(cmd);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// swipe right event.
	public void injectSwipeRight() {
		try {
			for (String cmd : ConfigurationManager.TOUCH_SWIPE_RIGHT)
				Runtime.getRuntime().exec(cmd);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// click back button.
	public void injectBackButton() {
		try {
			for (String cmd : ConfigurationManager.KEYBOARD_BACK)
				Runtime.getRuntime().exec(cmd);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// click home button.
	public void injectHomeButton() {
		try {
			for (String cmd : ConfigurationManager.KEYBOARD_HOME)
				Runtime.getRuntime().exec(cmd);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
