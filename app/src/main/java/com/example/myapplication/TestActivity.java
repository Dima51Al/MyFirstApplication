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
            "01) У Вас есть ощущение сухости глаз? +A",
            "02) Появились ли у вас недавно проблемы с кожей? +A",
            "03) Вы ощущаете мышечную слабость? +E +B1",
            "04) У Вас появились трещины или язвы вокруг уголков рта? +B2",
            "05) У Вас появились в недавнее время проблемы с пищеварением? +B3",
            "06) У Вас есть ощущение опухшести языка? +B2",
            "07) У Вас есть чувство спутанности сознания? +B3",
            "08) У Вас стали выпадать волосы? +A",
            "09) Вы стали ощущать себя депрессивно? +B12 +B6",
            "10) У Вас появилась кожная сыпь? B3",
            "11) В недавние время ломали кости из-а чего-то несущественного? B7",
            "12) У Вас плохая усваимость пищи? +b9",
            "13) У Вас алкоголизм? +b9",
            "14) У Вас есть проблемы с концентрацией? +b9",
            "15) Вы стали раздражительнее в последнее время? +b9 +b4",
            "16) У Вас есть учащенное сердцебиение и отдышка? +b9",
            "17) У Вас появились язвы на языке? +b9",
            "18) У Вас немели руки или ноги? +b12",
            "19) У Вас есть проблемы с ходьбой и балансом? +b12 +E",
            "20) у Вас повышенная усталость? +b12",
            "21) У Вас есть проблемы с памятью? +b12",
            "22) Вы ощущаете паранойу? +b12",
            "23) Вас посещали голюцинации? +b12",
            "24) У Вас нарушена адаптация глаз к темноте? +A",
            "25) У Вас стали ломаться и расслаиваться ногти? +С",
            "26) Ваши ногти сменили цвет? +D",
            "27) У Вас ухудшилось зрение? +D +E",
            "28) У Вас есть жжение во рту и горле? +D",
            "29) У Вас есть бессоница? +D",
            "30) У Вас есть потеря аппетита? +D",
            "31) Вы ощущаете онемение и покалывание? +E",
            "32) У Вас наблюдается чрезмерное кровотечение? +K",
            "33) У вас есть ощущение жжения пальцев ног? +B5",
            "34) У Вас есть мучительные боли в ногах в ночное время? +B5",
            "35) У Вас появляется чувство усталости?",
            "36) Вы ощущаете слабость?",
            "37) У Вас участились нервные срывы?",
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