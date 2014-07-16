package com.example.aasports;
/**
 * 
 * @author Alexander Ask
 *
 */
public class Person {
	
	public static final int MALE = 0;
	public static final int FEMALE = 1;
	
	private int id = 0; 
	private String fname = "";
	private String sname = "";
	private double weight = 0.0;
	private int height = 0;
	private int gender = 0; 
	
	private int todaysSteps = 0;
	private int monthsSteps = 0;
	private int kcal = 0;
	private int todaysDistance = 0;
	private int monthsDistance = 0;
	
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
	public Person( int identifier, String firstName, String surName, int personWeight, 
			int personHeight, int sex, int stepToday, int stepMonth, int calories,
			int distanceToday, int distanceMonth){
		
		id = identifier; 
		fname = firstName;
		sname = surName;
		weight = personWeight; 
		height = personHeight;
		gender = sex; 
		
		todaysSteps = stepToday;
		monthsSteps = stepMonth;
		kcal = calories;
		todaysDistance = distanceToday;
		monthsDistance = distanceMonth;

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
	public void setMonthsSteps (int ms){
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
	
	/**
	 * 
	 * @return
	 */
	public double getWeight(){
		return weight;
	}
	
	/**
	 * 
	 * @param w
	 */
	public void setWeight(double w){
		weight = w; 
	}
	/**
	 * 
	 * @return
	 */
	public double getHeight(){
		return height;
	}
	
	/**
	 * 
	 * @param w
	 */
	public void setHeight(int h){
		height = h; 
	}
	
	/**
	 * 
	 * @param g
	 */
	public void setGender(int g){
		gender = g; 
	}
	
	/**
	 * 
	 * @return
	 */
	public int getGender(){
		return gender; 
	}
	
	/**
	 * 
	 * @param ID
	 */
	public void setID(int ID){
		id = ID; 
	}
	
	/**
	 * 
	 * @return
	 */
	public int getID(){
		return id; 
	}

}
