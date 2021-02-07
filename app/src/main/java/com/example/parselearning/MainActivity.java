package com.example.parselearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // DATABASE

        /*
        ParseObject object = new ParseObject("Fruits");

        object.put("name", "kiwi");
        object.put("calorie", 150);
        object.saveInBackground(e -> {
            if (e != null)
                Toast.makeText(getApplicationContext(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            else
                Toast.makeText(getApplicationContext(), "Object saved", Toast.LENGTH_LONG).show();
        });

         */

        /*
        ParseQuery<ParseObject> query = new ParseQuery<ParseObject>("Fruits");
        query.getInBackground("BDBSUSEENL", (object, e) -> {
            if (e != null)
                e.printStackTrace();
            else {
                String name = object.getString("name");
                int calorie = object.getInt("calorie");
                System.out.println(name + " " + calorie);
            }
        });

         */

        /*
        ParseQuery<ParseObject> query = ParseQuery.getQuery("Fruits");

        query.whereEqualTo("name", "banana");  // filtreleme

        query.findInBackground((objects, e) -> {
            if (e != null)
                e.printStackTrace();
            else {
                if (objects.size() > 0){
                    for (ParseObject object : objects){
                        String name = object.getString("name");
                        int calorie = object.getInt("calorie");

                        System.out.println(name + " " + calorie);
                    }
                }
            }
        });

         */

        // USER

        /*
        ParseUser user = new ParseUser();

        user.setUsername("James");
        user.setPassword("123456");

        user.signUpInBackground(e -> {
            if (e != null)
                e.printStackTrace();
            else
                Toast.makeText(getApplicationContext(), "Signed up", Toast.LENGTH_LONG).show();
        });

         */

        ParseUser.logInInBackground("James", "123456", (user, e) -> {
            if (e != null)
                e.printStackTrace();
            else {
                Toast.makeText(getApplicationContext(), "Welcome: " + user.getUsername(), Toast.LENGTH_LONG).show();
            }
        });

    }
}

















