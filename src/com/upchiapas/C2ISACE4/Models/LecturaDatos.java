package com.upchiapas.C2ISACE4.Models;

import java.util.Scanner;
public class LecturaDatos {
    private double radio;

    private Scanner entrada = new Scanner(System.in);

    public LecturaDatos() {
    }
    public void leerDatos(){
        System.out.println("Dame la longitud de radio");
        radio = entrada.nextDouble();
        CalcularVolumen objetoVolumen = new CalcularVolumen();
        objetoVolumen.CVolumen(radio);
    }
}
