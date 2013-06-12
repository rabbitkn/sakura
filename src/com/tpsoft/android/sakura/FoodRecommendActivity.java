package com.tpsoft.android.sakura;


import android.app.Activity;
import android.app.AlertDialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
//import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

public class FoodRecommendActivity extends Activity{
	
	Integer[] arrImg = {
            R.drawable.aspara,
            R.drawable.buta_kimuchi,
            R.drawable.cheese_coroque,
            R.drawable.enoki_butter,
            R.drawable.hiyasi_ramen,
            R.drawable.kanikama_sasimi,
            R.drawable.katsu_curry,
            R.drawable.kimuchi,
            R.drawable.mabootofu,
            R.drawable.misonikomi_udon,
            R.drawable.okonomiyaki};
	
	   @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);   //  set No Title
	        setContentView(R.layout.food_recommend);
	        
	        
	        // listView1
            final ListView lstView1 = (ListView)findViewById(R.id.ListView1); 
                    
            lstView1.setAdapter(new ImageAdapter(this));
            
            lstView1.setOnItemClickListener(new OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                	String Detail = new String();
                	String URLimg = new String();
                	URLimg = "home.png";
                	switch (position) {
					case 0: 
						Detail = "ส่วนประกอบ เบคอน เห็ดเข็มทอง หน่อไม้ฝรั่ง";
						URLimg = "http://192.168.204.1/BookShop/img/aspara.png";
						break;
					case 1: 
						Detail = "ส่วนประกอบ หมู ผักกาดดอง";
						URLimg = "http://192.168.204.1/BookShop/img/buta-kimuchi.png";
						break;
					case 2: 
						Detail = "ส่วนประกอบ มันบด ชีส";
						URLimg = "http://192.168.204.1/BookShop/img/cheese-coroque.png";
						break;
					case 3: 
						Detail = "ส่วนประกอบ เห็ดเข็มทอง";
						URLimg = "http://192.168.204.1/BookShop/img/enoki-butter.png";
						break;
					case 4: 
						Detail = "ส่วนประกอบ เส้นราเมน ปูอัด ถั่วลันเตา แฮม ข้าวโพด วาซาบิ หน่อไม้ ";
						URLimg = "http://192.168.204.1/BookShop/img/hiyasi-ramen.png";
						break;
					case 5: 
						Detail = "ส่วนประกอบ ปูอัด วาซาบิ หัวไซเท้า แครอท";
						URLimg = "http://192.168.204.1/BookShop/img/kanikama-sasimi.png";
						break;
					case 6: 
						Detail = "ส่วนประกอบ ข้าว แกงกระหรี่ หมูทอด";
						URLimg = "http://192.168.204.1/BookShop/img/katsu-curry";
						break;
					case 7: 
						Detail = "ส่วนประกอบ ผัดกาดขาว ";
						URLimg = "http://192.168.204.1/BookShop/img/kimuchi";
						break;
					case 8: 
						Detail = "ส่วนประกอบ เต้าหู้ หมูสับ ";
						URLimg = "http://192.168.204.1/BookShop/img/mabootofu";
						break;
					case 9: 
						Detail = "ส่วนประกอบ กวางตุ้ง แครอท เห็ดเข็มทอง เห็ดหอม ผักกาดขาว ไข่ไก่ ";
						URLimg = "http://192.168.204.1/BookShop/img/misonikomi-udon";
						break;
					case 10: 
						Detail = "ส่วนประกอบ เบคอน กระหล่ำปลี เห็ดเข็มทอง ";
						URLimg = "http://192.168.204.1/BookShop/img/okonomiyaki";
						break;
					default:  Detail ="รายละเอียดอาหาร";
						break;
					}
                	
//                	Toast.makeText(FoodRecommendActivity.this,Detail,Toast.LENGTH_LONG).show();
                	AlertDialog.Builder builder = new AlertDialog.Builder(FoodRecommendActivity.this);    
                	builder.setTitle("รายละเอียด")
                	.setMessage(Detail)
                	.setPositiveButton("ตกลง", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							dialog.dismiss();
							
						}
					} );
                	
                	AlertDialog alert = builder.create();
                	alert.show();
