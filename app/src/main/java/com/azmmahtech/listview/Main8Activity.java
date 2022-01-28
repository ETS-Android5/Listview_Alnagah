package com.azmmahtech.listview;

import android.app.*;
import android.os.*;
import android.widget.*;

import android.net.*;

public class Main8Activity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		


		VideoView yousuf = findViewById(R.id.video_view);

        String ahmad = "https://clips.vorwaerts-gmbh.de/VfE_html5.mp4";
        // String ahmad = "android.resource://" + getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(ahmad);
        yousuf.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        yousuf.setMediaController(mediaController);
        mediaController.setAnchorView(yousuf);

        yousuf.start();


	}	
}
