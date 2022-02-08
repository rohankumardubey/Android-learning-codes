package sending.c2s.co.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SendingEmailDemo extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button sendButton=(Button)findViewById(R.id.buttonSend);
        
        sendButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			  EditText id=(EditText)findViewById(R.id.editID);
			  EditText body=(EditText)findViewById(R.id.editBody);
			  EditText subject=(EditText)findViewById(R.id.editSubject);
			  String extra[]=new String[]{id.getText().toString()};
			  
			  Intent intent=new Intent(Intent.ACTION_SEND);
			  intent.putExtra(Intent.EXTRA_EMAIL, extra);
			  intent.putExtra(Intent.EXTRA_SUBJECT, subject.getText().toString());
			  intent.putExtra(Intent.EXTRA_TEXT, body.getText().toString());
			  intent.setType("message/rfc822");
			  startActivity(intent);
			  
			}
		});
    }
}