package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LastActivity extends AppCompatActivity {


    static class Vitas {
        boolean isVit;
        String name;
        int num;
        double occupancy = 1;

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


        // Vitas Ca = new Vitas(false, "Ca");
        // Vitas Cl = new Vitas(false, "Cl");
        // Vitas Cr = new Vitas(false, "Cr");
        // Vitas Cu = new Vitas(false, "Cu");
        // Vitas F = new Vitas(false,  "F ");
        // Vitas I = new Vitas(false,  "I ");
        // Vitas Fe = new Vitas(false, "Fe");
        // Vitas Mg = new Vitas(false, "Mg");
        // Vitas Mn = new Vitas(false, "Mn");
        // Vitas Mo = new Vitas(false, "Mo");
        // Vitas P = new Vitas(false,  "P ");
        // Vitas Ka = new Vitas(false, "K ");
        // Vitas Se = new Vitas(false, "Se");
        // Vitas Na = new Vitas(false, "Na");
        // Vitas Zn = new Vitas(false, "Zn");

        if (m[1] == 1) {
            A.occupancy *= 1.3;

        }
        if (m[2] == 1) {
            A.occupancy *= 1.2;
        }
        if (m[3] == 1) {
            E.occupancy *= 1.3;
            B1.occupancy *= 1.2;
            B6.occupancy *= 1.1;
        }
        if (m[4] == 1) {
            B2.occupancy *= 1.2;
            B6.occupancy *= 1.2;
        }
        if (m[5] == 1) {
            B3.occupancy *= 1.2;
        }
        if (m[6] == 1) {
            B2.occupancy *= 1.2;
        }
        if (m[7] == 1) {
            B3.occupancy *= 1.2;
        }
        if (m[8] == 1) {
            A.occupancy *= 1.2;
        }
        if (m[9] == 1) {
            B12.occupancy *= 1.2;
            B6.occupancy *= 1.2;
        }
        if (m[10] == 1) {
            B3.occupancy *= 1.7;
        }
        if (m[11] == 1) {
            B7.occupancy *= 1.1;
        }
        if (m[12] == 1) {
            B9.occupancy *= 1.2;
        }
        if (m[13] == 1) {
            B9.occupancy *= 1.2;
        }
        if (m[14] == 1) {
            B9.occupancy *= 1.2;
        }
        if (m[15] == 1) {
            B9.occupancy *= 1.2;
            B4.occupancy *= 1.3;
            B6.occupancy *= 1.2;
        }
        if (m[16] == 1) {
            B9.occupancy *= 1.2;
        }
        if (m[17] == 1) {
            B9.occupancy *= 1.2;
        }
        if (m[18] == 1) {
            B12.occupancy *= 1.2;
        }
        if (m[19] == 1) {
            B12.occupancy *= 1.2;
            E.occupancy *= 1.2;
            B1.occupancy *= 1.2;
        }
        if (m[20] == 1) {
            B12.occupancy *= 1.2;
        }
        if (m[21] == 1) {
            B12.occupancy *= 1.2;
        }
        if (m[22] == 1) {
            B12.occupancy *= 1.2;
        }
        if (m[23] == 1) {
            B12.occupancy *= 1.2;
        }
        if (m[24] == 1) {
            A.occupancy *= 1.6;
        }
        if (m[25] == 1) {
            C.occupancy *= 1.6;
        }

        if (m[26] == 1) {
            D.occupancy *= 1.2;
        }
        if (m[27] == 1) {
            D.occupancy *= 1.2;
            E.occupancy *= 1.2;
        }
        if (m[28] == 1) {
            D.occupancy *= 1.2;
        }
        if (m[29] == 1) {
            D.occupancy *= 1.2;
        }
        if (m[30] == 1) {
            D.occupancy *= 1.2;
            B1.occupancy *= 1.2;
            B6.occupancy *= 1.2;
            B7.occupancy *= 1.1;
        }
        if (m[31] == 1) {
            E.occupancy *= 1.2;
        }
        if (m[32] == 1) {
            K.occupancy *= 1.7;
        }
        if (m[33] == 1) {
            B5.occupancy *= 1.7;
        }
        if (m[34] == 1) {
            B5.occupancy *= 1.8;
        }
        if (m[35] == 1) {
            B4.occupancy *= 1.3;
        }
        if (m[36] == 1) {
            B4.occupancy *= 1.2;
        }
        if (m[37] == 1) {
            B4.occupancy *= 1.5;
        }

        double[][] vits = new double[][]{{
                A.num,
                B1.num,
                B2.num,
                B3.num,
                B4.num,
                B5.num,
                B6.num,
                B7.num,
                B9.num,
                B12.num,
                C.num,
                D.num,
                E.num,
                K.num
        }
                ,
                {
                        A.occupancy,
                        B1.occupancy,
                        B2.occupancy,
                        B3.occupancy,
                        B4.occupancy,
                        B5.occupancy,
                        B6.occupancy,
                        B7.occupancy,
                        B9.occupancy,
                        B12.occupancy,
                        C.occupancy,
                        D.occupancy,
                        E.occupancy,
                        K.occupancy
                }
        };

        //TODO:
        //Написать отсортированный массив из массива Vits
        //И вывести его по типу Витамин A  67%
        final String[] vivod = new String[]{
                A.name + " - " + (100*A.occupancy/3)+ "%",
                B1.name + " - " +(100* B1.occupancy/1.73)+ "%",
                B2.name + " - " +(100* B2.occupancy/1.44)+ "%",
                B3.name + " - " +(100* B3.occupancy/2.448)+ "%",
                B4.name + " - " +(100* B4.occupancy/2)+ "%",
                B5.name + " - " +(100* B5.occupancy/3)+ "%",
                B6.name + " - " +(100* B6.occupancy/2.28)+ "%",
                B7.name + " - " +(100* B7.occupancy/1.21)+ "%",
                B9.name + " - " +(100* B9.occupancy/3)+ "%",
                B12.name + " - "+(100* B12.occupancy/3.6)+ "%",
                C.name + " - " + (100*C.occupancy/1.6)+ "%",
                D.name + " - " + (100*D.occupancy/2.48)+ "%",
                E.name + " - " + (100*E.occupancy/2.24)+ "%",
                K.name + " - " + (100*K.occupancy/1.7)+ "%"
        };
        ListView listView = (ListView) findViewById(R.id.listView);
       ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
               android.R.layout.simple_list_item_1, vivod);

        listView.setAdapter(adapter);
    }


}