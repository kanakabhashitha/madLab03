package com.example.occutest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn1);
        txt = findViewById(R.id.txt1);

        Intent i = new Intent(this, MainActivity2.class);
        String name = "kanaka";
        i.putExtra("USER_NAME",name);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(i);

                btn = findViewById(R.id.btn2);

                btn = findViewById(R.id.btn1);
            }
        });

    }
}