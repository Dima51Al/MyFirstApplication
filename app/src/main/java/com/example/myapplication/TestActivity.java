package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    int i = 0;

    public String[] asks = new String[]{
            "",
            "У Вас есть ощущение сухости глаз?",
            "Появились ли у вас недавно проблемы с кожей? ",
            "Вы ощущаете мышечную слабость?",
            "У Вас появились трещины или язвы вокруг уголков рта?",
            "У Вас появились в недавнее время проблемы с пищеварением?",
            "У Вас есть ощущение опухшести языка? +B2",
            "У Вас есть чувство спутанности сознания? +B3",
            "У Вас стали выпадать волосы? +A",
            "Вы стали ощущать себя депрессивно? +B12 +B6",
            "У Вас появилась кожная сыпь? B3",
            "В недавние время ломали кости из-а чего-то несущественного? B7",
            "У Вас плохая усваимость пищи? +b9",
            "У Вас алкоголизм? +b9",
            "У Вас есть проблемы с концентрацией? +b9",
            "Вы стали раздражительнее в последнее время? +b9 +b4",
            "У Вас есть учащенное сердцебиение и отдышка? +b9",
            "У Вас появились язвы на языке? +b9",
            "У Вас немели руки или ноги? +b12",
            "У Вас есть проблемы с ходьбой и балансом? +b12 +E",
            "у Вас повышенная усталость? +b12",
            "У Вас есть проблемы с памятью? +b12",
            "Вы ощущаете паранойу? +b12",
            "Вас посещали голюцинации? +b12",
            "У Вас нарушена адаптация глаз к темноте? +A",
            "У Вас стали ломаться и расслаиваться ногти? +С",
            "Ваши ногти сменили цвет? +D",
            "У Вас ухудшилось зрение? +D +E",
            "У Вас есть жжение во рту и горле? +D",
            "У Вас есть бессоница? +D",
            "У Вас есть потеря аппетита? +D",
            "Вы ощущаете онемение и покалывание? +E",
            "У Вас наблюдается чрезмерное кровотечение? +K",
            "У вас есть ощущение жжения пальцев ног? +B5",
            "У Вас есть мучительные боли в ногах в ночное время? +B5",
            "У Вас появляется чувство усталости?",
            "Вы ощущаете слабость?",
            "У Вас участились нервные срывы?",
            //"38) ",
            //"39) ",
            //"40) ",
            //"41) ",
            //"42) ",
            //"43) ",
            //"44) ",
            //"45) ",
            //"46) ",
            //"47) ",
            //"48) ",
            //"49) ",
            //"50) "
    };
    int countN = asks.length;

    public double[] m = new double[countN];


    public void onClickPass(View view) {
        if(i == countN - 1){
            Intent intent = new Intent(this, LastActivity.class);
            intent.putExtra("M", m);
            startActivity(intent);
        }
        i++;
        m[i-1] = 0;
        TextView ask = findViewById(R.id.TextAsk);
        ask.setText(asks[i-1]);
    }

    public void onClickNo(View view) {
        if(i == countN - 1){
            Intent intent = new Intent(this, LastActivity.class);
            intent.putExtra("M", m);
            startActivity(intent);
        }
        i++;
        m[i-1] = -1;
        TextView ask = findViewById(R.id.TextAsk);
        ask.setText(asks[i-1]);
    }

    public void onClickYes(View view) {
        if(i == countN - 1){
            Intent intent = new Intent(this, LastActivity.class);
            intent.putExtra("M", m);
            startActivity(intent);

        }
        i++;
        m[i-1] = 1;
        TextView ask = findViewById(R.id.TextAsk);
        ask.setText(asks[i-1]);
    }
}