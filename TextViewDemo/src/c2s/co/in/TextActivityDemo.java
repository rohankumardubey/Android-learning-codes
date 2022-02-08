package c2s.co.in;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;

public class TextActivityDemo extends Activity {
	String days[]={"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday",
			"Saturday"};
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        EditText tv=(EditText)findViewById(R.id.editText1);
       //creating the autocompleting text view
        AutoCompleteTextView atv=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        //passing android.R.layout.simple_dropdown_item_1line layout
        //and String array to ArrayAdapter
        ArrayAdapter<String> aa=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,days);
        //setting aa to atv
        atv.setAdapter(aa);
        //creating MultiAutoCompleteView
        MultiAutoCompleteTextView mtv=(MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView1);
       //setting the adapter
        mtv.setAdapter(aa);
        //setting tokenizer
        mtv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        
        
    }
}