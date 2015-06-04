package com.example.medicareproject;




import android.content.Context;
//import android.content.Intent;
//import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adap_com extends ArrayAdapter<String>{
	private final Context context;
	private final String[] as;
	//String disease="", symp="", home="",medi="";
	public Adap_com(Context context, String[] as) {
		super(context, R.layout.custom_com,as);
		// TODO Auto-generated constructor stub
		this.context=context;
		this.as=as;
		
	}
  public View getView(int position, View convertview, ViewGroup parent)	{
	  LayoutInflater inflate=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	  View rowview = inflate.inflate(R.layout.custom_com, parent,false);
	  TextView txt =(TextView)rowview.findViewById(R.id.textView1);
	  @SuppressWarnings("unused")
	ImageView img=(ImageView)rowview.findViewById(R.id.imageView1);
	  txt.setText(as[position]);
	  
	  String S=as[position];
	  if(S.equals("Cancer")){
		  img.setImageResource(R.drawable.c2);
	  }else if (S.equals("Asthma")) {
		  img.setImageResource(R.drawable.a1);
	  }	  
	  else if (S.equals("Diabetes")) {
		  img.setImageResource(R.drawable.diab);
	  }
	  else if (S.equals("Heart/Cardiovascular")) {
		  img.setImageResource(R.drawable.hrt);
	  } 
	  else if (S.equals("Rabies")) {
		  img.setImageResource(R.drawable.r1);
	  }	  	  
	  else if (S.equals("Dengue")) {
		  img.setImageResource(R.drawable.dengue);
	  }
	  else if (S.equals("Typhoid")) {
		  img.setImageResource(R.drawable.t2);
	  }
	  else if (S.equals("Measles")) {
		  img.setImageResource(R.drawable.m1);
	  }
	  
	  else if (S.equals("Cholera")) {
		  img.setImageResource(R.drawable.cholera);
	  }
	  else if (S.equals("Malaria")) {
		  img.setImageResource(R.drawable.ma1);
	  }
	  else if (S.equals("AIDS")) {
		  img.setImageResource(R.drawable.aids);
	  }
	  else if (S.equals("Tuberclosis")) {
		  img.setImageResource(R.drawable.tu1);
	  }
	  else if (S.equals("Sickle Cell Anaemia")) {
		  img.setImageResource(R.drawable.sc);
	  }
	  else if (S.equals("Chronic Kidney Disease")) {
		  img.setImageResource(R.drawable.ckd);
	  }
	  else if (S.equals("Hypertension")) {
		  img.setImageResource(R.drawable.ht);
	  }
	  else if (S.equals("Leukemia")) {
		  img.setImageResource(R.drawable.lk);
	  }
		
	
	
	  return rowview;
  }
}
