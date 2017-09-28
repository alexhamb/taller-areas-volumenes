package com.example.alex6.listview;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class volumenes_Cubo extends AppCompatActivity {

    private EditText ladoCubo;
    private Resources res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumenes__cubo);

        res = this.getResources();
        ladoCubo = (EditText) findViewById(R.id.txtLado);
    }

    public void  VolCubo(View v){

        double lado = Double.parseDouble(ladoCubo.getText().toString());
        double calculo_area;
        Calculos p = new Calculos();
        p.CalcularVol_Cubo(lado);
        p.getVol_Cubo();


        new AlertDialog.Builder(this).setMessage(res.getString(R.string.str_Volumen) +':' + p.getVol_Cubo())
                .setTitle(res.getString(R.string.str_Resultado))
                .setPositiveButton(res.getString(R.string.str_OK), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {

                    }
                }).show();

    }
    public void Limpiar(View v){
        ladoCubo.setText("");
        ladoCubo.setFocusable(true);
    }
}
