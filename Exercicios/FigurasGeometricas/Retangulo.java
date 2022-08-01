/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author Monitoria Lab Gestao
 */
public class Retangulo extends Geometria {

    public Retangulo(String cor) {
        super(cor);
    }
    
   @Override
    public void desenhar() {
        System.out.println("............");
        System.out.println(".          .");
        System.out.println(".          .");
        System.out.println("............");
    }
    
}
