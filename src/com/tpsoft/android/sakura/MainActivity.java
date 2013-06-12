package com.tpsoft.android.sakura;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
//import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private Button btn1;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);   //  set No Title
        setContentView(R.layout.main);

        final Button btn = (Button) findViewById(R.id.btn0);
        btn.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,FoodRecommendActivity.class);
            	startActivity(intent);
				
			}
		});
        
        final Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent intent3 = new Intent(MainActivity.this,ContactActivity.class);
				startActivity(intent3);
			}
		});
        
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent1 = new Intent(MainActivity.this,FoodActivity.class);
				startActivity(intent1);
				
			}
		});
        
        
        
  
  
    
}

}
