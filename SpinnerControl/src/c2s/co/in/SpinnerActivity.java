package c2s.co.in;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpinnerActivity extends Activity {
	String myarray[]={"Fish","Chicken","Dosa"};
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Spinner spin=(Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> aa=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,myarray);
        spin.setAdapter(aa);
    }
}