package com.example.aasports;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.os.Build;

/**
 * 
 * @author Alexander Ask
 *
 */
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ON Create","");
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
        Person p = new Person(); 
        
        //Person Activity
        
        //SensorManagement sa = new SensorManagement(this, p); 
    }
    
    /**
     * 
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    /**
     * 
     */
    @Override
    public void onStart(){
    	super.onStart();
    	 Log.d("ON Start","");
    }
    
    /**
     * 
     */
    @Override
    public void onStop(){
   	 super.onStop();
   	 Log.d("ON stop",""); 
    }
    
    /**
     * 
     */
     @Override
     public void onPause(){
    	 super.onPause();
    	 Log.d("ON pause","");
     }
     
     /**
      * 
      */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
   
    /**
     * 
     * @return
     */
    public TextView getStepView(){
    	TextView tw = (TextView)findViewById(R.id.stepsTW);
    	return tw; 
    }
    
    /**
     * 
     * @return
     */
    public TextView getDistanceView(){
    	TextView tw = (TextView)findViewById(R.id.distanceTW);
    	return tw; 
    }
    
    /**
     * 
     * @return
     */
    public TextView getKcalView(){
    	TextView tw = (TextView)findViewById(R.id.kcalTW);
    	return tw; 
    }

}
