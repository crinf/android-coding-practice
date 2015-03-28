package com.ZZZ.z019sharedprefences;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends Activity {
	
	
	private CheckBox cb;
	private SharedPreferences sp;
	private static final String KEY_SHOW_DIALOG_AT_START = "showdialongatstart";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		sp = getSharedPreferences("mysp", 0);
		
		cb = (CheckBox) findViewById(R.id.mainactivity_checkbox1);
		cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				Editor e = sp.edit();
				e.putBoolean("KEY_SHOW_DIALOG_AT_START", isChecked);
				e.commit();
			}
		});
				
		cb.setChecked(sp.getBoolean("KEY_SHOW_DIALOG_AT_START", false));
		
		if(cb.isChecked()){
			new AlertDialog.Builder(this).setTitle("欢迎").setMessage("你好，欢迎使用我").setPositiveButton("关闭", null).show();
		}
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
}
