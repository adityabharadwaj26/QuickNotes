package in.blogspot.understandingthecode.quicknotes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Class10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class10);

        final Button Maths = (Button) findViewById(R.id.Maths);
        assert Maths != null;
        Maths.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(Class10Activity.this, MathsActivity.class);
                myIntent.putExtra("key", "2"); //Optional parameters
                Class10Activity.this.startActivity(myIntent);
            }
        });
        final Button Science = (Button) findViewById(R.id.Science);
        assert Science != null;
        Science.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(Class10Activity.this, ScienceActivity.class);
                myIntent.putExtra("key", "2"); //Optional parameters
                Class10Activity.this.startActivity(myIntent);
            }

        });
    }
}
