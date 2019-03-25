package com.example.admin.intend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;
import android.graphics.Typeface;
import android.content.Intent;

public class display extends AppCompatActivity {
TextView name,rollno,batch,user,pswd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent intent = getIntent();

        String name1 = intent.getStringExtra("name");
        String rno1 = intent.getStringExtra("rollno");
        String batch1 = intent.getStringExtra("batch");
        String user1 = intent.getStringExtra("user");
        String pswd1 = intent.getStringExtra("pswd");

        name = (TextView) findViewById(R.id.name);
       rollno = (TextView)findViewById(R.id.rollno);
        batch = (TextView)findViewById(R.id.batch);
        user = (TextView)findViewById(R.id.username);
        pswd = (TextView)findViewById(R.id.password);

        name.setText("NAME : " +name1);
        rollno.setText("ROLLNO : "+rno1);
        batch.setText("BATCH : "+batch1);
        user.setText("USERNAME :" +user1);
        pswd.setText("PASSWORD:" +pswd1);

    }
}
