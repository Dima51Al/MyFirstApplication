package com.example.myapplication;

import static java.lang.Math.round;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class LastActivity extends AppCompatActivity {


    static class Vitas {
        boolean isVit;
        String name;
        int num;
        double occupancy = 0;

        Vitas(boolean isVit, String name, int num) {
            this.isVit = isVit;
            this.name = name;
            this.num = num;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        double[] m = getIntent().getDoubleArrayExtra("M");

        Vitas A = new Vitas(true, "A ", 0);
        Vitas B1 = new Vitas(true, "B1", 1);
        Vitas B2 = new Vitas(true, "B2", 2);
        Vitas B3 = new Vitas(true, "B3", 3);
        Vitas B4 = new Vitas(true, "B4", 4);
        Vitas B5 = new Vitas(true, "B5", 5);
        Vitas B6 = new Vitas(true, "B6", 6);
        Vitas B7 = new Vitas(true, "B7", 7);
        Vitas B9 = new Vitas(true, "B9", 8);
        Vitas B12 = new Vitas(true, "B12", 9);
        Vitas C = new Vitas(true, "C ", 10);
        Vitas D = new Vitas(true, "D ", 11);
        Vitas E = new Vitas(true, "E ", 12);
        Vitas K = new Vitas(true, "K ", 13);

        if (m[1] == 1) {
            A.occupancy += 0.3;

        }
        if (m[2] == 1) {
            A.occupancy += 0.2;
        }
        if (m[3] == 1) {
            E.occupancy += 0.3;
            B1.occupancy += 0.2;
            B6.occupancy += 0.1;
        }
        if (m[4] == 1) {
            B2.occupancy += 0.2;
            B6.occupancy += 0.2;
        }
        if (m[5] == 1) {
            B3.occupancy += 0.2;
        }
        if (m[6] == 1) {
            B2.occupancy += 0.2;
        }
        if (m[7] == 1) {
            B3.occupancy += 0.2;
        }
        if (m[8] == 1) {
            A.occupancy += 0.2;
        }
        if (m[9] == 1) {
            B12.occupancy += 0.2;
            B6.occupancy += 0.2;
        }
        if (m[10] == 1) {
            B3.occupancy += 0.7;
        }
        if (m[11] == 1) {
            B7.occupancy += 0.1;
        }
        if (m[12] == 1) {
            B9.occupancy += 0.2;
        }
        if (m[13] == 1) {
            B9.occupancy += 0.2;
        }
        if (m[14] == 1) {
            B9.occupancy += 0.2;
        }
        if (m[15] == 1) {
            B9.occupancy += 0.2;
            B4.occupancy += 0.3;
            B6.occupancy += 0.2;
        }
        if (m[16] == 1) {
            B9.occupancy += 0.2;
        }
        if (m[17] == 1) {
            B9.occupancy += 0.2;
        }
        if (m[18] == 1) {
            B12.occupancy += 0.2;
        }
        if (m[19] == 1) {
            B12.occupancy += 0.2;
            E.occupancy += 0.2;
            B1.occupancy += 0.2;
        }
        if (m[20] == 1) {
            B12.occupancy += 0.2;
        }
        if (m[21] == 1) {
            B12.occupancy += 0.2;
        }
        if (m[22] == 1) {
            B12.occupancy += 0.2;
        }
        if (m[23] == 1) {
            B12.occupancy += 0.2;
        }
        if (m[24] == 1) {
            A.occupancy += 0.6;
        }
        if (m[25] == 1) {
            C.occupancy += 0.6;
        }

        if (m[26] == 1) {
            D.occupancy += 0.2;
        }
        if (m[27] == 1) {
            D.occupancy += 0.2;
            E.occupancy += 0.2;
        }
        if (m[28] == 1) {
            D.occupancy += 0.2;
        }
        if (m[29] == 1) {
            D.occupancy += 0.2;
        }
        if (m[30] == 1) {
            D.occupancy += 0.2;
            B1.occupancy += 0.2;
            B6.occupancy += 0.2;
            B7.occupancy += 0.1;
        }
        if (m[31] == 1) {
            E.occupancy += 0.2;
        }
        if (m[32] == 1) {
            K.occupancy += 0.7;
        }
        if (m[33] == 1) {
            B5.occupancy += 0.7;
        }
        if (m[34] == 1) {
            B5.occupancy += 0.8;
        }
        if (m[35] == 1) {
            B4.occupancy += 0.3;
        }
        if (m[36] == 1) {
            B4.occupancy += 0.2;
        }
        if (m[37] == 1) {
            B4.occupancy += 0.5;
        }

        
        final String[] vivod = new String[]{
                "Вероятность недостаточности   " + A.name + " ~ " + ramki((int) round((100 * A.occupancy))) + "%",
                "Вероятность недостаточности  " + B1.name + " ~ " + ramki((int) round((100 * B1.occupancy))) + "%",
                "Вероятность недостаточности  " + B2.name + " ~ " + ramki((int) round((100 * B2.occupancy))) + "%",
                "Вероятность недостаточности  " + B3.name + " ~ " + ramki((int) round((100 * B3.occupancy))) + "%",
                "Вероятность недостаточности  " + B4.name + " ~ " + ramki((int) round((100 * B4.occupancy))) + "%",
                "Вероятность недостаточности  " + B5.name + " ~ " + ramki((int) round((100 * B5.occupancy))) + "%",
                "Вероятность недостаточности  " + B6.name + " ~ " + ramki((int) round((100 * B6.occupancy))) + "%",
                "Вероятность недостаточности  " + B7.name + " ~ " + ramki((int) round((100 * B7.occupancy))) + "%",
                "Вероятность недостаточности  " + B9.name + " ~ " + ramki((int) round((100 * B9.occupancy))) + "%",
                "Вероятность недостаточности " + B12.name + " ~ " + ramki((int) round((100 * B12.occupancy))) + "%",
                "Вероятность недостаточности   " + C.name + " ~ " + ramki((int) round((100 * C.occupancy))) + "%",
                "Вероятность недостаточности   " + D.name + " ~ " + ramki((int) round((100 * D.occupancy))) + "%",
                "Вероятность недостаточности   " + E.name + " ~ " + ramki((int) round((100 * E.occupancy))) + "%",
                "Вероятность недостаточности   " + K.name + " ~ " + ramki((int) round((100 * K.occupancy))) + "%"
        };
        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, vivod);

        listView.setAdapter(adapter);
    }

    static String ramki(int s) {
        if ((s < 100) & (s >= 10)) return " " + s;
        if (s < 10) return "  " + s;
        return "100";


    }


}