package com.upchiapas.C2ISACE4.Models;

public class CalcularVolumen {

    private double volumen;

    public void CVolumen(double radio){
        volumen = (4.0/3) * Math.PI * (radio * radio * radio);
        Impresion impresion = new Impresion();
        impresion.resultado(volumen);
    }
}
