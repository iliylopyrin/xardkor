package com.example.xardkor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OneDayActivity extends AppCompatActivity {


    private EditText nameLn;
    private EditText moneyLn;
    private EditText mestoLn;
    private Button forma;

    private Button back;

    private String name;
    private String money;
    private String mesto;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_day);


        back = findViewById(R.id.back);
        forma = findViewById(R.id.forma);
        nameLn = findViewById(R.id.nameLn);
        moneyLn = findViewById(R.id.moneyLn);
        mestoLn = findViewById(R.id.mestoLn);

        back.setOnClickListener(listenner);

        forma.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            name = nameLn.getText().toString();
            money = moneyLn.getText().toString();
            mesto = mestoLn.getText().toString();


            Intent intent = new Intent(getApplicationContext(), DayOneActivity.class);

            intent.putExtra("name", name);
            intent.putExtra("money", money);
            intent.putExtra("mesto", mesto);

            startActivities(new Intent[]{intent});
        }
    };
    private View.OnClickListener listenner = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
            startActivities(new Intent[]{intent});

        }
    };
}