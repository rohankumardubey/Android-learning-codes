package telephony.c2.co.in;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelephonyDemo extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button sendButton=(Button)findViewById(R.id.sendSmsBtn);
        
        sendButton.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
			    EditText addrText=(EditText)findViewById(R.id.addrEditText);
			    EditText msgTxt=(EditText)findViewById(R.id.msgEditText);
			    
			    try {
					sendMessage(addrText.getText().toString(),msgTxt.getText().toString());
					Toast.makeText(TelephonyDemo.this, "SMS sent", Toast.LENGTH_SHORT).show();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					Toast.makeText(TelephonyDemo.this, "Message Sent Fail", Toast.LENGTH_SHORT).show();
				}
			}

			private void sendMessage(String address, String message) throws Exception{
				// TODO Auto-generated method stub
				SmsManager smsMgr=SmsManager.getDefault();
				smsMgr.sendTextMessage(address, null, message, null, null);
			}
		});
    }
}