package com.azmmahtech.listview;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.content.*;
import android.view.*;
import android.net.*;

public class List_pro extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_pro);
    
		ListView mohamad = (ListView) findViewById(R.id.listview);
		
		String[] yousuf = {


			"  الصفحة رقم 1 "
			, " الصفحة رقم 2 "
			, " الصفحة رقم 3 "
			, " الصفحة رقم 4 "
			, " الصفحة رقم 5 "
			, " الصفحة رقم 6 "
			, " الصفحة رقم 7 "
			, " الصفحة رقم 8 "
			, " الصفحة رقم 9 "
			, " الصفحة رقم 10 "
		    ,"الصفحة رقم 11"
			  
		
		
			,"سياسة الخصوصية"
			, "تقيم التطبيق على متجر بلاي "
			, "تابعني على فيسبوك "
			, "قناتنا على اليوتيوب "
		    ,"تابع اخر الاخبار في موقعنا الالكتروني"
			, "شارك التطبيق مع الاصدقاء "
			, "رسالة مدمجة في التطبيق "
			, "رابط موقعنا علي الانترنت"
			

        };
		
	
		ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this, R.layout.resource_azmmah, R.id.titleid, yousuf);
        mohamad.setAdapter(arrayAdapter);
	
	


		mohamad.setOnItemClickListener(new AdapterView.OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> parent, View view,
										int amer, long id) {

					if (amer == 0) {
						Intent ahmad = new Intent(List_pro.this, MainHome.class);
						startActivity(ahmad);

					}


					if (amer == 1) {
						Intent ahmad = new Intent(List_pro.this, Main2Activity.class);
						startActivity(ahmad);

					}


					if (amer == 2) {
						Intent ahmad = new Intent(List_pro.this, Main3Activity.class);
						startActivity(ahmad);

					}


					if (amer == 3) {
						Intent ahmad = new Intent(List_pro.this, Main4Activity.class);
						startActivity(ahmad);

					}


					if (amer == 4) {
						Intent ahmad = new Intent(List_pro.this, Main5Activity.class);
						startActivity(ahmad);

					}


					if (amer == 5) {
						Intent ahmad = new Intent(List_pro.this, Main6Activity.class);
						startActivity(ahmad);

					}


					if (amer == 6) {
						Intent ahmad = new Intent(List_pro.this, Main7Activity.class);
						startActivity(ahmad);

					}


					if (amer == 7) {
						Intent ahmad = new Intent(List_pro.this, Main8Activity.class);
						startActivity(ahmad);

					}


					if (amer == 8) {
						Intent ahmad = new Intent(List_pro.this, Main9Activity.class);
						startActivity(ahmad);

					}


					if (amer == 9) {
						Intent ahmad = new Intent(List_pro.this, Main10Activity.class);
						startActivity(ahmad);

					}
				
					if (amer == 10) {
						Intent ahmad = new Intent(List_pro.this, Main11Activity.class);
						startActivity(ahmad);

					}
					
				
				
					
					if (amer == 11) {
						Intent ahmad = new Intent(List_pro.this, Privacy_policy.class);
						startActivity(ahmad);
						
						
				}

					if (amer == 12) {
                         ////هنا تضع رابط تطبيك الموجود على متجر بلاي
						Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.00000000000000");
						Intent intent = new Intent(Intent.ACTION_VIEW, uri);
						startActivity(intent);


					}


					if (amer == 13) {
                         ////هنا تضع رابط صفحة الفيسبوك
						Uri ahmad = Uri.parse("https://m.facebook.com/");
						Intent intent = new Intent(Intent.ACTION_VIEW, ahmad);
						startActivity(intent);
						
					}


					if (amer == 14) {
                        ///هنا تضع رابط قناتك على اليوتيوب
						Uri ahmad = Uri.parse("https://youtube.com/channel/UCYozOLVrATSQsuolI08zFnQ");
						Intent intent = new Intent(Intent.ACTION_VIEW, ahmad);

						startActivity(intent);

					}

				
					if (amer == 15) {
                          ///هنا تضع رابط موقعك 
						Uri ahmad = Uri.parse("https://www.youtube.com/channel/UCU8MhbLVWip2KY8EvE5543g");
						Intent intent = new Intent(Intent.ACTION_VIEW, ahmad);

						startActivity(intent);

					}
					
				
				////// Testمدونة المسار التقنية
				
				
					if (amer == 18) {
						///هنا تضع رابط موقعك 
						Uri ahmad = Uri.parse("https://azmmahtech.blogspot.com/?m=1");
						Intent intent = new Intent(Intent.ACTION_VIEW, ahmad);

						startActivity(intent);

					}
				
				/////////////التقنية///////
				
				
				
				
				
				
				
					
					if (amer == 16) {
				
					//	https://developer.android.com/training/sharing/send
						
						//Sending simple data to other apps
						
                         ////هنا كود مشاركة البرنامج مع الاصدقاء عبر تطبيقات التواصل الاجتماعية مثل الواتس اب الفيسبوك الايميل الى اخره
						Intent salsabil = new Intent(Intent.ACTION_SEND);
						salsabil.setType("text/plain");
						
					     ////هنا تضع وصف قصير لتطبيفك
						
						String message = "تعلم برمجة تطبيقات الاندرويد مع احمد";
					
						///هنا تضع رابط تطبيفك مع شرح عن التطبيق
					
						String body = " هنا سوف تتعلم برمجة تطبيقات الاندرويد من خلال الجوال ومن خلال الحاسوب وكل الاكواد والسورسات موفرة     https://www.youtube.com/channel/UCU8MhbLVWip2KY8EvE5543g";
				
						salsabil.putExtra(Intent.EXTRA_SUBJECT, message);
						
						salsabil.putExtra(Intent.EXTRA_TEXT, body);
					
						/// هنا تضع اسم التطبيق ووصف قصير جدا عن التطبيف
						startActivity(Intent.createChooser(salsabil, "مشاركة برنامج اناشيد مع الاصدقاء"));
						
					}


					if (amer == 17) {

                        //////هنا بداية الكود هذا الكود ديالوك رسالة مدمجة
						android.app.AlertDialog.Builder ahmad = new android.app.AlertDialog.Builder(List_pro.this);
						ahmad.setTitle("حول البرنامج");

						ahmad.setMessage(" تم إطلاق هذا السورس في عام 2020 هو سورس بسيط يخولك لفهم آلية عمل بعض الأدوات في منصة الاندرويد يمكنك استخدامه في التعليم وسيتم إطلاق نسخة ثانية في المستقبل القريب ان كان لديك اي سؤال تواصل معي على الموقع أو على اليوتيوب " );



						ahmad.setPositiveButton("اخفاء الرسالة", new DialogInterface.OnClickListener() {

								public void onClick(DialogInterface dialog, int whichButton) {


								}	
								
								
								
								
	                         ///////////
								
								
														
								
								
								
								
								
							

							});
						ahmad.show();
						
					////////هنا نهاية الكود
				
					
                  }

				}


			});

		
            }
							
					
	}
		
		
					
