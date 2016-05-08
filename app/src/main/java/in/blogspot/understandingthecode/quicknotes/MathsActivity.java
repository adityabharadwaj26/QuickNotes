package in.blogspot.understandingthecode.quicknotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MathsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String value = intent.getStringExtra("key"); //if it's a string you stored.

        TextView Label = (TextView) findViewById(R.id.MathsTv);

        if (value.equals("1")) {
            if (Label != null) {
                Label.setText(R.string.Call_From_Class10);
            }
        }
        if (value.equals("2")) {
            if (Label != null) {
                Label.setText(R.string.Call_From_Class10);
            }
        }
    }

}
