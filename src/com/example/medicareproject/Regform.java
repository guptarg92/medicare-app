	package com.example.medicareproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class Regform extends SQLiteOpenHelper{

	public static final String dbname = "Patient.db";
	public static final String dtab = "Patient";
	public static final String name = "name";
	public static final String phone = "phone";
	public static final String gender = "gender";
	public static final String dob = "dob";
	
	public static final int dver=5;
	
	public Regform(Context context, String dbname, CursorFactory factory,
			int version) {
		super(context, dbname, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		String str = "create table Patient(_id integer primary key autoincrement,name text not null,phone text not null,gender text not null,dob text);";
	db.execSQL(str);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
