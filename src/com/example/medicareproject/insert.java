package com.example.medicareproject;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

public class insert extends Activity{
	
	EditText e1,e2,e3;
	
	RadioButton b1;
	RadioButton b2;
	Button btn1,btn2;
	
	String expi="";
	
	Regform db1 = new Regform(this,"Patient.db", null, 5);
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		
	setContentView(R.layout.insert);
	e1=(EditText)findViewById(R.id.puname);
	e2=(EditText)findViewById(R.id.puphone);
	e3=(EditText)findViewById(R.id.udob);
	
	
	b1=(RadioButton)findViewById(R.id.male);
	b2=(RadioButton)findViewById(R.id.ufemale);
	btn1=(Button)findViewById(R.id.save);
	btn2=(Button)findViewById(R.id.clear);
	
	
	b1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
		
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			// TODO Auto-generated method stub
			if(b1.isChecked()==true)
			{
				
				expi="Male";
			}
				
				
		} 
	});
b2.setOnCheckedChangeListener(new OnCheckedChangeListener() {
		
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			// TODO Auto-generated method stub
			if(b2.isChecked()== true)
			{
				expi="Female";
			}
				
			
		}
	});
	
btn1.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		add();
	}
});
	


 btn2.setOnClickListener(new OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			clear();
		}
	});
		}
public void add()
{
	 SQLiteDatabase db=db1.getWritableDatabase();
	 ContentValues cv=new ContentValues();
	 cv.put(Regform.name, e1.getText().toString());
	 cv.put(Regform.phone, e2.getText().toString());
	 cv.put(Regform.dob, e3.getText().toString());
	 cv.put(Regform.gender, expi);
	
	
	 db.insert(Regform.dtab, null, cv);
	 Toast.makeText(getApplicationContext(), "Data is Entered in Database", Toast.LENGTH_LONG).show();
	 
}
	 public void clear()
	 {
		
		 
		 e1.setText("");
		  e2.setText("");
		e3.setText("");
		 
		
		
	 }
	}

