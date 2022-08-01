/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supercompras;

import java.util.Date;

/**
 *
 * @author Monitoria Lab Gestao
 */
public class Limpeza extends Produto{
    private boolean nocivo;

    public Limpeza(int codigo, String descricao, Date dataFabricacao, Date dataValidade, double valor, boolean nocivo) {
        super(codigo, descricao, dataFabricacao, dataValidade, valor);
        this.nocivo = nocivo;
    }

    public boolean isNocivo() {
        return nocivo;
    }

    public void setNocivo(boolean nocivo) {
        this.nocivo = nocivo;
    }

    @Override
    public String toString() {
        return super.toString() + " Nocivo: " + nocivo ;
    }
    
    
    
}
