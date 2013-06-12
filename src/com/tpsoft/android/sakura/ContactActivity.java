package com.tpsoft.android.sakura;


import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;

import android.widget.ImageView;


public class ContactActivity  extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);   //  set No Title
        setContentView(R.layout.contact);
        final ImageView imgfb = (ImageView) findViewById(R.id.imageFabook);
        imgfb.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				facebook();
				
			}
		});

        final ImageView imgCall = (ImageView) findViewById(R.id.imageCall);
       	imgCall.setOnClickListener(new OnClickListener() {
       		public void onClick(View v) {
			call();	
       		}
       });
        
    }

    private void call() {
        try {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:022820303"));
            startActivity(callIntent);
        } catch (ActivityNotFoundException activityException) {
             Log.e("helloandroid dialing example", "ไม่สามารถโทรได้");
        }
    }
    
    private void facebook(){
    	try {
    		Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/pages/SakuraHouse/113766405370896"));
    		startActivity(viewIntent);  
			
		} catch (ActivityNotFoundException activiException) {
			Log.e("Hello Sakrua House","ไม่สามารถเชื่อมต่อได้");
		}
    	
  }

}

