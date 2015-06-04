package com.example.medicareproject;



import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.SimpleCursorAdapter;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FilterQueryProvider;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

public class MedicareDbAdapter extends Activity implements OnClickListener {
	private Medicaredb dbHelper;
	private SimpleCursorAdapter dataAdapter;
	ListView lv;
	String num;
	Button b1,b2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.medicaredetaillayout); 
		b1=(Button)findViewById(R.id.displayrecord);
		b2=(Button)findViewById(R.id.clear);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		dbHelper = new Medicaredb(this);
         dbHelper.open(); 
       //Clean all data 
         dbHelper.deleteAllMedicare();
         //Add some data
         dbHelper.insertSomeMedicare();
         //Generate ListView from SQLite Database
         displayListView(); 
	}
	@SuppressLint("NewApi")
	private void displayListView() { 
		Cursor cursor = dbHelper.fetchAllMedicare(); 
		// The desired columns to be bound 
		String[] columns = new String[] { 
				Medicaredb.KEY_DISEASE,
				Medicaredb.KEY_NAME, 
				Medicaredb.KEY_LOCATION,
				Medicaredb.KEY_MOBILE,
				Medicaredb.KEY_EMAIL}; 
		// the XML defined views which the data will be bound to 
		int[] to = new int[] {
				R.id.disease, 
				R.id.name,
                R.id.loc1,
 				R.id.mobile,
 				R.id.email1};
		// create the adapter using the cursor pointing to the desired data 
		//as well as the layout information
		dataAdapter = new SimpleCursorAdapter(
				this, R.layout.medicareinfo,   cursor, columns, to, 0);
		lv = (ListView) findViewById(R.id.listView1); 
		// Assign adapter to
		 lv.setAdapter(dataAdapter); 
		 lv.setOnItemClickListener(new OnItemClickListener() {
			 @Override
			 public void onItemClick(AdapterView<?> lv, View view, int position, long id) {
				 AlertDialog.Builder ad3=new AlertDialog.Builder(MedicareDbAdapter.this);
					ad3.setTitle("Book Appointment");
					ad3.setMessage("Click Below for Appoinment");
					ad3.setPositiveButton("SMS",new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							Intent intent = new Intent(MedicareDbAdapter.this,SMS.class);
		                              
		   
							startActivity(intent);

						}
					});
					ad3.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							
							
							
							
							Intent intent = new Intent(MedicareDbAdapter.this,Call.class);
                            
		                    startActivity(intent);
						}
					});
					ad3.setNeutralButton("EMAIL", new DialogInterface.OnClickListener() {
							
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
                      Intent intent = new Intent(MedicareDbAdapter.this,Email.class);
                            
		                    startActivity(intent);
						}
					});
					ad3.show();
				 Cursor cursor = (Cursor) lv.getItemAtPosition(position); 
				 String countryCode = cursor.getString(cursor.getColumnIndexOrThrow("disease"));
				 Toast.makeText(getApplicationContext(),
						 countryCode, Toast.LENGTH_SHORT).show();
				 }  }); 
			
		 
		 EditText myFilter = (EditText) findViewById(R.id.myFilter);
		 myFilter.addTextChangedListener(new TextWatcher() {

			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start,
					int count, int after) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				// TODO Auto-generated method stub
				
				dataAdapter.getFilter().filter(s.toString()); 
				} 
			}); 
		 
		 dataAdapter.setFilterQueryProvider(new FilterQueryProvider() { 
			 public Cursor runQuery(CharSequence constraint) {  
				 return dbHelper.fetchMedicareByName(constraint.toString());  
				 }  
			 });
			 }
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.displayrecord:
			
			Intent intent=new Intent(this,Patientdb.class);
			startActivity(intent);
			break;
		case R.id.clear:
			Intent intent1=new Intent(this,Play.class);
			startActivity(intent1);
			break;
			
		}
	}
}