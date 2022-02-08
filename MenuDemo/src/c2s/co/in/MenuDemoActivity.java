package c2s.co.in;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuDemoActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		MenuInflater menuInflator=getMenuInflater();
		menuInflator.inflate(R.menu.mymenu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		super.onOptionsItemSelected(item);
		switch(item.getItemId()){
		case R.id.andhra:
			Toast.makeText(this, "Andhra Pradesh", Toast.LENGTH_SHORT).show();
			break;
		case R.id.mp:
			Toast toast=Toast.makeText(this, "Andhra Pradesh", Toast.LENGTH_SHORT);
			toast.show();
		break;
		}
		return true;
	}
	
	
    
    
}