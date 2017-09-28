package com.example.alex6.listview;

/**
 * Created by alex6 on 28/09/2017.
 */

public class Calculos {

    private  double pi = 3.1416;
    private  double lado;
    private  double base, altura;
    private  double radio;
    private  double calculo, area,volumen;

    // ---------------------------------------------------------------------- AREAS
    // Cuadrado
    public double getLado_Cuadrado(){
        return lado;
    }
    public void setLado_Cuadrado(double pLado){
        this.lado = pLado;
    }
    public void setArea_Cuadrado(double pArea){
        this.area = pArea;
    }
    public void CalcularArea_Cuadrado(double pLado){
        area = (pLado*pLado);
    }
    public double  getArea_Cuadrado(){
        return area;
    }


    // Rectángulo
    public  double getAltura_Rectangulo(){ return altura; }
    public void setAltura_Rectangulo(double pAltura){ this.altura = pAltura;}
    public double getBase_Rectangulo(){return base;}
    public void setBase_Rectangulo(double pBase){ this.altura = pBase;}
    public void CalcularArea_Rectangulo(double pBase, double pAltura){area = (pBase*pAltura);}
    public double getArea_Rectangulo(){
        return area;
    }

    // Triángulo
    public  double getAltura_Triangulo(){ return altura; }
    public void setAltura_Triangulo(double pAltura){ this.altura = pAltura;}
    public double getBase_Triangulo(){return base;}
    public void setBase_Triangulo(double pBase){ this.altura = pBase;}
    public void CalcularArea_Triangulo(double pBase, double pAltura){area = (pAltura*pAltura)/2;}
    public double  getArea_Triangulo(){
        return area;
    }

    // Circulo
    public  double getRadio_Circulo(){ return radio; }
    public void setRadio_Circulo(double pRadio){ this.radio = pRadio;}
    public void CalcularArea_Circulo(double pRadio){area = pi*(pRadio*pRadio);}
    public double  getArea_Circulo(){
        return area;
    }

    // ---------------------------------------------------------------------- VOLUMENES

    // Esfera
    public  double getRadio_Esfera(){ return radio; }
    public void setRadio_Esfera(double pRadio){ this.radio = pRadio;}
    public void CalcularVol_Esfera(double pRadio){volumen= pi*(pRadio*pRadio*pRadio);}
    public double  getVol_Esfera(){
        return volumen;
    }

    // Cilindro
    public  double getRadio_Cilindro(){ return radio; }
    public void setRadio_Cilindro(double pRadio){ this.radio = pRadio;}
    public void CalcularVol_Cilindro(double pAltura,double pRadio) {
        volumen= pi*(pRadio*pRadio*pAltura);
    }
    public double  getVol_Cilindro(){
        return volumen;
    }

    // Cono
    public  double getRadio_Cono(){ return radio; }
    public void setRadio_Cono(double pRadio){ this.radio = pRadio;}
    public void CalcularVol_Cono(double pAltura,double pRadio){
        volumen= (pi*pRadio*pRadio*pAltura)/3;
    }
    public double  getVol_Cono(){
        return volumen;
    }

    // Cubo
    public double getLado_Cubo(){
        return lado;
    }
    public void setLado_Cubo(double pLado){this.lado = pLado;}
    public void setVol_Cubo(double pVol){this.volumen = pVol;}
    public void CalcularVol_Cubo(double pLado){
        volumen = (pLado*pLado*pLado);
    }
    public double  getVol_Cubo(){
        return volumen;
    }

}

