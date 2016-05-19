package in.blogspot.understandingthecode.quicknotes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDatabaseHelper databaseHelper = new MyDatabaseHelper(this);
        databaseHelper.addFriend("Abbas", 987);
        databaseHelper.addFriend("John", 9877);
        databaseHelper.addFriend("Michael", 8334);

        final Button Class9 = (Button) findViewById(R.id.Class9);
        assert Class9 != null;
        Class9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Class9Activity.class);
                //myIntent.putExtra("key", value); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }

        });
        final Button Class10 = (Button) findViewById(R.id.Class10);
        assert Class10 != null;
        Class10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Class10Activity.class);
                //myIntent.putExtra("key", value); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }

        });
    }
}
