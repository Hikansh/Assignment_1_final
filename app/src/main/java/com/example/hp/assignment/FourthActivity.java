package com.example.hp.assignment;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity {

    ImageView im;
    Button bt;
    Uri imageuri;
private static final int PICK_IMAGE=100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        bt=(Button)findViewById(R.id.button);
        im=(ImageView)findViewById(R.id.imageView);
        bt.setVisibility(View.INVISIBLE);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opengallery();
            }
        });
    }

    private void opengallery() {

        Intent i=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(i,PICK_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK && requestCode==PICK_IMAGE){
            imageuri=data.getData();
            im.setImageURI(imageuri);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onDestroy() {
        Process.killProcess(Process.myPid());
        super.onDestroy();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


            if(item.getItemId()==R.id.logout) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Do you really want to logout?").setCancelable(false)
                        .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                              Intent inte=new Intent(FourthActivity.this,HomeActivity.class);
                                startActivity(inte);

                            }
                        })
                        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                }
                        );
                AlertDialog alert = builder.create();
                alert.setTitle("Logout..");
                alert.show();}


                if(item.getItemId()==R.id.exit) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage("Do you really want to Exit?").setCancelable(false)
                            .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                  finish();

                                }
                            })
                            .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            dialog.cancel();
                                        }
                                    }
                            );
                    AlertDialog alert = builder.create();
                    alert.setTitle("Exit..");
                    alert.show();}

                if(item.getItemId()==R.id.change){
                    bt.setVisibility(View.VISIBLE);
                }


        return super.onOptionsItemSelected(item);    }


    }

