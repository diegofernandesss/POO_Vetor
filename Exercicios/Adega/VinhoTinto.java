
package com.mycompany.adega;

import java.util.Date;


public class VinhoTinto extends Vinho{
    private int safra;

    public VinhoTinto(String nome, String tipoUva, String fabricante, Date dataFabricacao, double valor, int safra) {
        super(nome, tipoUva, fabricante, dataFabricacao, valor);
        this.safra = safra;
    }

    public int getSafra() {
        return safra;
    }

    public void setSafra(int safra) {
        this.safra = safra;
    }

    @Override
    public String toString() {
        return "VinhoTinto{" + "safra=" + safra + '}' + super.toString();
    }
    
    
}
