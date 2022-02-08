package c2s.co.in;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class PopUpDemo extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button toastbtn=(Button)findViewById(R.id.button1);
        Button alertbtn=(Button)findViewById(R.id.button2);
        
        toastbtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Toast.makeText(PopUpDemo.this, "Hello from toast", Toast.LENGTH_SHORT).show();	
			}
		});
        alertbtn.setOnClickListener(new OnClickListener() {
        	
        	@Override
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        	AlertDialog.Builder alert=new AlertDialog.Builder(PopUpDemo.this);
        	alert.setTitle("MessageDemo");
        	alert.setMessage("welcome to India");
        	alert.show();
        	}
        });
        
    }
}