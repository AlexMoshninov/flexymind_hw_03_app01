package com.flexymind.app01;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class FirstActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
	}

	public void switchActivity(View v)
	{
		Intent intent = new Intent(this, SecondActivity.class);
		startActivity(intent);
	}
	
	public void exit(View v)
	{
		System.exit(0);
	}

}
