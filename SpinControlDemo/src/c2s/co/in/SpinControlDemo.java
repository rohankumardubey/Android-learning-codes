package c2s.co.in;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinControlDemo extends Activity implements OnItemSelectedListener {
	TextView selection;
	String[] items={"lorem", "ipsum", "dolor", "sit", "amet",
	"consectetuer", "adipiscing", "elit", "morbi", "vel",
	"ligula", "vitae", "arcu", "aliquet", "mollis",
	"etiam", "vel", "erat", "placerat", "ante",
	"porttitor", "sodales", "pellentesque", "augue", "purus"};
	@Override
	public void onCreate(Bundle icicle) {
	super.onCreate(icicle);
	setContentView(R.layout.main);
	selection=(TextView)findViewById(R.id.selection);
	Spinner spin=(Spinner)findViewById(R.id.spinner);
	spin.setOnItemSelectedListener(this);
	ArrayAdapter<String> aa=new ArrayAdapter<String>(this,
	android.R.layout.simple_list_item_1,items);
	aa.setDropDownViewResource(
			android.R.layout.simple_spinner_dropdown_item);
			spin.setAdapter(aa);
			}
			public void onItemSelected(AdapterView parent, View v,
			int position, long id) {
			selection.setText(items[position]);
			}
			public void onNothingSelected(AdapterView parent) {
			selection.setText("");
			}
}