package com.example.alex6.listview;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class areas_Cuadrado extends AppCompatActivity {

    private EditText ladoCuadrado;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas__cuadrado);

        res = this.getResources();
        ladoCuadrado = (EditText) findViewById(R.id.txtLado);
    }

    public void  AreaCuadrado(View v){

        double lado = Double.parseDouble(ladoCuadrado.getText().toString());
        double calculo_area;
        Calculos p = new Calculos();
        p.CalcularArea_Cuadrado(lado);
        p.getArea_Cuadrado();


        new AlertDialog.Builder(this).setMessage(res.getString(R.string.str_Area) +':' + p.getArea_Cuadrado())
                .setTitle(res.getString(R.string.str_Resultado))
                .setPositiveButton(res.getString(R.string.str_OK), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {

                    }
                }).show();

    }

    public void Limpiar(View v){
        ladoCuadrado.setText("");
        ladoCuadrado.setFocusable(true);
    }
}

