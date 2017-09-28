package com.example.alex6.listview;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class volumenes_Cono extends AppCompatActivity {

    private EditText radio, altura;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumenes__cono);

        res = this.getResources();
        radio= (EditText) findViewById(R.id.txtRadioCono);
        altura = (EditText)findViewById(R.id.txtAlturaCono);

    }

    public void  VolCono(View v){

        double r = Double.parseDouble(radio.getText().toString());
        double h = Double.parseDouble(altura.getText().toString());

        Calculos p = new Calculos();
        p.CalcularVol_Cono(h,r);
        p.getVol_Cono();


        new AlertDialog.Builder(this).setMessage(res.getString(R.string.str_Volumen) +':' + p.getVol_Cono())
                .setTitle(res.getString(R.string.str_Resultado))
                .setPositiveButton(res.getString(R.string.str_OK), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {

                    }
                }).show();

    }
    public void Limpiar(View v){
        radio.setText("");
        altura.setText("");
        radio.setFocusable(true);
    }
}