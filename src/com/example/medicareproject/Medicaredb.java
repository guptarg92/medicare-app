package com.example.medicareproject;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class Medicaredb  {
	public static final String KEY_ROWID = "_id";
	public static final String KEY_DISEASE = "disease";
	public static final String KEY_NAME = "name";
	public static final String KEY_ADDRESS = "address";
	public static final String KEY_LOCATION = "location";
	public static final String KEY_MOBILE = "mobile";
	public static final String KEY_EMAIL = "email";
	
	private static final String TAG = "MedicareDbAdapter";
	private DatabaseHelper mDbHelper;
	private SQLiteDatabase mDb;
	private static final String DATABASE_NAME = "MEDICAL1";
	private static final String SQLITE_TABLE = "MEDICAL1TABLE";
	private static final int DATABASE_VERSION = 1;
	private final Context mCtx;
	private static final String DATABASE_CREATE =  "CREATE TABLE if not exists "
	+ SQLITE_TABLE + " (" 
			+  KEY_ROWID + " integer PRIMARY KEY autoincrement," 
	+  KEY_DISEASE + "," 
	+  KEY_NAME + ","
	+  KEY_ADDRESS + ","
	+  KEY_LOCATION + ","
	+  KEY_MOBILE + ","
	+  KEY_EMAIL + ")"; 
	
	private static class DatabaseHelper extends SQLiteOpenHelper {
		DatabaseHelper(Context context) { 
			super(context, DATABASE_NAME, null, DATABASE_VERSION); 
			}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			Log.w(TAG, DATABASE_CREATE);
			db.execSQL(DATABASE_CREATE);  }

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			Log.w(TAG, "Upgrading database from version " + oldVersion + " to " 
		+ newVersion + ", which will destroy all old data");
			db.execSQL("DROP TABLE IF EXISTS " + SQLITE_TABLE);
			onCreate(db);
			}
		}
	public Medicaredb(Context ctx) {
		this.mCtx = ctx;
	}
		
	 public Medicaredb open() throws SQLException {
		 mDbHelper = new DatabaseHelper(mCtx);
		 mDb = mDbHelper.getWritableDatabase();
		 return this;
		 }
	 public void close() {
		 if (mDbHelper != null) {
			 mDbHelper.close();
			 } 
		 }
	 public long createMedicare(String disease, String name,  String address,
			 String location, String mobile, String email ) {
		 
		 ContentValues initialValues = new ContentValues();
		 initialValues.put(KEY_DISEASE, disease);
		 initialValues.put(KEY_NAME, name);
		 initialValues.put(KEY_ADDRESS, address);
		 initialValues.put(KEY_LOCATION, location);
		 initialValues.put(KEY_MOBILE, mobile); 
		 initialValues.put(KEY_EMAIL, email); 
		 return mDb.insert(SQLITE_TABLE, null, initialValues);
		 }
	 public boolean deleteAllMedicare() {
		 int doneDelete = 0;
 doneDelete = mDb.delete(SQLITE_TABLE, null , null);
 Log.w(TAG, Integer.toString(doneDelete));
 return doneDelete > 0;
 }
	 public Cursor fetchMedicareByName(String inputText) throws SQLException {
		 Log.w(TAG, inputText);
		 Cursor mCursor = null;  if (inputText == null  ||  inputText.length () == 0)  {
			 mCursor = mDb.query(SQLITE_TABLE, new String[] {KEY_ROWID, KEY_DISEASE, KEY_NAME, KEY_ADDRESS, KEY_LOCATION,KEY_MOBILE,KEY_EMAIL},
					 null, null, null, null, null);
			 }
		 else {
			 mCursor = mDb.query(true, SQLITE_TABLE, new String[] {KEY_ROWID, KEY_DISEASE, KEY_NAME, KEY_ADDRESS, KEY_LOCATION,KEY_MOBILE,KEY_EMAIL},
					 KEY_DISEASE + " like '%" + inputText + "%'", null, null, null, null, null);
			 }
		 if (mCursor != null) { 
			 mCursor.moveToFirst();
			 } 
		 return mCursor;
		 } 
	
				 public Cursor fetchAllMedicare() {
					 Cursor mCursor = mDb.query
							 (SQLITE_TABLE, new String[] {
									 KEY_ROWID, KEY_DISEASE, KEY_NAME, KEY_ADDRESS, KEY_LOCATION,KEY_MOBILE,KEY_EMAIL}, 
									 null, null, null, null, null);
					 if (mCursor != null) { 
						 mCursor.moveToFirst(); 
						 } 
					 return mCursor;
}
				 public void insertSomeMedicare() { 
					 createMedicare("Cancer","Dr. Barun Sood","23/I, Malviya Nagar, New Delhi","West Delhi","9898977671","barun@gmail.com");
					  createMedicare("Heart","Dr.. Bala Sood","43/G, Kamla Nagar, New Delhi","East Delhi","7772372123","bala@gmail.com");
					  createMedicare("Dengue","Dr. Aalam Bhatt","65/H, Surya Nagar, New Delhi","South Delhi","5316433333","aalam@gmail.com");
					  createMedicare("Rabies","Dr. Aruna Garg","25/D, Preet Nagar, New Delhi","North Delhi","2322442222","aruna@gmail.com");
					  createMedicare("Typhiod","Dr. Mukul Jha","62/H, Nehru Nagar, New Delhi","East Delhi","1123232122","mukul@gmail.com");
					  createMedicare("Measels","Dr. Karuna Verma","21/M, Manav Nagar, New Delhi","West Delhi","9922323892","karuna@gmail.com");
					  createMedicare("Dengue","Dr. Ankit Saluja","90/B, Ram Nagar, New Delhi","North Delhi","7236732333","ankit@gmail.com");
					  createMedicare("Rabies","Dr. Barun Sood","40/c, Karol Bagh, New Delhi","South Delhi","9898977671","barun@gmail.com");
					  createMedicare("Typhiod","Dr. Bala Sood","25/H, Malviya Nagar, New Delhi","East Delhi","9772372123","bala@gmail.com");
					  createMedicare("Measels","Dr.Vivek Bhatt","10/K, Laxmi nagar, New Delhi","West Delhi","9316433333","vivek12@yahoo.com");
					  createMedicare("Asthma","Dr. Aruna Garg","34/K, Connaught place, New Delhi","North Delhi","9322442222","aruna@yahoo.co.in");
					  createMedicare("Diabetes","Dr. Mukul Jha","A/12, Model Town, New Delhi","South Delhi","1123232122","mukul@rediffmail.com");
					  createMedicare("Cancer","Dr. Karuna Verma","Z/5, 2nd block, Shadipur, New Delhi","East Delhi","9922323892","karuna@gmail.com");
					  createMedicare("Heart","Dr. Ankit Saluja","14/d, Dwarka sector10, New Delhi","West Delhi","8236732333","ankit@gmail.com");
					  createMedicare("Asthma","Dr.Pankaj Kumar","40/c, Karol Bagh, New Delhi","North Delhi","09971234520","pankajkumar12@gmail.com");
					  createMedicare("Diabetes","Dr.Nisha Gupta","40/d, Patel nagar, New Delhi","South Delhi","09972344572","nisha.gupta04@gmail.com");
					  createMedicare("Sickle Cell Anaemia",  "Dr.Mohit Jain","6-A, Lajpat nagar, New Delhi","East Delhi","09711492210","mohit_jain@gmail.com");
					  createMedicare("Sickle Cell Anaemia",  "Dr.Ankit Sharma","10-D,3rd floor, Dwarka sector 14, New Delhi","West Delhi","09878665439","Ankit.sharma231@yahoo.co.in ");
					  createMedicare("Chronic Kidney Disease",  "Dr.Swati Khanna","36/G, Kamla nagar, New Delhi","West Delhi","09971234520","swati_khanna@ymail.com");
					  createMedicare("Chronic Kidney Disease",  "Dr.Sanjay Mehta","56/j, 2nd block, Subhash Nagar, New Delhi","West Delhi","07443211007","sanjay30@yahoo.com");
					  createMedicare("Hypertension","Dr. Nikita Singh","12/h, Rajouri Garden, New Delhi","North Delhi","08612347761","nikita_singh23@gmail.com");
					  createMedicare("Hypertension","Dr.Abhishek Mittal","50/N, 5th block, Moti nagar, New Delhi","South Delhi"," 09722881007","abhi_mittal@gmail.com");
					  createMedicare("Leukemia","Dr.Rahul Verma","B/40, Pitampura, New Delhi","West Delhi","09899511243","rahul.verma@yahoo.co.in");
					  createMedicare("Leukemia","Dr. Karuna Verma","Z/5, 2nd block, Shadipur, New Delhi","East Delhi","9922326892","karuna@gmail.com");
					  createMedicare("Cholera","Dr. Ankit Saluja","14/d, Dwarka sector10, New Delhi","West Delhi","8236732353","ankit@gmail.com");
					  createMedicare("Cholera","Dr.Pankaj Kumar","40/c, Karol Bagh, New Delhi","North Delhi","09971234733","pankajkumar12@gmail.com");
					  createMedicare("Malaria","Dr.Nisha Gupta","40/d, Patel nagar, New Delhi","South Delhi","09972344525","nisha.gupta04@gmail.com");
					  createMedicare("Malaria","Dr.Mohit Jain","6-A, Lajpat nagar, New Delhi","East Delhi","09711492265","mohit_jain@gmail.com");
					  createMedicare("AIDS","Dr.Ankit Sharma","10-D,3rd floor, Dwarka sector 14, New Delhi","West Delhi","09878665421","Ankit.sharma231@yahoo.co.in ");
					  createMedicare("AIDS","Dr.Swati Khanna","36/G, Kamla nagar, New Delhi","West Delhi","09971234533","swati_khanna@ymail.com");
					  createMedicare("Tuberclosis","Dr.Sanjay Mehta","56/j, 2nd block, Subhash Nagar, New Delhi","West Delhi","07443211027","sanjay30@yahoo.com");
					  createMedicare("Tuberclosis","Dr. Nikita Singh","12/h, Rajouri Garden, New Delhi","North Delhi","08612347763","nikita_singh23@gmail.com");
					  createMedicare("Cancer","Dr.Abhishek Mittal","50/N, 5th block, Moti nagar, New Delhi","South Delhi"," 09722881021","abhi_mittal@gmail.com");
					  createMedicare("Tuberclosis","Dr.Rahul Verma","B/40, Pitampura, New Delhi","West Delhi","0989951122","rahul.verma@yahoo.co.in");
					 }
					 
					}

	