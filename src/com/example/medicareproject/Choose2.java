package com.example.medicareproject;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Choose2 extends Activity implements OnClickListener{
	TextView tv1,tv2,tv3,tv4;
	ImageButton ib1,ib2,ib3,ib4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.choose2);
		tv1=(TextView)findViewById(R.id.textView1);
		tv2=(TextView)findViewById(R.id.loc);
		tv3=(TextView)findViewById(R.id.disease);
        tv4=(TextView)findViewById(R.id.dis);
		
		ib1=(ImageButton)findViewById(R.id.imageButton1);
		ib4=(ImageButton)findViewById(R.id.imageButton4);
		ib2=(ImageButton)findViewById(R.id.imageButton2);
		ib3=(ImageButton)findViewById(R.id.imageButton3);
		ib1.setOnClickListener(this);
		ib2.setOnClickListener(this);
		ib3.setOnClickListener(this);
		ib4.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	  switch (v.getId()) {
	case R.id.imageButton1:
		Intent i= new Intent(Choose2.this,Common4.class);
		startActivity(i);
		
		break;
	case R.id.imageButton2:
		Intent i1= new Intent(Choose2.this,Infection4.class);
		startActivity(i1);
		break;
	case R.id.imageButton3:
		Intent i2= new Intent(Choose2.this,Comm.class);
		startActivity(i2);
		break;
	case R.id.imageButton4:
		Intent i3= new Intent(Choose2.this,Noncomm.class);
		startActivity(i3);
		break;
	default:
		break;
	}	
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
@Override
public boolean onOptionsItemSelected(MenuItem item) {

	// TODO Auto-generated method stub
	/*switch (item.getItemId()) {
	case R.id.Back:
				
        //AlertDialog.Builder alertdialog2=new AlertDialog.Builder(this);
        //alertdialog2.setTitle("Alert dialogue");
        //alertdialog2.setIcon(R.drawable.ic_launcher);
        //alertdialog2.setMessage("Are you sure want to exit from the application??");
        //alertdialog2.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
        	//@Override
			//public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
			 finish();	
			//}
        //}
        //);
        //alertdialog2.setNegativeButton("Cancel",new DialogInterface.OnClickListener() {
			
			//@Override
			//public void onClick(DialogInterface dialog, int arg1) {
				// TODO Auto-generated method stub
				//dialog.cancel();
		//	}
		//} );
		break;

	default:
		break;
	}*/
	return super.onOptionsItemSelected(item);
}
   


}