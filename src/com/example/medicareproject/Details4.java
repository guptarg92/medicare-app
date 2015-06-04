package com.example.medicareproject;

import android.app.Activity;
import android.content.Intent;
//import android.app.AlertDialog;
//import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Details4 extends Activity implements OnClickListener{
	String value1="",value2="",value3="",value4="";
	TextView tv1,tv2,tv4;
	ImageButton img;
 @Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.detail);
	tv1=(TextView)findViewById(R.id.textView1);
	tv2=(TextView)findViewById(R.id.disease);
	img=(ImageButton)findViewById(R.id.imageButton1);
	img.setOnClickListener(this);
	tv4=(TextView)findViewById(R.id.em);
	Bundle bun=getIntent().getExtras();
	value1=bun.getString("value1");
	value2=bun.getString("value2");
	
	value4=bun.getString("value4");
	tv1.setText(value1);
	tv2.setText(value2);
	
	tv4.setText(value4);
	
	
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
	//switch (item.getItemId()) {
	//case R.id.Back:
				
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
		//break;

	//default:
		//break;
	
	return super.onOptionsItemSelected(item);
}
@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	Intent i=new Intent(Details4.this,MedicareDbAdapter.class );
    startActivity(i);

}

}
