package com.android.recapture.lib;

import java.io.IOException;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

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
	public void dispatchClick() {
		try {
			for (String cmd : ConfigurationManager.TOUCH_SWIPE_RIGHT)
				Runtime.getRuntime().exec(cmd);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// swipe down event.
	public void dispatchSwipeDown() {
		
	}
	
	// swipe up event.
	public void dispatchSwipeUp() {
		
	}
	
	// swipe left event.
	public void dispatchSwipeLeft() {
		
	}
	
	// swipe right event.
	public void dispatchSwipeRight() {
		
	}
	
	// click back button.
	public void dispatchBackButton() {
		
	}
}
