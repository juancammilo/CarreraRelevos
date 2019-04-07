/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrerarelevos;

/**
 *
 * @author JuanCamilo
 * @author GabrielCañon
 */
public class Logica {
        
    public Logica() {
        
        Equipo equipo1 = new Equipo("Equipo 1");
        Equipo equipo2 = new Equipo("Equipo 2");
        Equipo equipo3 = new Equipo("Equipo 3");
                
        //equipo1
        Atleta atleta1 = new Atleta(equipo1, 0, 33);
        Atleta atleta2 = new Atleta(equipo1, 33, 66);
        Atleta atleta3 = new Atleta(equipo1, 66, 100);
        
        //equipo2
        Atleta atleta4 = new Atleta(equipo2, 0, 33);
        Atleta atleta5 = new Atleta(equipo2, 33, 66);
        Atleta atleta6 = new Atleta(equipo2, 66, 100);
        
        //equipo3
        Atleta atleta7 = new Atleta(equipo3, 0, 33);
        Atleta atleta8 = new Atleta(equipo3, 33, 66);
        Atleta atleta9 = new Atleta(equipo3, 66, 100);
        
        atleta1.start();
        atleta2.start();
        atleta3.start();
        
        atleta4.start();
        atleta5.start();
        atleta6.start();
        
        atleta7.start();
        atleta8.start();
        atleta9.start();
        
    }
}
