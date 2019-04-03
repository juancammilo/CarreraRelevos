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
    public static int generarNumero(){
        /**
         * @parametro numero aleatorio de 0 a 3
         */
        int numero = ThreadLocalRandom.current().nextInt(0, 3);
        return numero;
    }
}
