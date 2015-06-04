package com.example.medicareproject;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Common4 extends ListActivity {
	   ListView lv1;
	   ArrayAdapter<CharSequence> adap;
	   String disease="", symp="",medi="";
	   String [] value = {"Cancer","Heart/Cardiovascular","Asthma","Diabetes"};
	   
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setListAdapter(new Adap_com(this,value));
		}

		
		@Override
		protected void onListItemClick(ListView l, View v, int position, long id) {
			// TODO Auto-generated method stub
			super.onListItemClick(l, v, position, id);
		String a1=(String)getListAdapter().getItem(position);
		Toast.makeText(getApplicationContext(),a1,Toast.LENGTH_SHORT).show();
		if(a1=="Cancer"){
			  disease="Cancer";
			  symp ="Blood in Vomit and Urine,Chest Pain,Breathlessness";
			  
			  medi="Afinitor,Nexavar,Sutent,Velcade,Avastin,Herceptin";
			  Bundle bun=new Bundle();
				bun.putString("value1",disease);
				bun.putString("value2",symp);
				
				bun.putString("value4",medi);
				
		Intent i= new Intent(Common4.this,Details4.class);
		i.putExtras(bun);
		startActivity(i);
		}
		if(a1=="Heart/Cardiovascular"){
			disease="Heart/Cardiovascular";
			  symp="Heart Palpitations,Dizziness,Fatigue,Short of Breath";
			  
			  medi="ACE Inhibitors, Digoxin, Diuretics, Dlot Buster Drugs";
			  Bundle bun=new Bundle();
				bun.putString("value1",disease);
				bun.putString("value2",symp);
				
				bun.putString("value4",medi);
				
		Intent i= new Intent(Common4.this,Details4.class);
		i.putExtras(bun);
		startActivity(i);
		}
		if(a1=="Asthma"){
			disease="Asthma";
			  symp="Wheezing,Coughing,Shortness of Breath";
			  
			  medi="Inhalers, Theophylline, Corticosteroid Pills";
			  Bundle bun=new Bundle();
				bun.putString("value1",disease);
				bun.putString("value2",symp);
				
				bun.putString("value4",medi);
				
		Intent i= new Intent(Common4.this,Details4.class);
		i.putExtras(bun);
		startActivity(i);
		}
		if(a1=="Diabetes"){
			  disease="Diabetes";
			  symp ="Weakness and Tiredness,Fast Heartbeat,Dizziness";
	          
			  medi="Amaryl, Actos, Victoza,Prandin, Glucophage, Eucreas";
			  Bundle bun=new Bundle();
				bun.putString("value1",disease);
				bun.putString("value2",symp);
				
				bun.putString("value4",medi);
				
		Intent i= new Intent(Common4.this,Details4.class);
		i.putExtras(bun);
		startActivity(i);
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



