package c2s.co.in;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class IntentDemoActivity extends ListActivity {
	String array[]={"Simple Activity","Explicity Intent",
			"Google","tel:7566328008","GEODATA"};
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,R.layout.main,array));
        final ListView listview=getListView();
        
        listview.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				String str=((TextView) arg1).getText().toString();
				Toast.makeText(IntentDemoActivity.this, str, Toast.LENGTH_SHORT).show();
				
				if(str.equalsIgnoreCase("Simple Activity")){
					Intent intent=new Intent();
					intent.setAction("c2s.co.in.SIMPLEACTIVITY");
					intent.putExtra("name", "Simple Activity intent passing");
					startActivity(intent);
				}
				if(str.equalsIgnoreCase("Explicity Intent")){
					Intent intent=new Intent(IntentDemoActivity.this,SecondActivity.class);
					intent.putExtra("name", "This value is from IntentDemoActivity to SecondActivity");
					startActivity(intent);
				}
				if(str.equalsIgnoreCase("Google")){
					Intent intent = new Intent(Intent.ACTION_VIEW);
					intent.setData(Uri.parse("http://www.google.com"));
					startActivity(intent);

				}
				if(str.equalsIgnoreCase("tel:7566328008")){
					Intent intent = new Intent(Intent.ACTION_CALL);
					intent.setData(Uri.parse(str));
					startActivity(intent);

				}
				if(str.equalsIgnoreCase("GEODATA")){
					Intent intent = new Intent(Intent.ACTION_VIEW);
					//geo:lat,long?z=zoomlevel&q=question-string
					intent.setData(Uri.parse("geo:37.422006,-122.084095?z=4&q=software"));
					startActivity(intent);

				}
			}
		});
    }
}