package c2s.co.in;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class PrefDemo extends Activity {
	CheckBox cb;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        cb=(CheckBox)findViewById(R.id.check);
        Button btn=(Button)findViewById(R.id.close);
        btn.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
			finish();	
			}
		});
        
        cb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
			if(isChecked){
				cb.setText("This box is :checked");
			}else{
				cb.setText("This box is :unchecked");
			}
			}
		});
    }
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		SharedPreferences setting=getPreferences(0);
		SharedPreferences.Editor edit=setting.edit();
		edit.putBoolean("cb_checked", cb.isChecked());
		edit.commit();
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		SharedPreferences setting=getPreferences(0);
		cb.setChecked(setting.getBoolean("cb_checked", false));
	}
    
    
}