package c2s.co.in;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondactivity);
		Bundle bundle=getIntent().getExtras();
		String name=bundle.getString("name");
		TextView text=(TextView)findViewById(R.id.textView1);
		text.setText(name);
	}

}
