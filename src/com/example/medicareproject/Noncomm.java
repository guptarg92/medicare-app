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

public class Noncomm extends ListActivity {
	ListView lv1;
	   ArrayAdapter<CharSequence> adap;
	   String disease="", symp="", home="",medi="";
	   String [] value = {"Sickle Cell Anaemia","Chronic Kidney Disease","Hypertension","Leukemia"};
	   
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
		if(a1=="Sickle Cell Anaemia"){
			  disease="Sickle Cell Anaemia";
			  symp ="Dehydration,Irregular Heartbeat,Fatigue,Pale Skin";
			  home="Doctor Consultation";
			  medi="Hydroxyurea, Antibiotics";
			  Bundle bun=new Bundle();
				bun.putString("value1",disease);
				bun.putString("value2",symp);
				bun.putString("value3",home);
				bun.putString("value4",medi);
				
		Intent i= new Intent(Noncomm.this,Details4.class);
		i.putExtras(bun);
		startActivity(i);
		}
		if(a1=="Chronic Kidney Disease"){
			disease="Chronic Kidney Disease";
			  symp="Headaches,Trouble in Sleeping,Vomiting,Weight Loss";
			  home="Doctor Consultation";
			  medi="Diuretics, Vasodilators, Vitamin D, Erythropoietin";
			  Bundle bun=new Bundle();
				bun.putString("value1",disease);
				bun.putString("value2",symp);
				bun.putString("value3",home);
				bun.putString("value4",medi);
				
		Intent i= new Intent(Noncomm.this,Details4.class);
		i.putExtras(bun);
		startActivity(i);
		}
		if(a1=="Hypertension"){
			disease="Hypertension";
			  symp="Blurred Vision,Persistent Headache,Nosebleeds,Breathlessness";
			  home="Doctor Consultaion";
			  medi="Lozol, Dimox, Lasix, Bumex, Thalitone";
			  Bundle bun=new Bundle();
				bun.putString("value1",disease);
				bun.putString("value2",symp);
				bun.putString("value3",home);
				bun.putString("value4",medi);
				
		Intent i= new Intent(Noncomm.this,Details4.class);
		i.putExtras(bun);
		startActivity(i);
		}
		if(a1=="Leukemia"){
			  disease="Leukemia";
			  symp ="Unusual Bleeding,Frequent Infections,Pale Face,Tiredness";
	          home="Doctor Consulation";
			  medi="Cyclophosphamide, Vincristine, Prednisone";
			  Bundle bun=new Bundle();
				bun.putString("value1",disease);
				bun.putString("value2",symp);
				bun.putString("value3",home);
				bun.putString("value4",medi);
				
		Intent i= new Intent(Noncomm.this,Details4.class);
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




