package com.example.hp.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    ImageButton imageButton;
    EditText username;
    EditText number;
    RadioButton r1;
    RadioButton r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        username=(EditText)findViewById(R.id.username_edit);
        number=(EditText)findViewById(R.id.mobile_number);
        imageButton=(ImageButton)findViewById(R.id.imageButton);
        r1=(RadioButton)findViewById(R.id.male);
        r2=(RadioButton)findViewById(R.id.female);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user=username.getText().toString();
                String num=number.getText().toString();
                int len=num.length();

                if(r1.isChecked()){
                    Toast.makeText(getApplicationContext(), "You Clicked on Male", Toast.LENGTH_SHORT).show();
                }

                else if(r2.isChecked()){
                    Toast.makeText(getApplicationContext(), "You Clicked on Female", Toast.LENGTH_SHORT).show();
                }

                if(len==10){
                    Intent i=new Intent(HomeActivity.this,SecondActivity.class);
                    i.putExtra("value",user);
                    startActivity(i);
                    finish();
               }

                    else{
                    Toast.makeText(getApplicationContext(), "Enter a valid mobile no.", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


}

