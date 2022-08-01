
package com.mycompany.figurasgeometricas;

public class Losango extends Geometria{

    public Losango(String cor) {
        super(cor);
    }
    
       @Override
    public void desenhar() {
        System.out.println("      .     ");
        System.out.println("  .      .");       
        System.out.println(" .         .");
        System.out.println("  .      .");
         System.out.println("     .     ");
    }
}
