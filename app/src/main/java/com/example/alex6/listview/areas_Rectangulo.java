package com.example.alex6.listview;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class areas_Rectangulo extends AppCompatActivity {

    private EditText base, altura;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas__rectangulo);

        res = this.getResources();
        base = (EditText) findViewById(R.id.txtBase);
        altura = (EditText)findViewById(R.id.txtAltura);

    }

    public void  AreaRectangulo(View v){

        double b = Double.parseDouble(base.getText().toString());
        double h = Double.parseDouble(altura.getText().toString());
        double calculo_area;
        Calculos p = new Calculos();
        p.CalcularArea_Rectangulo(b,h);
        p.getArea_Rectangulo();


        new AlertDialog.Builder(this).setMessage(res.getString(R.string.str_Area) +':' + p.getArea_Rectangulo())
                .setTitle(res.getString(R.string.str_Resultado))
                .setPositiveButton(res.getString(R.string.str_OK), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {

                    }
                }).show();

    }


    public void Limpiar(View v){
        base.setText("");
        altura.setText("");
        base.setFocusable(true);
    }
}
