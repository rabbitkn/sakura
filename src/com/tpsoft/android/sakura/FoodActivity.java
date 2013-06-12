package com.tpsoft.android.sakura;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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

public class FoodActivity extends Activity{
	
	Integer[] arrImg = {
            R.drawable.aspara,
            R.drawable.avogado,
            R.drawable.buta_kimuchi,
            R.drawable.chahan,
            R.drawable.chasyuu_men,
            R.drawable.chasyuu_salad,
            R.drawable.cheese_coroque,
            R.drawable.chuuka_don,
            R.drawable.chuuka_wakame,
            R.drawable.curry_udon,
            R.drawable.curryrice,
            R.drawable.ebi_chahan,
            R.drawable.ebi_chill,
            R.drawable.ebi_fried,
            R.drawable.ebi_tenpura,
            R.drawable.ebi_yakisoba,
            R.drawable.enoki_butter,
            R.drawable.garlic_chahan,
            R.drawable.gomoku_chahan,
            R.drawable.gomoku_ramen,
            R.drawable.gomoku_yakisoba,
            R.drawable.gyoza,
            R.drawable.gyuudon,
            R.drawable.harumaki,
            R.drawable.hiyasi_ramen,
            R.drawable.hiyayakko,
            R.drawable.kaki_furai,
            R.drawable.kakiage,
            R.drawable.kanikam_tenshindon,
            R.drawable.kanikama_chahan,
            R.drawable.kanikama_salad,
            R.drawable.kanikama_sasimi,
            R.drawable.kata_yakisoba,
            R.drawable.katsu_curry,
            R.drawable.katsudon,
            R.drawable.kimuchi,
            R.drawable.lebanira_itame,
            R.drawable.maboo_don,
            R.drawable.mabootofu,
            R.drawable.miso_ramen,
            R.drawable.misonikomi_udon,
            R.drawable.moyashi_itame,
            R.drawable.niku_nira,
            R.drawable.nikumiso_itame,
            R.drawable.nikuyasai_itame,
            R.drawable.okonomiyaki,
            R.drawable.okura_natto,
            R.drawable.omu_raice,
            R.drawable.oyako_don,
            R.drawable.potato,
            R.drawable.salom_salad,
            R.drawable.seafood_ramen,
            R.drawable.shiitake_ramen,
            R.drawable.shio_butter_ramen,
            R.drawable.shio_ramen,
            R.drawable.subuta,
            R.drawable.syouga_yaki,
            R.drawable.takoyaki,
            R.drawable.tamagodon,
            R.drawable.tendon,
            R.drawable.tenpura_ramen,
            R.drawable.tenpura_soba,
            R.drawable.tenpura_udon,
            R.drawable.tenshin_don,
            R.drawable.tonkatsu_ramen,
            R.drawable.tonkatsu,
            R.drawable.tonkotsu_sioramen,
            R.drawable.tori_karaage,
            R.drawable.unagi_don,
            R.drawable.unagi_yaki,
            R.drawable.wakame_ramen,
            R.drawable.wantan_ramen,
            R.drawable.yakisoba,
            R.drawable.yasai_coloque,
            R.drawable.yasai_itame,
            R.drawable.yasai_salad,
            R.drawable.yasai_tenpura,
            R.drawable.zaru_soba};
	
