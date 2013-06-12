package com.tpsoft.android.sakura;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import android.widget.Toast;

public class LoadImage extends Activity {
	
	private Context context;
	private ImageView image;
	private String imageURL;
	private ProgressDialog progressDialog;
	@SuppressLint("HandlerLeak")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.image_view);
		
		// Context
		context = this;
		
		// View matching 
		image = (ImageView) findViewById(R.id.main_image);
		
		// check
		Bundle bundle = getIntent().getExtras();
		if( bundle == null){
			Toast.makeText(context, "No any data",Toast.LENGTH_SHORT).show();
		}
		
		// Define image URL
		String URLimg = bundle.getString("URLimg");
		imageURL = URLimg;
		
		// Define Progress Dialog
		progressDialog = new ProgressDialog(context);
		progressDialog.setMessage("กำลังโหลดรูปภาพ...");
		
		
	   // Method 2 - Using Thread & Handler
		final Handler handler = new Handler(){
			@Override
			public void handleMessage(Message msg) {
				switch (msg.what) {
				case 0: 
					progressDialog.dismiss(); 
					Toast.makeText(context, "ไม่สามารถโหลดรูปภาพได้",Toast.LENGTH_SHORT).show(); 
					break;
				case 1:
						progressDialog.dismiss(); 
						Toast.makeText(context, "โหลดรูปภาพสำเร็จ", Toast.LENGTH_SHORT).show();
						image.setImageBitmap((Bitmap) msg.obj);
					break;
				}
				super.handleMessage(msg);
			}
			
		};
		Thread thread = new Thread(){
			 @Override
			public void run() {
				 URL url;
				 Message message = new Message();
					try { 
						url = new URL(imageURL);
						Bitmap bitmap = BitmapFactory.decodeStream(url.openStream());
						message.what = 1;
						message.obj = bitmap;
						handler.sendMessage(message);
					} catch (MalformedURLException e) {
						e.printStackTrace();
						message.what =0 ;
						handler.sendMessage(message);
					} catch (IOException e) {
						message.what =0 ;
						handler.sendMessage(message);
						e.printStackTrace();
					}
				
			}
		};
		progressDialog.show();
		thread.start();
	}



}
