package com.azmmahtech.listview;



import android.app.*;
import android.os.*;
import android.content.*;

import org.apache.http.protocol.*;

import android.view.*;

public class Splash extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{

		super.onCreate(savedInstanceState);

		// remove title كود ملئ الشاشة ////
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
							 WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.splash);

	    ///////////كود مدة ظهور شاشة الاسبلاش////////
		Integer SPLASH_TIME = 1000;
        new Handler().postDelayed(new Runnable() {


				//// كِوَدِ االانتقال الي الصفحة الرئيسية////
				@Override
				public void run() {

					Intent yousuf = new Intent(Splash.this, MainHome.class);
					startActivity(yousuf);
					finish();
				}
			},

			SPLASH_TIME);




    }

}

  


