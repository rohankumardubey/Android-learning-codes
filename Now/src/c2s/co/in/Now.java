package c2s.co.in;

import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Now extends Activity {
	Button btn;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn=new Button(this);
        setContentView(btn);
        btn.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
			   updateTime();	
			}

			private void updateTime() {
				// TODO Auto-generated method stub
				btn.setText(new Date().toString());
			}
		});
    }
}