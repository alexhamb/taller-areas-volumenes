package com.example.alex6.listview;

import java.util.ArrayList;

/**
 * Created by alex6 on 28/09/2017.
 */

public class Datos {
    private static ArrayList<Calculos> calculos = new ArrayList<>();

    public static void Guardar(Calculos p){
        calculos.add(p);
    }

    public  static ArrayList<Calculos> getCalculos(){
        return calculos;
    }
}

