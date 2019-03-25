package com.example.admin.intend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.CheckBox;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    EditText name, rno, batch, user, pswd;
    CheckBox ch1, ch2;
    Button reg;
    RadioGroup radio;


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.name);
        rno = (EditText) findViewById(R.id.rollno);
        batch = (EditText) findViewById(R.id.batch1);
        radio = (RadioGroup) findViewById(R.id.radioGroup);
        radio.clearCheck();
        ch1 = (CheckBox) findViewById(R.id.checkBox1);
        ch2 = (CheckBox) findViewById(R.id.checkBox2);
        user = (EditText) findViewById(R.id.usrname);
        pswd = (EditText) findViewById(R.id.pswd);
        reg = (Button) findViewById(R.id.button2);
    }

    public void register(View v) {
        if(name.getText().toString().equals(""))
        {
            Toast.makeText(getApplicationContext(),"Enter name",Toast.LENGTH_SHORT).show();
        }
        if(rno.getText().toString().equals(""))
        {
            Toast.makeText(getApplicationContext(),"Enter your rollno",Toast.LENGTH_SHORT).show();
        }
        if(batch.getText().toString().equals(""))
        {
            Toast.makeText(getApplicationContext(),"Enter your batch",Toast.LENGTH_SHORT).show();
        }
        if(user.getText().toString().equals(""))
        {
            Toast.makeText(getApplicationContext(),"Enter your username",Toast.LENGTH_SHORT).show();
        }
        if(pswd.getText().toString().equals(""))
        {
            Toast.makeText(getApplicationContext(),"Enter your password",Toast.LENGTH_SHORT).show();
        }
        String na = name.getText().toString();
        String rn = rno.getText().toString();
        String bat = batch.getText().toString();
        String usr = user.getText().toString();
        String pass = pswd.getText().toString();
        Intent intent = new Intent(MainActivity.this, display.class);
        intent.putExtra("name", na);
        intent.putExtra("rollno", rn);
        intent.putExtra("batch", bat);
        intent.putExtra("user", usr);
        intent.putExtra("pswd", pass);
        startActivity(intent);
    }

}