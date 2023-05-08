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
            "Приложение носит рекомендательный характер, для продолжения нажмите на любую кнопку",
            " У Вас есть ощущение сухости глаз?",
            " Появились ли у вас недавно проблемы с кожей?",
            " Вы ощущаете мышечную слабость?",
            " У Вас появились трещины или язвы вокруг уголков рта? ",
            " У Вас появились в недавнее время проблемы с пищеварением? ",
            " У Вас есть ощущение опухшести языка?",
            " У Вас есть чувство спутанности сознания? ",
            " У Вас стали выпадать волосы?",
            " Вы стали ощущать себя депрессивно? ",
            " У Вас появилась кожная сыпь?",
            " В недавние время ломали кости из-а чего-то несущественного?",
            " У Вас плохая усваимость пищи? ",
            " У Вас алкоголизм? ",
            " У Вас есть проблемы с концентрацией?",
            " Вы стали раздражительнее в последнее время? ",
            " У Вас есть учащенное сердцебиение и отдышка?",
            " У Вас появились язвы на языке?",
            " У Вас немели руки или ноги? ",
            " У Вас есть проблемы с ходьбой и балансом? ",
            " у Вас повышенная усталость?",
            " У Вас есть проблемы с памятью? ",
            " Вы ощущаете паранойу? ",
            " Вас посещали голюцинации?",
            " У Вас нарушена адаптация глаз к темноте?",
            " У Вас стали ломаться и расслаиваться ногти?",
            " Ваши ногти сменили цвет? ",
            " У Вас ухудшилось зрение? ",
            " У Вас есть жжение во рту и горле? ",
            " У Вас есть бессоница? ",
            " У Вас есть потеря аппетита?",
            " Вы ощущаете онемение и покалывание? ",
            " У Вас наблюдается чрезмерное кровотечение? ",
            " У вас есть ощущение жжения пальцев ног? ",
            " У Вас есть мучительные боли в ногах в ночное время?",
            " У Вас появляется чувство усталости?",
            " Вы ощущаете слабость?",
            " У Вас участились нервные срывы?",
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