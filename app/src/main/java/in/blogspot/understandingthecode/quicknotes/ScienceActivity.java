package in.blogspot.understandingthecode.quicknotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ScienceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String value = intent.getStringExtra("key"); //if it's a string you stored.

        TextView Label = (TextView) findViewById(R.id.ScienceTv);

        if (value.equals("1")) {
            if (Label != null) {
                Label.setText(R.string.Call_From_Class9);
            }
        }
        if (value.equals("2")) {
            if (Label != null) {
                Label.setText(R.string.Call_From_Class10);
        }

    }

}
}
