package in.blogspot.understandingthecode.quicknotes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Class9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class9);

        final Button Maths = (Button) findViewById(R.id.Maths);
        assert Maths != null;
        Maths.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(Class9Activity.this, MathsActivity.class);
                myIntent.putExtra("key", "1"); //Optional parameters
                Class9Activity.this.startActivity(myIntent);
            }
        });
        final Button Science = (Button) findViewById(R.id.Science);
        assert Science != null;
        Science.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(Class9Activity.this, ScienceActivity.class);
                myIntent.putExtra("key", "1"); //Optional parameters
                Class9Activity.this.startActivity(myIntent);
            }

        });
    }
}
