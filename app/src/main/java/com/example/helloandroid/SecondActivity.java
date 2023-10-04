package com.example.helloandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.helloandroid.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    Button btnHideOrShowText = findViewById(R.id.btn_HideOrCloseText);
    TextView otherText = findViewById(R.id.textview_1);

        btnHideOrShowText.setOnClickListener(view -> {
        if (btnHideOrShowText.getText() == "SHOW") {
            btnHideOrShowText.setText("HIDE");
            otherText.setVisibility(View.VISIBLE);
        } else {
            btnHideOrShowText.setText("SHOW");
            otherText.setVisibility(View.GONE);
        }
    });
}
}