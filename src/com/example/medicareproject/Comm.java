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

public class Comm extends ListActivity {
	ListView lv1;
	   ArrayAdapter<CharSequence> adap;
	   String disease="", symp="", home="",medi="";
	   String [] value = {"Dengue","Rabies","Typhoid","Measles"};
	   
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
		if(a1=="Dengue"){
			  disease="Dengue";
			  symp ="Severe Headache,Muscular Pain,Nausea & Vomiting";
			  home="Doctor Consultation";
			  medi="Paracetamol, Acetaminophen";
			  Bundle bun=new Bundle();
				bun.putString("value1",disease);
				bun.putString("value2",symp);
				bun.putString("value3",home);
				bun.putString("value4",medi);
				
		Intent i= new Intent(Comm.this,Details4.class);
		i.putExtras(bun);
		startActivity(i);
		}
		if(a1=="Rabies"){
			disease="Rabies";
			  symp="Convulsions,Restlessness,Excitability,Numbness";
			  home="Doctor Consultation";
			  medi="Rabies Vaccine";
			  Bundle bun=new Bundle();
				bun.putString("value1",disease);
				bun.putString("value2",symp);
				bun.putString("value3",home);
				bun.putString("value4",medi);
				
		Intent i= new Intent(Comm.this,Details4.class);
		i.putExtras(bun);
		startActivity(i);
		}
		if(a1=="Typhoid"){
			disease="Typhoid";
			  symp="Dry Cough,Swollen Abdomen,Skin Rashes,Physical Exhaustion";
			  home="Doctor Consultaion";
			  medi="Claforan, Vivotif, Typherix, Ciprofloxacin";
			  Bundle bun=new Bundle();
				bun.putString("value1",disease);
				bun.putString("value2",symp);
				bun.putString("value3",home);
				bun.putString("value4",medi);
				
		Intent i= new Intent(Comm.this,Details4.class);
		i.putExtras(bun);
		startActivity(i);
		}
		if(a1=="Measles"){
			  disease="Measles";
			  symp ="Aches & Pain, Red Eyes,Sensitivity to Light";
	          home="Doctor Consulation";
			  medi="Ibuprofen, Priorix, Paracetamol";
			  Bundle bun=new Bundle();
				bun.putString("value1",disease);
				bun.putString("value2",symp);
				bun.putString("value3",home);
				bun.putString("value4",medi);
				
		Intent i= new Intent(Comm.this,Details4.class);
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



