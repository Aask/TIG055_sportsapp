package com.example.aasports;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/**
 * 
 * @author Ask
 *
 */
public class SensorActivity extends Activity implements SensorEventListener {
	
	private final SensorManager sm; 
	private final Sensor accelerometer; 
	/**
	 * 
	 */
	public SensorActivity(){
		sm = (SensorManager)getSystemService(SENSOR_SERVICE);
		accelerometer = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
	}
	/**
	 * 
	 */
	@Override
	public void onResume(){
		super.onResume();
		sm.registerListener(this, accelerometer, sm.SENSOR_DELAY_NORMAL); // should it be normal? 
	}
	/**
	 * 
	 */
	@Override
	public void onPause(){
		super.onPause();
		sm.unregisterListener(this);
	}
	/**
	 * 
	 */
	@Override
	public void onSensorChanged(SensorEvent se) {
		
	}
	/**
	 * 
	 */
	@Override
	public void onAccuracyChanged(Sensor s, int acc) {
		
	}

}
