package com.flexymind.app01;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;

public class SecondActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		DatePicker dp = (DatePicker) this.findViewById(R.id.datePicker1);
		dp.init(1990, 5, 30, null);
		
		Spinner sp = (Spinner) findViewById(R.id.spinner1);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.towns, android.R.layout.simple_spinner_dropdown_item);
		sp.setAdapter(adapter);
	}

}
