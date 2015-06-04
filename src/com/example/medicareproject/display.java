package com.example.medicareproject;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class display extends Activity{
	
	Regform db1=new Regform(this, "Patient.db", null, 5);
	TextView tv;
	EditText edit;
	Button btn1;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.display);
		tv=(TextView)findViewById(R.id.textView1);
		edit=(EditText)findViewById(R.id.dob1);
		btn1=(Button)findViewById(R.id.displayrecord);
		btn1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Cursor cur=get();
				show(cur);
				
			}
		});
	}

	public Cursor get()
	{
		SQLiteDatabase db = db1.getReadableDatabase();
		Cursor cur=db.query(Regform.dtab, null, null, null, null, null, Regform.name+" ASC");
	    startManagingCursor(cur);
	    return cur;
	}
public Cursor show(Cursor cur)
{
	StringBuilder str = new StringBuilder();
	while(cur.moveToNext())
	{
		int id = cur.getInt(0);
		String uname=cur.getString(1);
		String phn=cur.getString(2);
		String expr=cur.getString(3);
		String dob=cur.getString(4);
		str.append("id: "+id+"\n"+"Name: "+uname+"\n"+"Phone No.: "+phn+"\n"+"Gender: "+expr+"\n"+"Date of Birth: "+dob);
	}
	tv.setText(str);
	return cur;
	}

}

