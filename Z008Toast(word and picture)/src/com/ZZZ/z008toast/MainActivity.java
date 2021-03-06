package com.ZZZ.z008toast;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private Button B1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		B1 = (Button)findViewById(R.id.mainactivity_button1_toast);
		B1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
//				核心代码
				Toast notice = Toast.makeText(MainActivity.this, "我是toast", Toast.LENGTH_LONG);
				notice.setGravity(Gravity.CENTER, 0, 0);
				notice.show();
				
				Toast imageToast = Toast.makeText(MainActivity.this, "我是toast图片", Toast.LENGTH_LONG);
				ImageView img1 = new ImageView(MainActivity.this);
				img1.setImageResource(R.drawable.ic_launcher);
				imageToast.setView(img1);
				imageToast.show();
			}
		});
	
	
	}

	

}
