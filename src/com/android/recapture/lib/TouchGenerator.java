package com.android.recapture.lib;

import android.content.Context;

public class TouchGenerator {
/*
 * The class is to generate different touch action on
 * the screen, so that the emulator could operate the
 * app currently active.
 * */
	private static Context _ApplicationEnvironment_;
	
	public TouchGenerator(Context env) {
		_ApplicationEnvironment_ = env;
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
