package com.example.alex6.listview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Areas extends AppCompatActivity {

    private ListView lvAreasOpc;
    private Resources res;
    private String [] opc;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas);

        lvAreasOpc = (ListView)findViewById(R.id.lvAreas);
        res = this.getResources();
        opc = res.getStringArray(R.array.str_OpcAreas);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,opc);
        lvAreasOpc.setAdapter(adapter);


        lvAreasOpc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position){
                    case 0:
                        i = new Intent (Areas.this, areas_Cuadrado.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent (Areas.this, areas_Rectangulo.class);
                        startActivity(i);
                        break;

                    case 2:
                        i = new Intent (Areas.this, areas_triangulo.class);
                        startActivity(i);

                    case 3:
                        i = new Intent (Areas.this, areas_Circulo.class);
                        startActivity(i);
                        break;

                }

            }



        });


    }


    public static class Datos {
    }
}


