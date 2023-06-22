package com.example.xardkor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class DayOneActivity extends AppCompatActivity {


    private TextView dayText;
    private Button button2;

    private String random;


    private String name;
    private String money;
    private String mesto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_one);

        dayText = findViewById(R.id.dayText);
        button2 = findViewById(R.id.button2);

        Random random = new Random();
        int n = 100000 + random.nextInt(900000);



        Bundle bundleIntent = getIntent().getExtras();



        int data = 21;
        name = bundleIntent.get("name").toString();
        money = bundleIntent.get("money").toString();
        mesto = bundleIntent.get("mesto").toString();

        dayText.setText("ФИО:  " + name + "\n"
                + "Место:   " + mesto + "\n"
                + "Дата:  " + data + " Июня" + "\n"
                + "Время отправки и прибытия:  " + "10:00 - 12:00" + "\n"
                + "ID билета:  " + n + "\n"
        + "Статус оплаты: успешно.");


        button2.setOnClickListener(listener);

    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), OneDayActivity.class);
            startActivities(new Intent[]{intent});
        }
    };

    }
