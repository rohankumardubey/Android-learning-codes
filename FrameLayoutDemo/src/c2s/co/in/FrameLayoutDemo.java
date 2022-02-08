package c2s.co.in;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class FrameLayoutDemo extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final ImageView image1=(ImageView)findViewById(R.id.imageView1);
        final ImageView image2=(ImageView)findViewById(R.id.imageView2);
        
        image1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
			    image1.setVisibility(View.GONE);
			    image2.setVisibility(View.VISIBLE);  
			}
		});
        image2.setOnClickListener(new OnClickListener() {
        	
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		image2.setVisibility(View.GONE);
        		image1.setVisibility(View.VISIBLE);  
        	}
        });
        
    }
}