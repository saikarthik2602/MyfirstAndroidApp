package com.example.passwordverificationapp;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);

        Button mybutton = (Button) findViewById(R.id.button);

        Button mybutton2 = (Button) findViewById(R.id.button2);




        mybutton.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View V)
                    {
                        TextView tv1 = (TextView) findViewById(R.id.textView2);

                        EditText pw1 = (EditText) findViewById(R.id.Password1);

                        String s1 = pw1.getText().toString();

                        EditText pw2 = (EditText) findViewById(R.id.Password2);

                        String s2 = pw2.getText().toString();

                        if(s1.compareTo(s2)==0)
                        {
                            tv1.setText("Passwords Matched");
                            tv1.setTextColor(Color.GREEN);
                        }
                        else {
                            tv1.setText("Passwords Not Matched");
                            tv1.setTextColor(Color.RED);
                        }

                    }
                }
        );

        mybutton2.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View V)
                    {
                        EditText pw1 = (EditText) findViewById(R.id.Password1);

                        String s1 = pw1.getText().toString();

                        EditText pw2 = (EditText) findViewById(R.id.Password2);

                        String s2 = pw2.getText().toString();

                        TextView tv1 = (TextView) findViewById(R.id.textView2);

                        pw1.getText().clear();

                        pw2.getText().clear();

                        tv1.setText("");
                    }
                }
        );
    }
}