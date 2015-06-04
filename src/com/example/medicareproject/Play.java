package com.example.medicareproject;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
 
public class Play extends Activity {
   private VideoView mVideoView;
 
   @Override
   public void onCreate(Bundle icicle) {
     super.onCreate(icicle);
     setContentView(R.layout.video);
     mVideoView = (VideoView) findViewById(R.id.videoView1);
     mVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.video));
     mVideoView.setMediaController(new MediaController(this));
     mVideoView.requestFocus();
   }
}
