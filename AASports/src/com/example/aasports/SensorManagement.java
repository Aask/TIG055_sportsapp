package com.example.aasports;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.widget.TextView;

/**
 * 
 * @author Alexander Ask
 *
 */
public class SensorManagement extends Activity implements SensorEventListener {
	
	private MainActivity Main; 
	private final SensorManager sm; 
	private ExerciseCalculation ec; 
	private Person person;

	//private final Sensor stepCounter;
	private final Sensor stepDetector; 
	private final float STEP_DETECTION_VALUE = 1.0f; 
	private int stepsCounted = 0;

	/**
	 * 
	 */
	public SensorManagement(MainActivity ma, Person p){
		Main = ma; 
		person = p; 
		ec = new ExerciseCalculation(); 
		sm = (SensorManager)getSystemService(SENSOR_SERVICE);
		stepDetector = sm.getDefaultSensor(Sensor.TYPE_STEP_DETECTOR); 
		//stepCounter = sm.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
		updateDisplay(); // inital update
	}
	/**
	 * 
	 */
	@Override
	public void onResume(){
		super.onResume();
		sm.registerListener(this, stepDetector, sm.SENSOR_DELAY_NORMAL);
		//sm.registerListener(this, stepCounter, sm.SENSOR_DELAY_NORMAL); // should it be normal? 
	}
	/**
	 * 
	 */
	@Override
	public void onPause(){
		super.onPause();
		sm.unregisterListener(this, stepDetector);
		//sm.unregisterListener(this, stepCounter);
	}
	/**
	 * 
	 */
	@Override
	public void onSensorChanged(SensorEvent se) {
		Sensor sensor = se.sensor;
		if(sensor == stepDetector){
			// First we need to check so that the correct sensor is reporting
			if((float)(se.values[0]) == STEP_DETECTION_VALUE){
				// Then if its value eqauls STEP_DETECTION_VALUE, i.e 1.0 then a step has been detected
				stepsCounted++; 
				updateDisplay();
			}
		}
	}
	/**
	 * 
	 */
	@Override
	public void onAccuracyChanged(Sensor s, int acc) {}
	
	/**
	 * 
	 */
	private void updateDisplay(){
		TextView tv = Main.getStepView();
		tv.setText(stepsCounted);
		
		tv = Main.getDistanceView();
		double distance = ec.getDistanceFromWalk(person, stepsCounted) / 1000; // divide by 1000 since we want it in m and the method returns cm
		tv.setText(String.valueOf(distance)); // convert to string since setText doesn´t take double
		
		tv = Main.getKcalView();
		int kcal = ec.getKcal(person.getWeight());
		tv.setText(kcal);
	}
	
}
