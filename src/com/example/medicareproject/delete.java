package com.example.medicareproject;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class delete extends Activity{
	Regform b = new Regform(this, "Patient.db", null, 5);
	EditText editdelete;
	Button b1;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.delete);
		editdelete = (EditText)findViewById(R.id.e11);
		b1=(Button)findViewById(R.id.b1);
		b1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				//long id = 0;
				// TODO Auto-generated method stub
				deletefunc();
				
			}
		});
		
	}
public void deletefunc()
{
	SQLiteDatabase db = b.getReadableDatabase();
	db.delete(Regform.dtab, "_id=?", new String[]{editdelete.getText().toString()});
	Toast.makeText(getApplicationContext(), "Your Record deleted from Database", 100).show();
}
}
