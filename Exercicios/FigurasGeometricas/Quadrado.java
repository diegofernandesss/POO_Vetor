
package com.mycompany.figurasgeometricas;

public class Quadrado extends Geometria{

    public Quadrado(String cor) {
        super(cor);
    }
    
    @Override
    public void desenhar() {
        System.out.println("............");
        System.out.println(".          .");
        System.out.println(".          .");
        System.out.println(".          .");
        System.out.println(".          .");
        System.out.println("............");
    }
    
}
