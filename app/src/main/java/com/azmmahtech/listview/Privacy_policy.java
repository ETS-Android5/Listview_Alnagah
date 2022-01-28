package com.azmmahtech.listview;
import android.os.*;
import android.app.*;
import android.webkit.*;




public class Privacy_policy extends Activity 
{
@Override
protected void onCreate(Bundle savedInstanceState)
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.privacy_policy);
		
		
			
			
		
			
			WebView webView = (WebView) findViewById(R.id.privacy_policyWebVie);

			//webView.loadUrl("https://www.google.com/");

			webView.loadUrl("file:///android_asset/1.html");
	}
	
	
	
	
}
