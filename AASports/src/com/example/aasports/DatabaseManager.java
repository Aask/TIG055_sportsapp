package com.example.aasports;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * 
 * @author Alexander Ask
 *
 */
public class DatabaseManager extends SQLiteOpenHelper {
	
	private SQLiteDatabase db;
	private ContentValues cv; 
	
	private static final String DATABASE_NAME = "AASportsDatabase"; 
	private static final int DATABASE_VERSION = 1; 
	
	private static final String PERSON_TABLE = "Persons"; 
	private static final String COLUMN_ID = "PersonID";  
	private static final String COLUMN_FNAME = "PersonFName";
	private static final String COLUMN_SNAME = "PersonSName";
	private static final String COLUMN_WEIGHT = "PersonWeight";
	private static final String COLUMN_HEIGHT = "PersonHeight";
	private static final String COLUMN_GENDER = "PersonWeight"; 
	private static final String COLUMN_MONTH_STEPS = "PersonSteps";
	private static final String COLUMN_MONTH_DISTANCE = "PersonDistance";
	
	/**
	 * 
	 */
	private static final String SQL_CREATE_PERSON_TABLE = "CREATE TABLE " + PERSON_TABLE + "(" + 
			COLUMN_ID + " INTEGER PRIMARY KEY, " + 
			COLUMN_FNAME + " TEXT, " + 
			COLUMN_SNAME + " TEXT, " +
			COLUMN_WEIGHT + " Integer, " + 
			COLUMN_HEIGHT + " Integer, " +
			COLUMN_GENDER + " Integer, " +
			COLUMN_MONTH_STEPS + " Integer, " +
			COLUMN_MONTH_DISTANCE + "Integer" + ");"; 
	
	/**
	 * 
	 * @param con
	 */
	public DatabaseManager(Context con) {
		super(con, DATABASE_NAME, null, DATABASE_VERSION);		
	}
	
	/**
	 * 
	 */
	@Override
	public void onCreate(SQLiteDatabase db){
		db.execSQL(SQL_CREATE_PERSON_TABLE);
	}
	
	/**
	 * 
	 */
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
		Log.w(DatabaseManager.class.getName(), "Upgrading the database and deleting all old tables.");
		db.execSQL("DROP TABLE IF EXISTS " + PERSON_TABLE);
		onCreate(db); 
	}
	
	/**
	 * 
	 * @param p
	 */
	public void deletePerson(Person p){
		db = this.getWritableDatabase();
		db.delete(PERSON_TABLE, COLUMN_ID +"=?", new String[] {String.valueOf(p.getID())});
		db.close();
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Person getPerson(int id){
		db = this.getWritableDatabase(); 
		Cursor cursor = db.query(PERSON_TABLE, new String [] {COLUMN_ID, COLUMN_FNAME, COLUMN_SNAME,
				COLUMN_WEIGHT,COLUMN_HEIGHT, COLUMN_GENDER, COLUMN_MONTH_STEPS, 
				COLUMN_MONTH_DISTANCE }, COLUMN_ID + 
				"=?", new String [] {String.valueOf(id)}, null, null, null, null); 
		
		if(cursor == null){
			return null; 
		}
		
		cursor.moveToFirst(); 
		Person p = new Person();
		
		p.setID(id);
		p.setFnames(cursor.getString(1));
		p.setSname(cursor.getString(2));
		p.setWeight(Double.parseDouble(cursor.getString(3)));
		p.setHeight(Integer.parseInt(cursor.getString(4)));
		p.setGender(Integer.parseInt(cursor.getString(5)));
		p.setMonthsSteps(Integer.parseInt(cursor.getString(6)));
		p.setMonthsDistance(Integer.parseInt(cursor.getString(7)));	
		
		db.close();
		cursor.close();
		
		return p; 
	}
	
	/**
	 * 
	 * @param p
	 */
	public void updatePerson(Person p){
		db = this.getWritableDatabase(); 
		cv = setContentValues(p); 		
		db.update(PERSON_TABLE, cv, COLUMN_ID + "=?", new String [] {String.valueOf(p.getID())});
		db.close();		
	}
	
	/**
	 * 
	 * @param p
	 */
	public void addPerson(Person p){
		db = this.getWritableDatabase();
		cv = setContentValues(p);
		db.insert(PERSON_TABLE, null, cv); 
		db.close();
	}
	
	/**
	 * 
	 * @param p
	 * @return
	 */
	private ContentValues setContentValues(Person p){	
		ContentValues cv = new ContentValues();
		cv.put(COLUMN_FNAME, p.getFname());
		cv.put(COLUMN_SNAME, p.getSname());
		cv.put(COLUMN_WEIGHT, p.getWeight());
		cv.put(COLUMN_HEIGHT, p.getHeight());
		cv.put(COLUMN_GENDER, p.getGender());
		cv.put(COLUMN_MONTH_STEPS, p.getMonthsSteps());
		cv.put(COLUMN_MONTH_DISTANCE, p.getMonthsSteps());
		
		return cv;
	}

}
