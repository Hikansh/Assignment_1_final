package com.example.hp.assignment;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import in.galaxyofandroid.spinerdialog.OnSpinerItemClick;
import in.galaxyofandroid.spinerdialog.SpinnerDialog;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.WHITE;

public class SecondActivity extends AppCompatActivity {

    TextView t;
    ArrayList<String> items=new ArrayList<>();
    SpinnerDialog spinnerDialog;
    Button btn;
    ImageButton img;
    public int selected;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        t=(TextView)findViewById(R.id.welcome_user_name);
        Bundle extras=getIntent().getExtras();
        String s=extras.getString("value");
        t.setText(s);

        additems();
        spinnerDialog=new SpinnerDialog(SecondActivity.this,items,"Select any color");
        spinnerDialog.bindOnSpinerListener(new OnSpinerItemClick() {
            @Override
            public void onClick(String item, int pos) {
                switch (item){
                    case "White":
                        RelativeLayout r=(RelativeLayout)findViewById(R.id.secondactivity);
                        r.setBackgroundColor(WHITE);
                       selected=WHITE;
                        Toast.makeText(SecondActivity.this, "Hope You Enjoyed This Color", Toast.LENGTH_SHORT).show();
                        break;
                    case "Black":
                        RelativeLayout r1=(RelativeLayout)findViewById(R.id.secondactivity);
                        r1.setBackgroundColor(BLACK);
                        selected = BLACK;
                        Toast.makeText(SecondActivity.this, "Hope You Enjoyed This Color", Toast.LENGTH_SHORT).show();
                    break;
                    case "Blue":
                        RelativeLayout r2=(RelativeLayout)findViewById(R.id.secondactivity);
                        r2.setBackgroundColor(Color.BLUE);
                        selected = Color.BLUE;
                        Toast.makeText(SecondActivity.this, "Hope You Enjoyed This Color", Toast.LENGTH_SHORT).show();
                    break;
                    case "Cyan":
                        RelativeLayout r3=(RelativeLayout)findViewById(R.id.secondactivity);
                        r3.setBackgroundColor(Color.CYAN);
                        selected = Color.CYAN;
                        Toast.makeText(SecondActivity.this, "Hope You Enjoyed This Color", Toast.LENGTH_SHORT).show();
                        break;
                    case "Red":
                        RelativeLayout r4=(RelativeLayout)findViewById(R.id.secondactivity);
                        r4.setBackgroundColor(Color.RED);
                        selected = Color.RED;
                        Toast.makeText(SecondActivity.this, "Hope You Enjoyed This Color", Toast.LENGTH_SHORT).show();
                    break;
                    case "Magenta":
                        RelativeLayout r5=(RelativeLayout)findViewById(R.id.secondactivity);
                        r5.setBackgroundColor(Color.MAGENTA);
                        selected = Color.MAGENTA;
                        Toast.makeText(SecondActivity.this, "Hope You Enjoyed This Color", Toast.LENGTH_SHORT).show();
                    break;
                    case "Light Gray":
                        RelativeLayout r6=(RelativeLayout)findViewById(R.id.secondactivity);
                        r6.setBackgroundColor(Color.LTGRAY);
                        selected = Color.LTGRAY;
                        Toast.makeText(SecondActivity.this, "Hope You Enjoyed This Color", Toast.LENGTH_SHORT).show();
                        break;
                    case "Yellow":
                        RelativeLayout r7=(RelativeLayout)findViewById(R.id.secondactivity);
                        r7.setBackgroundColor(Color.YELLOW);
                        selected = Color.YELLOW;
                        Toast.makeText(SecondActivity.this, "Hope You Enjoyed This Color", Toast.LENGTH_SHORT).show();
  break;
                    case "Green":
                        RelativeLayout r8=(RelativeLayout)findViewById(R.id.secondactivity);
                        r8.setBackgroundColor(Color.GREEN);
                        selected = Color.GREEN;
                        Toast.makeText(SecondActivity.this, "Hope You Enjoyed This Color", Toast.LENGTH_SHORT).show();
        break;
                    case "Gray":
                        RelativeLayout r9=(RelativeLayout)findViewById(R.id.secondactivity);
                        r9.setBackgroundColor(Color.GRAY);
                        selected = Color.GRAY;
                        Toast.makeText(SecondActivity.this, "Hope You Enjoyed This Color", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spinnerDialog.showSpinerDialog();
            }
        });

        img=(ImageButton)findViewById(R.id.imageButton2);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(in);
                finish();
            }
        });

    }

    private void additems() {
        items.add("White");
        items.add("Black");
        items.add("Blue");
        items.add("Cyan");
        items.add("Red");
        items.add("Yellow");
        items.add("Green");
        items.add("Magenta");
        items.add("Gray");
        items.add("Light Gray");
    }


}
