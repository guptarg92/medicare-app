package com.example.medicareproject;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class update extends Activity{
	EditText e1,e2,e3,e4;
	
	
	Button btn;
	
	String expi="";
	Regform db1 = new Regform(this,"Patient.db", null, 5);
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.update);
		
		e1=(EditText)findViewById(R.id.id);
		e2=(EditText)findViewById(R.id.puname);
		e3=(EditText)findViewById(R.id.puphone);
		e4=(EditText)findViewById(R.id.udob);
		
		btn=(Button)findViewById(R.id.update1);
		
		
		
	btn.setOnClickListener(new OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			update();
		}
	});
		
	}
	public void update()
	{
		SQLiteDatabase db=db1.getWritableDatabase();
		 ContentValues cv=new ContentValues();
		 cv.put(Regform.name, e2.getText().toString());
		 cv.put(Regform.phone, e3.getText().toString());
		 cv.put(Regform.dob, e4.getText().toString());
		 
		 
		 db.update(Regform.dtab, cv, "_id="+e1.getText().toString(), null);
		 Toast.makeText(getApplicationContext(), "Data is Updated in Database", Toast.LENGTH_LONG).show();
	}

}
