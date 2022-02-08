package c2s.co.in;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;

public class ThreadDemo extends Activity {
	ProgressBar bar;
	boolean isRunning=false;
	Handler handler=new Handler(){

		@Override
		public void handleMessage(Message msg) {
			// TODO Auto-generated method stub
			bar.incrementProgressBy(5);
		}
    	
    };
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        bar=(ProgressBar)findViewById(R.id.seekBar1);  
    }
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		bar.setProgress(0);
		Thread background=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					for (int i=0;i<20 && isRunning;i++) {
					Thread.sleep(1000);
					handler.sendMessage(handler.obtainMessage());
					}
					}
					catch (Throwable t) {
					// just end the background thread
					}
			}
		});
		isRunning=true;
		background.start();
	}
	
	public void onStop() {
		super.onStop();
		isRunning=false;
		}
    
    
}