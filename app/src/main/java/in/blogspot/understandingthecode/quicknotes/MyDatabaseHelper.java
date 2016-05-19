package in.blogspot.understandingthecode.quicknotes;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Aditya Bharadwaj on 5/8/2016.
 */

public class MyDatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME="MyFriendsDatabase";

    public MyDatabaseHelper(Context context) {

        super(context, DATABASE_NAME, null, 1);

    }

    @Override

    public void onCreate(SQLiteDatabase database) {

        database.execSQL("CREATE TABLE friends (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, phonenumber INTEGER);");

    }

    @Override

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS friends");

        onCreate(db);

    }

    public void addFriend(String name,int phonenumber)

    {

        ContentValues values=new ContentValues(2);

        values.put("name", name);

        values.put("phonenumber", phonenumber);

        getWritableDatabase().insert("friends", "name", values);

    }

    public Cursor getFriends()

    {

        Cursor cursor = getReadableDatabase().rawQuery("select * from friends", null);

        return cursor;

    }

}