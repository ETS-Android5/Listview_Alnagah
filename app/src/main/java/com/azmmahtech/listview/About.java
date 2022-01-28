package com.azmmahtech.listview;

import android.content.*;
import android.net.*;
import android.os.*;
import android.support.v7.app.*;
import android.view.*;



public class About extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        //TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

    }

    public void onClick1(View v){
        switch (v.getId()){

            case R.id.but1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:"+getString(R.string.developer_email)+"?subjrct="+getString(R.string.app_name))));
                break;
            case R.id.but2:
                String developerName = getString(R.string.developer_name);
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q="+developerName)));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/search?q="+developerName)));
                }
                break;
            case R.id.but3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.website))));
                break;
        }
    }
}
