package com.example.aasports;
/**
 * 
 * @author Alexander Ask
 * Forumla for calculating the KCAL burned during walking, MET * Weight * hours bu since we calculate it for every step all the time,
 * we will just use MET * Weight
 * Formula for calculating the distance walked is calculated by the avarge stride lenght of a persons
 * height times the number of steps 
 */
public class ExerciseCalculation {

	private final double METforWalking = 3.6;
	private final double MEN_STRIDELENGHT_CONSTANT = 0.415;
	private final double WOMAN_STRIDELENGHT_CONSTANT = 0.413;
	
	/**
	 * 
	 * @param p
	 * @param hours
	 * @return
	 */
	public int getKcal(double Weight){
		return (int)Math.round(METforWalking * Weight);
	}
	
	/**
	 * 
	 * @param p
	 * @param sm
	 * @return
	 */
	public double getDistanceFromWalk(Person p, int steps){
	 
		if(p.getGender() == p.FEMALE){
			return (WOMAN_STRIDELENGHT_CONSTANT * p.getHeight()) * steps;  
		}
		return (MEN_STRIDELENGHT_CONSTANT * p.getHeight()) * steps;  		
	}

}