	   @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);   //  set No Title
	        setContentView(R.layout.food);
	        
	        
	        // listView1
            final ListView lstView1 = (ListView)findViewById(R.id.ListView1); 
                    
            lstView1.setAdapter(new ImageAdapter(this));
            
            lstView1.setOnItemClickListener(new OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                	String Detail = new String();
                	String URLimg = new String();
                	String Name = new String();
                	URLimg = "home.png";
                	Name = "name";
                	switch (position) {
					case 0: 
						Name = "Aspara Bacon";
						Detail = "ส่วนประกอบ เบคอน เห็ดเข็มทอง หน่อไม้ฝรั่ง";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/aspara.png";
						break;
					case 1: 
						Name = "Avocado Salad";
						Detail = "ส่วนประกอบ อโวคาโด้ กระหล่ำปลี";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/avogado.png";
						break;
					case 2: 
						Name = "Buta Kimuchi";
						Detail = "ส่วนประกอบ หมู กิมจิ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/buta-kimchi.png";
						break;
					case 3: 
						Name = "Chahan";
						Detail = "ส่วนประกอบ หมู ข้าว ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/chahan.png";
						break;
					case 4: 
						Name = "Chasyuu Ramen";
						Detail = "ส่วนประกอบ หมูชาชู เส้นราเมน ผักกวางตุ้ง";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/chasyuu-men.png";
						break;
					case 5: 
						Name = "Chasyuu Salad";
						Detail = "ส่วนประกอบ สลัดหมูตุ๋น";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/chasyuu-salad.png";
						break;
					case 6: 
						Name = "Cheese Coroque";
						Detail = "ส่วนประกอบ มันบด ชีส";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/.cheese-coroque.png";
						break;
					case 7: 
						Name = "Chuuka Don";
						Detail = "ส่วนประกอบ ข้าว หมู ปลาหมึก กุ้ง";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/chuuka-don.png";
						break;
					case 8: 
						Name = "Chuuka wakame";
						Detail = "ส่วนประกอบ สาหร่าย";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/chuuka-wakame.png";
						break;
					case 9: 
						Name = "Curry Udon";
						Detail = "ส่วนประกอบ แกงกระหรี่ เส้นอุด้ง";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/curry-udon.png";
						break;
					case 10: 
						Name = "Curyy Rice";
						Detail = "ส่วนประกอบ สาหร่าย";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/curryrice.png";
						break;
					case 11: 
						Name = "Ebi Chahan";
						Detail = "ส่วนประกอบ กุ้ง ข้าว ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/ebi-chahan.png";
						break;
					case 12: 
						Name = "Ebi Chill";
						Detail = "ส่วนประกอบ กุ้ง ซอสมะเขือเทศ ข้าวโพดอ่อน ถั่วลันเตา";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/ebi-chill.png";
						break;
					case 13: 
						Name = "Ebi Fried";
						Detail = "ส่วนประกอบ กุ้ง กระหล่ำปลี";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/ebi-fried.png";
						break;
					case 14: 
						Name = "Ebi Tenpura";
						Detail = "ส่วนประกอบ กุ้ง 3 ตัว ผัก 1 ชิ้น";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/ebi-tenpura.png";
						break;
					case 15: 
						Name = "Ebi Yakisoba";
						Detail = "ส่วนประกอบ กุ้ง เส้นยากิโซบะ ผักกระหล่ำปลี ข้าวโพดอ่อน ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/ebi-yakisoba.png";
						break;
					case 16: 
						Name = "Enoki Butter";
						Detail = "ส่วนประกอบ เห็ดเข็มทอง เนย";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/enoki-butter.png";
						break;
					case 17: 
						Name = "Nininku Chahan";
						Detail = "ส่วนประกอบ กระเทียม ข้าว ถั่วลันเตา";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/grlic-chahan.png";
						break;
					case 18: 
						Name = "Gomoku Chahan";
						Detail = "ส่วนประกอบ หมู ปลาหมึก กุ้ง ข้าว ถั่วลันเตา ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/gomoku-chahan.png";
						break;
					case 19: 
						Name = "Gomoku Ramen";
						Detail = "ส่วนประกอบ หมู ปลาหมึก กุ้ง เส้นราเมน";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/gomoku-ramen.png";
						break;
					case 20: 
						Name = "Gomoku Yakisoba";
						Detail = "ส่วนประกอบ หมู ปลาหมึก กุ้ง";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/gomoku-yakisoba.png";
						break;
					case 21: 
						Name = "Gyoza";
						Detail = "ส่วนประกอบ หมู";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/gyoza.png";
						break;
					case 22: 
						Name = "Gyuu Don";
						Detail = "ส่วนประกอบ เนื้อ เส้นบุก ข้าว หอมหัวใหญ่ ถัวลันเตา";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/gyuudon.png";
						break;
					case 23: 
						Name = "Harumaki";
						Detail = "ส่วนประกอบ หมู";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/harumaki.png";
						break;
					case 24: 
						Name = "Hiyashi Ramen";
						Detail = "ส่วนประกอบ เส้นราเมน ข้าวโพด แครอท แฮม วาซาบิ ถั่วลันเตา ปูอัด";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/hiyasi-ramen.png";
						break;
					case 25: 
						Name = "Hiyayako";
						Detail = "ส่วนประกอบ เต้าหู้";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/hiyayako.png";
						break;
					case 26: 
						Name = "Kaki Furai";
						Detail = "ส่วนประกอบ หอยนางรม";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/kaki-furai.png";
						break;
					case 27: 
						Name = "kakiage";
						Detail = "ส่วนประกอบ ผักทอด ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/kakiage.png";
						break;
					case 28: 
						Name = "Kanikama Tenshindon";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/kankkama-tenshindon.png";
						break;
					case 29: 
						Name = "Kanikama Chahan";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/kanikama-chahan.png";
						break;
					case 30: 
						Name = "Kanikama Salad";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/kanikama-salad.png";
						break;
					case 31: 
						Name = "Kanikama Sashimi";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/kanikama-sasimi.png";
						break;
					case 32: 
						Name = "Kata Yakisoba";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/kata-yakisoba.png";
						break;
					case 33: 
						Name = "Katsu Curry";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/katsu-curry.png";
						break;
					case 34: 
						Name = "Katsu Don";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/katsudon.png";
						break;
					case 35: 
						Name = "Kimuchi";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/kimuchi.png";
						break;
					case 36: 
						Name = "Labanira Itame";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/lebanira-itame.png";
						break;
					case 37: 
						Name = "Maboo Don";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/maboo-don.png";
						break;
					case 38: 
						Name = "Maboo Tofu";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/mabotofu.png";
						break;
					case 39: 
						Name = "Miso Ramen";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/miso-Ramen.png";
						break;
					case 40: 
						Name = "Misonikoi Udon";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/misonikomi-udon.png";
						break;
					case 41: 
						Name = "Moyashi Itame";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/moyashi-itame.png";
						break;
					case 42: 
						Name = "Niku nira Itame";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/niku-nira.png";
						break;
					case 43: 
						Name = "Niku Miso Itame";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/nikumiso-itame.png";
						break;
					case 44: 
						Name = "Niku Yasai Itame";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/nikuyasai-itame.png";
						break;
						
					case 45: 
						Name = "Okomomiyaki";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/okonomiyaki.png";
						break;
					case 46: 
						Name = "Okura Natto";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/okura-natto.png";
						break;
					case 47: 
						Name = "Omu Rice";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/omu-raice.png";
						break;
					case 48: 
						Name = "Oyako Don";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/oyako-don.png";
						break;
					case 49: 
						Name = "Potato";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/potato.png";
						break;	
					case 50: 
						Name = "Salmon Sald";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/salom-salad.png";
						break;
					case 51: 
						Name = "Seafood Ramen";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/seafood-ramen.png";
						break;
					case 52: 
						Name = "Shitake Ramen";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/shiitake-ramen.png";
						break;
					case 53: 
						Name = "Shio Butter Ramen";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/shio-buttdr-ramen.png";
						break;
					case 54: 
						Name = "Shio Ramen";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/shio-ramen.png";
						break;
					case 55: 
						Name = "subuta";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/subuta.png";
						break;
					case 56: 
						Name = "syouga yaki";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/syouga-yaki.png";
						break;
					case 57: 
						Name = "Tako Yaki";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/takoyaki.png";
						break;
					case 58: 
						Name = "Tammago Don";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/tamagodon.png";
						break;
					case 59: 
						Name = "Ten Don";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/tendon.png";
						break;	
						
					case 60: 
						Name = "Tempura Ramen";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/tenpura-ramen.png";
						break;
					case 61: 
						Name = "Tenpura Soba";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/tenpura-soba.png";
						break;
					case 62: 
						Name = "Tenpura Udon";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/tenpura-udon.png";
						break;
					case 63: 
						Name = "Tenshin Don";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/tenshin-don.png";
						break;
					case 64: 
						Name = "Tonkatsu Ramen";
						Detail = "ส่วนประกอบ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/tonkatsu-ramen.png";
						break;
					case 65:
						Name = "Tonkotsu";
						Detail = "ส่วนประกอบ หมูชุบเกร็ดขนมปังทอด";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/tonkatsu.png";
						break;
					case 66: 
						Name = "Tonkotsu sioramen";
						Detail = "ส่วนประกอบ หมูชาชู ไข่ต้ม กระเทียมเจียว ผัดกาดดอง ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/tonkotsu-sioramen.png";
						break;
					case 67: 
						Name = "Tori karaage";
						Detail = "ไก่ทอดคาราเกะ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/tori-karaage.png";
						break;
					case 68:
						Name = "Unaki Don";
						Detail = "ส่วนประกอบ ปลาไหลย่าง ข้าว  ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/uanki-don.png";
						break;
					case 69: 
						Name = "Unaki Yaki";
						Detail = "ส่วนประกอบ ปลาไหลย่าง ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/unaki-yaki.png";
						break;
						
					case 70: 
						Name = "Wakame Ramen";
						Detail = "ส่วนประกอบ เส้นราเมน สาหร่าย หมูชาชู ผักกวางตุ้ง ไข่ต้ม  ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/wakame-ramen.png";
						break;
					case 71: 
						Name = "Wantan Ramen";
						Detail = "ส่วนประกอบ เกี๋ยว เส้นราเมน ผักกวางตุ้ง  ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/wantan-ramen.png";
						break;
					case 72: 
						Name = "Yakisoba";
						Detail = "ส่วนประกอบ ปลาหมึก เส้น กระหล่ำปลี แครอท ถั่วงอก ขิงแดง กุ๋ยฉ่าย หอมหัวใหญ่ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/yakisoba.png";
						break;
					case 73: 
						Name = "Yasai Coloque";
						Detail = "ส่วนประกอบ มนบด หมู ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/yasai-coloque.png";
						break;
					case 74: 
						Name = "Yasai Itame";
						Detail = "ส่วนประกอบ กระหล่ำปลี กุ๋ยฉ่าย แครอท หอมหัวใหญ่ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/yasai-itame.png";
						break;
					case 75: 
						Name = "Yasai Salad";
						Detail = "ส่วนประกอบ หอมหัวใหญ่ พริกหวาน กระหล่ำปลี แครอท  ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/yasai-salad.png";
						break;
					case 76: 
						Name = "Yasai Tempura";
						Detail = "ส่วนประกอบ เผือก มัน ฟัก ทอง พริกหวาน หอมหัวใหญ่ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/yasai-tenpura.png";
						break;
					case 77: 
						Name = "Zaru Soba";
						Detail = "ส่วนประกอบ เส้นโซบะ วาซาบิ น้ำซอสโซบะ ";
						URLimg = "http://www.ipostdo.com/sakurahouse/sakura_images/zaru-soba.png";
						break;
						
					default:  Detail ="รายละเอียดอาหาร";
						break;
					}
                	

                	
                	Intent inten2  = new Intent(FoodActivity.this,LoadImage.class);
                	inten2.putExtra("URLimg", URLimg);
                	startActivity(inten2);
                	
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
                                   		case 1:txtPicName.setText("Avocado Salad\n สลัดอโวคาโด้\n 90 ฿");
                                   		break;
                                   		case 2:txtPicName.setText("Buta Kimchi\n หมูผัดกิมจิ\n 80 ฿");
                                   		break;
                                   		case 3:txtPicName.setText("Chahan\n ข้าวผัดหมู\n 60 ฿");
                                   		break;
                                   		case 4:txtPicName.setText("Chasyuu_men\n ราเมนหน้าหมูตุ๋น\n 80 ฿");
                                   		break;
                                   		case 5:txtPicName.setText("Chasyuu Sald\n สลัดหมูตุ๋น\n 100 ฿");
                                   		break;
                                   		case 6:txtPicName.setText("Koroge cheese\n มันบดทอดไส้ชีส\n 140 ฿");
                                   		break;
                                   		case 7:txtPicName.setText("Chuuka_don\n ข้าวหน้ารวม\n 80 ฿");
                                   		break;
                                   		case 8:txtPicName.setText("Chuuka wakame\n ยำสาหร่าย\n 60 ฿");
                                   		break;
                                   		case 9:txtPicName.setText("Curry Udon\n แกงกระหรี่อุด้ง\n 100 ฿");
                                   		break;
                                   		case 10:txtPicName.setText("Curry Rice\n ข้าวแกงกระหรี่\n 80 ฿");
                                   		break;
                                   		case 11:txtPicName.setText("Ebi Chahan\n ข้าวผัดกุ้ง\n 70 ฿");
                                   		break;
                                   		case 12:txtPicName.setText("Ebi Chill\n กุ้งผัดซอส\n 80 ฿");
                                   		break;
                                   		case 13:txtPicName.setText("Ebi Fried\n กุ้งชุบเกล็ดขนมปังทอด\n 90 ฿");
                                   		break;
                                   		case 14:txtPicName.setText("Ebi Tempura\n กุ้งทอดเทมปุระ\n 70 ฿");
                                   		break;
                                   		case 15:txtPicName.setText("Ebi Yakisoba\n กุ้งผัดเส้น\n 90 ฿");
                                   		break;
                                   		case 16:txtPicName.setText("Enuki Butter\n เห็ดเข็มทองผัดเนย\n 80 ฿");
                                   		break;
                                   		case 17:txtPicName.setText("Nininku Chahan\n ข้าวผัดกระเทียม\n 60 ฿");
                                   		break;
                                   		case 18:txtPicName.setText("Gomoku Chahan\n ข้าวผัดรวม\n 140 ฿");
                                   		break;
                                   		case 19:txtPicName.setText("Gomoku Ramen\n ราเมนรวม\n 90 ฿");
                                   		break;
                                   		case 20:txtPicName.setText("Gomoku Yakisoba\n หมู ปลาหมึก กุ้ง ผัดเส้น\n 90 ฿");
                                   		break;
                                   		case 21:txtPicName.setText("Gyoza\n เกี้ยวซ่า\n 60 ฿");
                                   		break;
                                   		case 22:txtPicName.setText("Gyuu Don\n ข้าวหน้าเนื้อ\n 100 ฿");
                                   		break;
                                   		case 23:txtPicName.setText("Harumaki\n เปาะเปี้ยทอด\n 60 ฿");
                                   		break;
                                   		case 24:txtPicName.setText("Hiyashi Ramen\n หมี่เย็นทรงเครื่อง\n 80 ฿");
                                   		break;
                                   		case 25:txtPicName.setText("Hiyayako\n เต้าหู้เย็น\n 40 ฿");
                                   		break;
                                   		case 26:txtPicName.setText("Kaki Furai\n หอยทอด\n 70 ฿");
                                   		break;
                                   		case 27:txtPicName.setText("Kakiage\n ผัดฝอยทอดแป้งเทมปุระ\n 70 ฿");
                                   		break;
                                   		case 28:txtPicName.setText("Kanikama Tenshindon\n ข้าวหน้าไข่เจียวปูอัด\n 140 ฿");
                                   		break;
                                   		case 29:txtPicName.setText("Kanikama Chahan\n ข้าวผัดปูอัด\n 60 ฿");
                                   		break;
                                   		case 30:txtPicName.setText("Kanikama Salad\n สลัดปูอัด\n 70 ฿");
                                   		break;
                                   		case 31:txtPicName.setText("Kanikama Sashimi\n ซาซิมิปูอัด\n 70 ฿");
                                   		break;
                                   		case 32:txtPicName.setText("Kata Yakisoba\n ราดหน้าหมี่กรอบ\n 90 ฿");
                                   		break;
                                   		case 33:txtPicName.setText("Katsu Curry\n ข้าวแกงกระหรี่หมูทอด\n 100 ฿");
                                   		break;
                                   		case 34:txtPicName.setText("Katsu Don\n ข้าวหน้าหมูทอด\n 80 ฿");
                                   		break;
                                   		case 35:txtPicName.setText("Kimuchi\n ผัดกาดขาวดอง\n 90 ฿");
                                   		break;
                                   		case 36:txtPicName.setText("Leba Nira\n ผัดตับใส่กุ๋ยฉ่าย\n 70 ฿");
                                   		break;
                                   		case 37:txtPicName.setText("Maboo Don\n ข้าวหน้าเต้าหู้\n 70 ฿");
                                   		break;
                                   		case 38:txtPicName.setText("Maboo Tofu\n เต้าหู้ทรงเครื่อง\n 80 ฿");
                                   		break;
                                   		case 39:txtPicName.setText("Miso Ramen\n ราเมนเต้าเจี้ยว\n 80 ฿");
                                   		break;
                                   		case 40:txtPicName.setText("Misonikomi Udon\n สุกี้ญี่ปุ่น\n 160 ฿");
                                   		break;
                                   		case 41:txtPicName.setText("Moayshi Itame\n ผัดถั่วงอก\n 60 ฿");
                                   		break;
                                   		case 42:txtPicName.setText("Niku Nira Itame\n ผัดหมูใส่กุ๋ยฉ่าย\n 70 ฿");
                                   		break;
                                   		case 43:txtPicName.setText("Niku Miso Itame\n ผัดหมูใส่มิโซ๊ะ\n 60 ฿");
                                   		break;
                                   		case 44:txtPicName.setText("Niku Yasai Itame\n ผัดผัดใส่หมู\n 70 ฿");
                                   		break;
                                   		case 45:txtPicName.setText("Okonomi Yaki\n พิชซ่าญี่ปุ่น\n 120 ฿");
                                   		break;
                                   		case 46:txtPicName.setText("Okura Natto\n ถั่วหมักญี่ปุ่น\n 40 ฿");
                                   		break;
                                   		case 47:txtPicName.setText("Omu Rice\n ข้าวผัดห่อไข่\n 80 ฿");
                                   		break;
                                   		case 48:txtPicName.setText("Oyako Don\n ข้าวหน้าไก่\n 80 ฿");
                                   		break;
                                   		case 49:txtPicName.setText("Potato\n สลัดมันบด\n 60 ฿");
                                   		break;
                                   		case 50:txtPicName.setText("Salom Salad\n ยำปลาแซลมอน\n 100 ฿");
                                   		break;
                                   		case 51:txtPicName.setText("Seafood Ramen\n ราเมนหน้าทะเล\n 100 ฿");
                                   		break;
                                   		case 52:txtPicName.setText("Shitake Ramen\n ราเมนหน้าเห็ดหอม\n 100 ฿");
                                   		break;
                                   		case 53:txtPicName.setText("Shio Butter Ramen\n ราเมนน้ำเกลือเพิ่มเนย\n 80 ฿");
                                   		break;
                                   		case 54:txtPicName.setText("Shio Ramen\n ราเมนน้ำเกลือ\n 80 ฿");
                                   		break;
                                   		case 55:txtPicName.setText("Subuta\n ผัดเปรี้ยวหวาน\n 80 ฿");
                                   		break;
                                   		case 56:txtPicName.setText("Syouga Yaki\n หมูผัดขิง\n 80 ฿");
                                   		break;
                                   		case 57:txtPicName.setText("Tako Yaki\n ขนมครกญี่ปุ่่น\n 60 ฿");
                                   		break;
                                   		case 58:txtPicName.setText("Tamago Don\n ข้าวหน้าไข่\n 60 ฿");
                                   		break;
                                   		case 59:txtPicName.setText("Ten Don\n ข้าวหน้ากุ้งเทมปุระ\n 90 ฿");
                                   		break;
                                   		case 60:txtPicName.setText("Tenpura Ramen\n ราเมนหน้ากุ้งเทมปุระ\n 100 ฿");
                                   		break;
                                   		case 61:txtPicName.setText("Tenpura Soba\n ซารุโซบะ\n 120 ฿");
                                   		break;
                                   		case 62:txtPicName.setText("Tenpura Udon\n อุด้งเทมปุระ\n 110 ฿");
                                   		break;
                                   		case 63:txtPicName.setText("Tenshin Don\n ข้าวหน้าไข่เจียวกุ๋ยฉ่ายะ\n 70 ฿");
                                   		break;
                                   		case 64:txtPicName.setText("Tonkatsu Ramen\n ราเมนหน้าหมูทอด\n 110 ฿");
                                   		break;
                                   		case 65:txtPicName.setText("Tonkatsu\n หมูทอดะ\n 90 ฿");
                                   		break;
                                   		case 66:txtPicName.setText("Tonkotsu sio Ramen\n ราเมนน้ำข้น\n 90 ฿");
                                   		break;
                                   		case 67:txtPicName.setText("Tori Karaage\n ไก่ทอดคาระเกะ\n 80 ฿");
                                   		break;
                                   		case 68:txtPicName.setText("Unagi Don\n ข้าวหน้าปลาไหล\n 180 ฿");
                                   		break;
                                   		case 69:txtPicName.setText("Unagi Yaki\n ปลาไหลย่าง\n 200 ฿");
                                   		break;
                                   		case 70:txtPicName.setText("Wakame Ramen\n ราเมนหน้าสาหร่าย\n 110 ฿");
                                   		break;
                                   		case 71:txtPicName.setText("Wantan Ramen\n ราเมนเกี้ยว\n 90 ฿");
                                   		break;
                                   		case 72:txtPicName.setText("Yakisoba\n ปลาหมึกผัดเส้น\n 80 ฿");
                                   		break;
                                   		case 73:txtPicName.setText("Yasai Coloque\n มันบดทอดไส้หมู\n 90 ฿");
                                   		break;
                                   		case 74:txtPicName.setText("Yasai Itame\n ผัดผัก\n 90 ฿");
                                   		break;
                                   		case 75:txtPicName.setText("Yasai Salad\n สลัดผัก\n 70 ฿");
                                   		break;
                                   		case 76:txtPicName.setText("Yasai Tempura\n ผักทอดเทปุระ\n 70 ฿");
                                   		break;
                                   		case 77:txtPicName.setText("Zaru Soba\n โซบะเย็น\n 90 ฿");
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
