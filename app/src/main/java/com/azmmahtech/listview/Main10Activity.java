package com.azmmahtech.listview;

import android.app.*;
import android.os.*;
import android.widget.*;

import android.net.*;

public class Main10Activity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		



		VideoView yousuf = findViewById(R.id.video_view);



        String ahmad = "https://3.top4top.net/m_1395h1ipf1.mp4";
        // String ahmad = "android.resource://" + getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(ahmad);
        yousuf.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        yousuf.setMediaController(mediaController);
        mediaController.setAnchorView(yousuf);

        yousuf.start();
		


	}	
}
