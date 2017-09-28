package com.example.alex6.listview;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class areas_Circulo extends AppCompatActivity {

    private EditText radio;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas__circulo);

        res = this.getResources();
        radio = (EditText) findViewById(R.id.txtRadio);
    }

    public void  AreaCirculo(View v){

        double r = Double.parseDouble(radio.getText().toString());
        double calculo_area;
        Calculos p = new Calculos();
        p.CalcularArea_Circulo(r);
        p.getArea_Circulo();


        new AlertDialog.Builder(this).setMessage(res.getString(R.string.str_Area) +':' + p.getArea_Circulo())
                .setTitle(res.getString(R.string.str_Resultado))
                .setPositiveButton(res.getString(R.string.str_OK), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {

                    }
                }).show();

    }


    public void Limpiar(View v){
        radio.setText("");
        radio.setFocusable(true);
    }
}
