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
 * @author Jkammilo
 */
public class Atleta extends Thread{
    
    private Equipo equipo;
    
    private int pasosInicio;
    
    private int pasosFin;
    
    private boolean terminar;
    
    //private String pista = "____________________________________________________________________________________________________";
    
    public Atleta(Equipo equipo, int pasosInicio, int pasosFin, boolean terminar) {
        this.equipo = equipo;
        this.pasosInicio = pasosInicio;
        this.pasosFin = pasosFin;
        this.terminar = terminar;
    }
    
    @Override
    public void run(){
        if(pasosInicio==0 ){
            do{
                int numPasos = Utilitaria.generarNumero();
                    
                equipo.setPasosAtleta1(equipo.getPasosAtleta1()+ numPasos);
                                
                if(equipo.getPasosAtleta1()> 33){
                    equipo.setPasosAtleta1(33);
                }
                equipo.imprimir(equipo.getNombre());
                
            }while(equipo.getPasosAtleta1() < 33);
            synchronized(equipo){
                equipo.notifyAll();
            }
            
        }else{
            synchronized(equipo){
                try {
                        equipo.wait();
                }catch (InterruptedException ex) {
                        Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(pasosInicio == 33){
                    do{
                        int numPasos = Utilitaria.generarNumero();

                        equipo.setPasosAtleta2(equipo.getPasosAtleta2()+ numPasos);
                        
                        if(equipo.getPasosAtleta2()> 66){
                            equipo.setPasosAtleta2(66);
                        }
                        equipo.imprimir(equipo.getNombre());
                        
                    }while(equipo.getPasosAtleta2() < 66);
                    synchronized(equipo){
                        equipo.notify();
                    }
                }else{
                    synchronized(equipo){
                        try {
                                equipo.wait();
                        }catch (InterruptedException ex) {
                                Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        if(pasosInicio == 66){
                            do{
                                int numPasos = Utilitaria.generarNumero();

                                equipo.setPasosAtleta3(equipo.getPasosAtleta3()+ numPasos);
                                
                                if(equipo.getPasosAtleta3() >= 100){
                                    equipo.setPasosAtleta3(100);
                                }
                                equipo.imprimir(equipo.getNombre());
                                                                                                
                            }while(equipo.getPasosAtleta3()< 100);
                            System.out.println("Gano el: "+equipo.getNombre()+" con "+equipo.getPasosAtleta3()+" pasos");
                            System.exit(0);
                        }
                    }
                }
            }
        }
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
    public int getPasosInicio() {
        return pasosInicio;
    }

    public void setPasosInicio(int pasosInicio) {
        this.pasosInicio = pasosInicio;
    }

    public int getPasosFin() {
        return pasosFin;
    }

    public void setPasosFin(int pasosFin) {
        this.pasosFin = pasosFin;
    }

    public boolean isTerminar() {
        return terminar;
    }

    public void setTerminar(boolean terminar) {
        this.terminar = terminar;
    }
    
    
}
