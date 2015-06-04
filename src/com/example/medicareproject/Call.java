package com.example.medicareproject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Call extends Activity 
{
    /** @author Y@@D */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call1);
        Button call = (Button)findViewById(R.id.btncall);
        call.setOnClickListener(new View.OnClickListener() 
        {
        	public void onClick(View v) 
        	{
        		EditText txt = (EditText)findViewById(R.id.txtnumber);
        		Uri uri=Uri.parse("tel:"+txt.getText().toString());
				Intent intent=new Intent(Intent.ACTION_CALL, uri);
				startActivity(intent);
        	}
        });
    }
}