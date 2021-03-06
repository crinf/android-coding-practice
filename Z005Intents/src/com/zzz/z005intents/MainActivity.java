package com.zzz.z005intents;

import java.io.File;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	
	private Button B1,B2,B3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		B1 = (Button)findViewById(R.id.mainactivity_button1_startaty001);
		B2 = (Button)findViewById(R.id.mainactivity_button2_del10086);
		B3 = (Button)findViewById(R.id.mainactivity_button3_baidu);
		
		B1.setOnClickListener(this);
		B2.setOnClickListener(this);
		B3.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.mainactivity_button1_startaty001:
//			Intent i =new Intent();
//			i.setComponent(new ComponentName("com.zzz.z005intents", "com.zzz.z005intents.Aty001"));
			
//			Intent i = new Intent("com.zzz.z005intents.intent.action.Aty001");
//			startActivity(i);
			
			File f = new File("/storage/emulated/0/Download/3c1686b557862ea8641aca592ac726ef.png");
			Intent i = new Intent(Intent.ACTION_VIEW);
			i.setDataAndType(Uri.fromFile(f), "image/*");
			startActivity(i);
			break;
		case R.id.mainactivity_button2_del10086:
			Intent i1 = new Intent(Intent.ACTION_VIEW);
			i1.setData(Uri.parse("tel:10086"));
			startActivity(i1);
			break;
		case R.id.mainactivity_button3_baidu:
			Intent i2 =new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.baidu.com"));
			startActivity(i2);
			break;
		}
	}
}
