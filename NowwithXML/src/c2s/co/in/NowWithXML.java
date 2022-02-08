package c2s.co.in;

import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NowWithXML extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final Button btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
		       updateDate();	   	
			}

			private void updateDate() {
				// TODO Auto-generated method stub
				btn.setText(new Date().toString());
			}
		});
    }
}