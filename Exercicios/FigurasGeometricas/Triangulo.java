
package com.mycompany.figurasgeometricas;

public class Triangulo extends Geometria{

    public Triangulo(String cor) {
        super(cor);
    }
    
       @Override
    public void desenhar() {
        System.out.println("      .     ");
        System.out.println("   .     .");       
        System.out.println("  ..........");
    }
    
    
}
