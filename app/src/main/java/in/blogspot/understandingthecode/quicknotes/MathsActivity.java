package in.blogspot.understandingthecode.quicknotes;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
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
        MyDatabaseHelper databaseHelper = new MyDatabaseHelper(this);

        TextView Label = (TextView) findViewById(R.id.MathsTv);

        if (value.equals("1")) {
            if (Label != null) {
                //Label.setText(R.string.Call_From_Class10);
                Cursor AllFriends = databaseHelper.getFriends();
                AllFriends.moveToFirst();
                //while (!AllFriends.isAfterLast()) {
                    String Name = AllFriends.getString(1);
                    int number = AllFriends.getInt(2);
                    //AllFriends.moveToNext();
                Label.setText(Name);
                //}
            }
        }
        if (value.equals("2")) {
            if (Label != null) {
                Label.setText(R.string.Call_From_Class10);
                databaseHelper.getFriends();
            }
        }
    }

}
