package com.android.recapture.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.android.recapture.lib.ConfigurationManager;
import com.android.recapture.lib.EmulationScheduler;
import com.android.recapture.lib.TraceItem;

import android.app.Service;
import android.content.Intent;
import android.os.Environment;
import android.os.IBinder;

public class MainService extends Service {
/*
 * The main purpose of this service is to schedule the emulation.
 * 
 * Basically, it takes the trace from file, then make a timeline
 * for all those traces. Then it schedule the execution by pulling
 * the activity to the front end, where touch simulator will
 * generate the touch events. In the meantime, the builtin monitor
 * services will record the important information from the system,
 * such as CPU, memory, network and battery.
 * 
 * After an event has finished, the scheduler will continue to
 * another event until the whole event trace has been executed.
 * */
	
	private static ArrayList <TraceItem> data;
	private static EmulationScheduler scheduler;
	
	@Override
	public void onCreate() {
		initializeDataDirectory();
		data = loadTraceData();
		if (data != null) {
			scheduler = new EmulationScheduler(data, this);
			scheduler.run();
		}
	}
	
	@Override
	public void onDestroy() {
		
	}
	
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	private void initializeDataDirectory() {
		File SdCard = Environment.getExternalStorageDirectory();
		// create trace directory.
		File f = new File(ConfigurationManager.TRACE_PATH);
		if (!f.exists()) {
			try {
				f.mkdirs();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// create data directory.
		f = new File(ConfigurationManager.DATA_PATH);
		if (!f.exists()) {
			try {
				f.mkdirs();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private ArrayList <TraceItem> loadTraceData() {
		String DataURI = ConfigurationManager.TRACE_PATH + "/sample.trace";
		ArrayList <TraceItem> data = new ArrayList <TraceItem>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File(DataURI)));
			String line = "";
			while ((line = reader.readLine()) != null) {
				if (line == "") break;
				String [] elements = line.split(",");
				TraceItem item = new TraceItem(elements[0], Integer.valueOf(elements[1]));
				data.add(item);
			}
			return data;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
