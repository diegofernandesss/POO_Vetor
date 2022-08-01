
package com.mycompany.figurasgeometricas;

public abstract class Geometria {
    private String cor;

    public Geometria(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public abstract void desenhar();
}
