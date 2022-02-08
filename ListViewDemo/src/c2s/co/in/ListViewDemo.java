package c2s.co.in;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListViewDemo extends ListActivity {
	TextView selection;
	String[] items={"lorem", "ipsum", "dolor", "sit", "amet",
	"consectetuer", "adipiscing", "elit", "morbi", "vel",
	"ligula", "vitae", "arcu", "aliquet", "mollis",
	"etiam", "vel", "erat", "placerat", "ante",
	"porttitor", "sodales", "pellentesque", "augue", "purus"};
	/** Called with the activity is first created. */
	@Override
	public void onCreate(Bundle icicle) {
	super.onCreate(icicle);
	setContentView(R.layout.main);
	setListAdapter(new ArrayAdapter<String>(this,
	android.R.layout.simple_list_item_1,
	items));
	selection=(TextView)findViewById(R.id.selection);
	}
	public void onListItemClick(ListView parent, View v, int position,
	long id) {
	selection.setText(items[position]);
	}

	
    
    
}