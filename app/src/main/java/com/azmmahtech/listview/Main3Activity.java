package com.azmmahtech.listview;

import android.app.*;
import android.os.*;
import android.widget.*;

import android.net.*;

public class Main3Activity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		



		VideoView yousuf = findViewById(R.id.video_view);

        //String ahmad = "https://video.fkrt3-1.fna.fbcdn.net/v/t42.9040-2/10000000_398191477823524_5915314695405521896_n.mp4?_nc_cat=102&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_ohc=CKZR1J1dj2EAX9gec3S&_nc_rml=0&_nc_ht=video.fkrt3-1.fna&oh=00_AT8NIYEtvvqjiSfDkMIgnd6LBFZ5q66-1_kKQ83uPhDQlA&oe=61C63164#_=_";
          String ahmad = "android.resource://" + getPackageName() + "/" + R.raw.lights;
        Uri uri = Uri.parse(ahmad);
        yousuf.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        yousuf.setMediaController(mediaController);
        mediaController.setAnchorView(yousuf);

        yousuf.start();
		


	}	
}
