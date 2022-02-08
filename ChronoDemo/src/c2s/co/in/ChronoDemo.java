package c2s.co.in;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class ChronoDemo extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final DatePicker datepicker=(DatePicker)findViewById(R.id.datePicker1);
        final TimePicker timepicker=(TimePicker)findViewById(R.id.timePicker1);
        final TextView textview=(TextView)findViewById(R.id.textView1);
        final Button btnDate=(Button)findViewById(R.id.button1);
        final Button btnTime=(Button)findViewById(R.id.button2);
        
        btnDate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String date=(datepicker.getMonth()+1)+"/"+(datepicker.getDayOfMonth())+"/"+(datepicker.getYear());
				textview.setText(date);
			}
		});
        btnTime.setOnClickListener(new OnClickListener() {
        	
        	@Override
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		String time=timepicker.getCurrentHour()+":"+timepicker.getCurrentMinute();
        		textview.setText(time);
        	}
        });
        
        
        
    }
}