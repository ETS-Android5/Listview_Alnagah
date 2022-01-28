package com.azmmahtech.listview;

import android.app.*;
import android.os.*;
import android.widget.*;

import android.net.*;

public class Main2Activity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		

       /////////////////
		VideoView yousuf = findViewById(R.id.video_view);

        //String ahmad = "https://sample-videos.com/video123/mp4/240/big_buck_bunny_240p_1mb.mp4";
         String ahmad = "android.resource://" + getPackageName() + "/" + R.raw.lights;
        Uri uri = Uri.parse(ahmad);
        yousuf.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        yousuf.setMediaController(mediaController);
        mediaController.setAnchorView(yousuf);

        yousuf.start();

		


	}	
}
