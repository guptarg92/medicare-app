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

public class Infection4 extends ListActivity {
	   ListView lv1;
	   ArrayAdapter<CharSequence> adap;
	   String disease="", symp="", home="",medi="";
	   String [] value = {"Cholera","Malaria","AIDS","Tuberclosis"};
	   
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
		if(a1=="Cholera"){
			  disease="Cholera";
			  symp ="Loss of Skin Elasticity,Muscle Cramps,Low BP,Rapid Heart Rate";
			  home="Doctor Consultation";
			  medi="Doryx, Chloromycetin, Cipro, Oraxyl, Morgidox";
			  Bundle bun=new Bundle();
				bun.putString("value1",disease);
				bun.putString("value2",symp);
				bun.putString("value3",home);
				bun.putString("value4",medi);
				
		Intent i= new Intent(Infection4.this,Details4.class);
		i.putExtras(bun);
		startActivity(i);
		}
		if(a1=="Malaria"){
			disease="Malaria";
			  symp="High Fever,Chills & Sweating,Fatigue,Nausea and Vomiting";
			  home="Doctor Consultation";
			  medi="Avlocor, Lariam, Riamet, Daraprim, Malarone";
			  Bundle bun=new Bundle();
				bun.putString("value1",disease);
				bun.putString("value2",symp);
				bun.putString("value3",home);
				bun.putString("value4",medi);
				
		Intent i= new Intent(Infection4.this,Details4.class);
		i.putExtras(bun);
		startActivity(i);
		}
		if(a1=="AIDS"){
			disease="AIDS";
			  symp="Ulcers in Mouth,Fever and Chills,Rashes & Night Sweats";
			  home="Doctor Consultaion";
			  medi="Integrase Inhibitors, Fusion Inhibitor, NRTI's";
			  Bundle bun=new Bundle();
				bun.putString("value1",disease);
				bun.putString("value2",symp);
				bun.putString("value3",home);
				bun.putString("value4",medi);
				
		Intent i= new Intent(Infection4.this,Details4.class);
		i.putExtras(bun);
		startActivity(i);
		}
		if(a1=="Tuberclosis"){
			  disease="Tuberclosis";
			  symp ="Lack of apetite and weight loss,Uexplained pain";
	          home="Doctor Consulation";
			  medi="Isoniazid,Rifampin,Ethambutol,Pyrazinamide";
			  Bundle bun=new Bundle();
				bun.putString("value1",disease);
				bun.putString("value2",symp);
				bun.putString("value3",home);
				bun.putString("value4",medi);
				
		Intent i= new Intent(Infection4.this,Details4.class);
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



