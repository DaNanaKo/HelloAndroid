package com.example.helloandroid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnJump = (Button) findViewById(R.id.btn_jumpToSecond);
        btnJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder normalDialog =
                        new AlertDialog.Builder(MainActivity.this);
                normalDialog.setTitle("Continue Jump to the Other Activity");
                normalDialog.setPositiveButton("YES",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(MainActivity.this, com.example.helloandroid.SecondActivity.class);
                                startActivity(intent);
                            }
                        });
                normalDialog.setNegativeButton("NO",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // do nothing
                            }
                        });
                // display the AlertDialog
                normalDialog.show();
            }
        });

        Button btnJumpToConter = findViewById(R.id.btn_jumpToCounter);
        btnJumpToConter.setOnClickListener(view ->{
            Intent intent = new Intent (MainActivity.this, CounterActivity.class);
            startActivity(intent);
        });
    }
}