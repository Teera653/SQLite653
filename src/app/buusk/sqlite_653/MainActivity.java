package app.buusk.sqlite_653;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
	MainActivity db;
	private Button buttonin;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        control_653 control_653 = new control_653(this);
        control_653.getWritableDatabase();
        
        buttonin = (Button) findViewById(R.id.buttonin);
        buttonin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),AddActivity.class);
				startActivity(intent);
				
			}
		});
        
      
    }
}


