package com.caveda.examples.PhoneCallButton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PhoneCallButton extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button callbutton = (Button) findViewById(R.id.PhoneCall_button);
        callbutton.setOnClickListener(new View.OnClickListener() {
        	 
        	@Override
        	public void onClick(View v) {
        	Intent intent = new Intent(Intent.ACTION_DIAL);
        	startActivity(intent);
        	}
        	});
       	  
    } // onCreate
} // class
