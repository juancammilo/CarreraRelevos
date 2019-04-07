/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrerarelevos;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author JuanCamilo
 * @author GabrielCañon
 */
public class Utilitaria {
    /**
     * Metodo estatico el cual genera un numero random 
     * @return devuelve un numero entero entre cero y tres
     */
    public static int generarNumero(){
        int numero = ThreadLocalRandom.current().nextInt(0, 3);
        return numero;
    }
}
