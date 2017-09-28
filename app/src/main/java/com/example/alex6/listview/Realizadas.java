package com.example.alex6.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Realizadas extends AppCompatActivity {

    private TableLayout tabla;
    private String aux;
    private ArrayList<Calculos> calculos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realizadas);
        tabla = (TableLayout)findViewById(R.id.tblRealizadas);
        calculos = Datos.getCalculos();

        for(int i =0; i < calculos.size(); i++){

            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);

            c1.setText("" + i+1);
            // c3.setText(calculos.get(i).getLado_Cuadrado());
            //c4.setText(calculos.get(i).getArea_Cuadrado());
            // c4.setText(calculos.get(i).getArea_Cuadrado());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);

            tabla.addView(fila);


        }

    }
}
