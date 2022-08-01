
package com.mycompany.adega;

import java.util.Date;

public class VinhoBranco extends Vinho{
        private String tipo;

    public VinhoBranco(String nome, String tipoUva, String fabricante, Date dataFabricacao, double valor, String tipo) {
        super(nome, tipoUva, fabricante, dataFabricacao, valor);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "VinhoBranco{" + "tipo=" + tipo + '}' + super.toString();
    }
     
    
        
}
