package com.azmmahtech.listview;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Abboudi_Aliwi on 15.04.2017.
 * Website : http://andrody.com/
 * our channel on YouTube : https://www.youtube.com/c/Andrody2015
 * our page on Facebook : https://www.facebook.com/andrody2015/
 * our group on Facebook : https://www.facebook.com/groups/Programming.Android.apps/
 * our group on Whatsapp : https://chat.whatsapp.com/56JaImwTTMnCbQL6raHh7A
 * our group on Telegram : https://t.me/joinchat/AAAAAAm387zgezDhwkbuOA
 * Playlist to build this application : https://www.youtube.com/playlist?list=PLNivoV2e4nZWDf3CsL4go0_7sTHqhgmWA
 * Preview the app from Google play : https://play.google.com/store/apps/details?id=com.andrody.waytosuccess
 */


public class MainHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_home);
		
		
		

    }
    
	
	/////////////كود الضغط وفتح عننا About وعن الكاتب////////// 
    public void onClick(View view){
        switch (view.getId()){
            case R.id.id_close:

                onBackPressed();

                break;
            case R.id.id_share:

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_SUBJECT,"تحميل تطبيق إلخ .. ");
                sendIntent.putExtra(Intent.EXTRA_TEXT, "مرحباً بكم جميعاً في مدونة اندرودي عربي");
                sendIntent.setType("text/plain");
                startActivity(Intent.createChooser(sendIntent,"اختار التطبيق الذي مشاركة النص معه :"));

                break;
            case R.id.id_1:

                startActivity(new Intent(getApplicationContext(),SubjectList.class));

                break;
            case R.id.id_2:

                startActivity(new Intent(getApplicationContext(),About_alfki.class));

                break;
            case R.id.id_3:
				

                startActivity(new Intent(getApplicationContext(),About.class));

                break;
            case R.id.id_4:
				
				
				
                /////////////كود تقييم التطبيق علي المتجر////////////
                final String appPackageName = getPackageName();
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + appPackageName)));
                }

                break;
        }
    }
     
	
	////////////كِوَدِ الٌُخرَوَجْ مٌنَ الُتْطِبّيَقً/////////////
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(
                MainHome.this);
        builder.setTitle("إغلاق التطبيق");
        builder.setMessage("هل متأكد من الخروج من التطبيق :(");
        builder.setPositiveButton("نعم",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        finish();

                    }
                });
        builder.setNegativeButton("لا",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                    }
                });
        builder.show();
    }
}