//                	
//                	Intent inten2  = new Intent(FoodRecommendActivity.this,LoadImage.class);
//                	inten2.putExtra("URLimg", URLimg);
//                	startActivity(inten2);
                	
                }
                 
            });
                 
        }
        
        public class ImageAdapter extends BaseAdapter 
        {
            private Context context;
     
            public ImageAdapter(Context c) 
            {
                    // TODO Auto-generated method stub
                context = c;
            }
     
            public int getCount() {
                    // TODO Auto-generated method stub
                return arrImg.length;
            }
     
            public Object getItem(int position) {
                    // TODO Auto-generated method stub
                return position;
            }
     
            public long getItemId(int position) {
                    // TODO Auto-generated method stub
                return position;
            }

            public View getView(int position, View convertView, ViewGroup parent) {
                                   // TODO Auto-generated method stub
                                   
                                   LayoutInflater inflater = (LayoutInflater) context
                                                   .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                            
                                   if (convertView == null) {
                                           convertView = inflater.inflate(R.layout.food_recommend_column, null); 
                                   }
                                                   
                                   // ColImage
                                   ImageView imageView = (ImageView) convertView.findViewById(R.id.ColImage);
                                   imageView.getLayoutParams().height = 80;
                                   imageView.getLayoutParams().width = 100;
                                   imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                   imageView.setImageResource(arrImg[position]);
                                   
                                   // ColPosition
                                   TextView txtPosition = (TextView) convertView.findViewById(R.id.ColPosition);
                                   txtPosition.setPadding(10, 0, 0, 0);
                                   TextView txtPicName = (TextView) convertView.findViewById(R.id.ColPosition);
                                   txtPicName.setPadding(10, 0, 0, 0);

                                 
                                   switch (position) {
                                   		case 0:txtPicName.setText("Aspara Bacon\n เบคอนพันเห็ดเข็มทอง\n 100 ฿");
                                   		break;
                                   		case 1:txtPicName.setText("Buta Kimchi\n หมูผัดกิมจิ\n 80 ฿");
                                   		break;
                                   		case 2:txtPicName.setText("Koroge cheese\n มันบดทอดไส้ชีส\n 140 ฿");
                                   		break;
                                   		case 3:txtPicName.setText("Enuki Butter\n เห็ดเข็มทองผัดเนย\n 80 ฿");
                                   		break;
                                   		case 4:txtPicName.setText("Hiyashi Ramen\n หมี่เย็นทรงเครื่อง\n 80 ฿");
                                   		break;
                                   		case 5:txtPicName.setText("Kanikama Sashimi\n ซาซิมิปูอัด\n 70 ฿");
                                   		break;
                                   		case 6:txtPicName.setText("Katsu Curry\n ข้าวแกงกระหรี่หมูทอด\n 100 ฿");
                                   		break;
                                   		case 7:txtPicName.setText("Kimchi\n ผัดกาดดอง\n 50 ฿");
                                   		break;
                                   		case 8:txtPicName.setText("Maboo Tofu\n เต้าหู้ทรงเครื่อง\n 80 ฿");
                                   		break;
                                   		case 9:txtPicName.setText("Misonikomi Udon\n สุกี้(หมู เนื้อ ทะเล)\n 180 ฿");
                                   		break;
                                   		case 10:txtPicName.setText("Okonomi yaki\n พิชซ่าญี่ปุ่น\n 120 ฿");
                                   		break;
                                 
                                   		default:  txtPicName.setText("Food");
                                   		break;
                                   }
                                   
                                   return convertView;
                                           
                           }

               } 

	   
//	   @Override
//	    public boolean onCreateOptionsMenu(Menu menu) {
//	        getMenuInflater().inflate(R.menu.main, menu);
//	        return true;
//	    }
}
