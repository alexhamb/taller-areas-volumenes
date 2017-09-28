package com.example.alex6.listview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Volumenes extends AppCompatActivity {
    private ListView lvVolOpc;
    private Resources res;
    private String [] opc;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumenes);

        lvVolOpc = (ListView)findViewById(R.id.lvVol);
        res = this.getResources();
        opc = res.getStringArray(R.array.str_OpcVolumenes);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,opc);
        lvVolOpc.setAdapter(adapter);


        lvVolOpc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position){
                    case 0:
                        i = new Intent (Volumenes.this, volumenes_Esfera.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent (Volumenes.this, volumenes_Cilindro.class);
                        startActivity(i);
                        break;

                    case 2:
                        i = new Intent (Volumenes.this, volumenes_Cono.class);
                        startActivity(i);

                    case 3:
                        i = new Intent (Volumenes.this, volumenes_Cubo.class);
                        startActivity(i);
                        break;

                }

            }



        });
    }
}
