package com.example.aasports;
/**
 * 
 * @author Ask
 *
 */
public class Person {
	
	int todaysSteps;
	int monthsSteps;
	int kcal;
	int todaysDistance;
	int monthsDistance;
	
	String fname;
	String sname;
	int weight;
	int lenght; 
	/**
	 * 
	 * @param st
	 * @param stm
	 * @param kc
	 * @param tDist
	 * @param mDist
	 * @param fn
	 * @param sn
	 */
	public Person( int st, int stm, int kc, int tDist, int mDist, String fn, String sn ){
		todaysSteps = st;
		monthsSteps = stm;
		kcal = kc;
		todaysDistance = tDist;
		monthsDistance = mDist;
		fname = fn;
		sname = sn;
	}
	/**
	 * 
	 */
	public Person(){}
	/**
	 * 
	 * @return
	 */
	public int getTodaysSteps (){
		return todaysSteps;
	}
	/**
	 * 
	 * @param ts
	 */
	public void setTodaysSteps (int ts){
		todaysSteps = ts; 
	}
	/**
	 * 
	 * @return
	 */
	public int getMonthsSteps (){
		return monthsSteps;
	}
	/**
	 * 
	 * @param ms
	 */
	public void setMonthsStepss (int ms){
		monthsSteps = ms; 
	}
	/**
	 * 
	 * @return
	 */
	public int getKcal (){
		return kcal;
	}
	/**
	 * 
	 * @param k
	 */
	public void setKcal (int k){
		kcal = k; 
	}
	/**
	 * 
	 * @return
	 */
	public int  getTodaysDistance (){
		return todaysDistance;
	}
	/**
	 * 
	 * @param td
	 */
	public void setTodaysDistance (int td){
		todaysDistance = td; 
	}
	/**
	 * 
	 * @return
	 */
	public int getMonthsDistance (){
		return monthsDistance;
	}
	/**
	 * 
	 * @param md
	 */
	public void setMonthsDistance (int md){
		monthsDistance = md; 
	}
	/**
	 * 
	 * @return
	 */
	public String getFname(){
		return fname;
	}
	/**
	 * 
	 * @param f
	 */
	public void setFnames (String f){
		fname = f; 
	}
	/**
	 * 
	 * @return
	 */
	public String getSname (){
		return sname;
	}
	/**
	 * 
	 * @param s
	 */
	public void setSname (String s){
		sname = s; 
	}
}
