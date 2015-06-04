package com.example.medicareproject;


import java.util.Timer;
import java.util.TimerTask;



import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity  {
	public int currentImageIndex=0;
	Timer timer;
	TimerTask tim;
	ImageView img;
	protected boolean active=true;
	protected int splashtime=3000;
	MainActivity thisobj;
	private int[]img_ids={R.drawable.medicare21, R.drawable.medicare1,R.drawable.hrt1};
	
	@SuppressWarnings("unused")
	private static final String LogCat=null;
	MediaPlayer mp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	    
		final Handler hand=new Handler();
		final Runnable mupdatesResults=new Runnable() {
			
		
			@Override
			public void run() {
				// TODO Auto-generated method stub
			animatedSlideshow();	
			}

			
		};
		int delay=1000;
		int period=8000;
		Timer timer=new Timer();
		timer.scheduleAtFixedRate(new TimerTask(){
			public void run(){
			hand.post(mupdatesResults);
		}
			
		},delay,period);	
		mp = MediaPlayer.create(getBaseContext(), R.raw.bgmusic);
		mp.start(); 
		
		thisobj=this;
		Thread splashThread = new Thread(){
		public void run(){
			try{
				int waited=0;
				while(active && (waited<splashtime))
				{
					sleep(500);
					if (active){
						waited += 100;}}}
			catch(InterruptedException e){}
			finally{ 
				Intent i= new Intent(MainActivity.this,Choose2.class);
			    startActivity(i);
					}
				}
			};
			splashThread.start();
			
		}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		mp.release();
		finish();
		}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
		
	private void animatedSlideshow() {
		// TODO Auto-generated method stub
	img=(ImageView)findViewById(R.id.imageView1);
	img.setImageResource(img_ids[currentImageIndex%img_ids.length]);
	currentImageIndex ++;
	Animation rotateimg=AnimationUtils.loadAnimation(this, R.anim.custom);
	img.startAnimation(rotateimg);
	}

	

}


