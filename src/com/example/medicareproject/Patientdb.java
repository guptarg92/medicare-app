package com.example.medicareproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Patientdb extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regform);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	// TODO Auto-generated method stub
    	MenuInflater mi = getMenuInflater();
    	mi.inflate(R.menu.main, menu);
    	return super.onCreateOptionsMenu(menu);
    }
@Override
public boolean onOptionsItemSelected(MenuItem item) {
	// TODO Auto-generated method stub
	switch (item.getItemId()) {
	case R.id.insert:
		Intent i = new Intent(getApplicationContext(),insert.class);
		startActivity(i);
		break;
	case R.id.display:
		Intent i1 = new Intent(getApplicationContext(),display.class);
		startActivity(i1);
		break;
	case R.id.update:
		Intent i2 = new Intent(getApplicationContext(),update.class);
		startActivity(i2);
		break;
	case R.id.delete:
		Intent i3 = new Intent(getApplicationContext(),delete.class);
		startActivity(i3);
		break;
	case R.id.exit:
		Intent intent = new Intent(getBaseContext(), MainActivity.class);
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		intent.putExtra("EXIT", true);
		startActivity(intent);
		android.os.Process.killProcess(android.os.Process.myPid());
		super.onDestroy();
				break;
	
	
}
	return super.onOptionsItemSelected(item);
}
}