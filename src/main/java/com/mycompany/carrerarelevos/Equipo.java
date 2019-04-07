/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrerarelevos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanCamilo  
 * @author GabrielCañon
 */
public class Equipo {
    
    /**
     * Variable que guarda los pasos que da el primer atleta
     */
    private int pasosAtleta1=0;
    
    /**
     * Variable que guarda los pasos que da el segundo atleta
     */
    private int pasosAtleta2=32;
    
    /**
     * Variable que guarda los pasos que da el tercer atleta
     */
    private int pasosAtleta3=65;
    
    /**
     * Variable que guarda el nombre del equipo
     */
    private String nombre;
    
    /**
     * Variable que guarda la pista donde se visualizan los atletas
     */
    private String pista;
    
    /**
     * Variable para visualizar mejor la pista
     */    
    private static int conteo;
    
    /**
     * Constructor que pide solo un parametro
     * @param nombre el nombre que le van a colocar al equipo
     */
    public Equipo( String nombre) {
        
        this.nombre = nombre;
    }
    
    /**
     * Metodo que recibe un parametro, y muestra en pantalla la pista 
     * @param nombre recibe el nombre del equipo 
     */
    public void imprimir(String nombre){
        pista = "";
        for (int i = 0; i <= 100; i++) {
            if(i==0){
                pista += nombre+": ";
            }
            if(i == pasosAtleta1){
                pista += "#";
            }
            if(i == pasosAtleta2){
                pista += "#";
            }
            if(i == pasosAtleta3){
                pista += "#";
            }
            pista += "_";            
        }
        System.out.println(pista);
        conteo += 1;
        if (conteo >= 3){
            conteo = 0;
            System.out.println("\n\n");
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Equipo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPasosAtleta1() {
        return pasosAtleta1;
    }

    public void setPasosAtleta1(int pasosAtleta1) {
        this.pasosAtleta1 = pasosAtleta1;
    }

    public int getPasosAtleta2() {
        return pasosAtleta2;
    }

    public void setPasosAtleta2(int pasosAtleta2) {
        this.pasosAtleta2 = pasosAtleta2;
    }

    public int getPasosAtleta3() {
        return pasosAtleta3;
    }

    public void setPasosAtleta3(int pasosAtleta3) {
        this.pasosAtleta3 = pasosAtleta3;
    }
    
    
    
}
