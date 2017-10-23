package com.example.hp.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    SecondActivity obj=new SecondActivity();
    RelativeLayout relativeLayout;
    ImageButton btn2;
    CheckBox sports;
    CheckBox fitness;
    CheckBox news;
    CheckBox gaming;
    CheckBox food;
    CheckBox movies;
    public int c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        c=obj.selected;
        relativeLayout=(RelativeLayout)findViewById(R.id.thirdlayout);
        relativeLayout.setBackgroundColor(c);
        btn2=(ImageButton)findViewById(R.id.btn2);

        sports=(CheckBox)findViewById(R.id.sports);
        food=(CheckBox)findViewById(R.id.food);
        gaming=(CheckBox)findViewById(R.id.gaming);
        news=(CheckBox)findViewById(R.id.news);
        fitness=(CheckBox)findViewById(R.id.fitness);
        movies=(CheckBox)findViewById(R.id.movies);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result=new StringBuilder();

                if (sports.isChecked()) {
                    result.append("\nSports");
                }

                if (food.isChecked()) {
                    result.append("\nFood");
                }

                if (movies.isChecked()) {
                    result.append("\nMovies");
                }
                if (fitness.isChecked()) {
                    result.append("\nFitness");
                }
                if (news.isChecked()) {
                    result.append("\nNews");
                }
                if (gaming.isChecked()) {
                    result.append("\nGaming");
                }

                Toast.makeText(getApplicationContext(),"You Selected:\n" + result, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ThirdActivity.this,FourthActivity.class);
                startActivity(intent);

            }
        });

    }
}
