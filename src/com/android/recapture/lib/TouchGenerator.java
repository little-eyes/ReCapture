package com.android.recapture.lib;

import java.util.List;

import android.app.ActivityManager;
import android.content.Context;
import android.view.View;

public class TouchGenerator {
/*
 * The class is to generate different touch action on
 * the screen, so that the emulator could operate the
 * app currently active.
 * */
	private static Context _ApplicationEnvironment_;
	private View _CurrentView_;
	private ActivityManager _ActivityManager_;
	
	public TouchGenerator(Context env) {
		_ApplicationEnvironment_ = env;
		_ActivityManager_ = (ActivityManager) _ApplicationEnvironment_.getSystemService(
				_ApplicationEnvironment_.ACTIVITY_SERVICE);
		List< ActivityManager.RunningTaskInfo > taskInfo = _ActivityManager_.getRunningTasks(1); 
	}
	
	// click event.
	public void dispatchClick() {
		
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
