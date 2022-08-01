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
public class Bebida extends Produto{
    private double graduacaoAlcoolica;

    public Bebida(int codigo, String descricao, Date dataFabricacao, Date dataValidade, double valor, double graduacaoAlcoolica) {
        super(codigo, descricao, dataFabricacao, dataValidade, valor);
        this.graduacaoAlcoolica = graduacaoAlcoolica;
    }

    public double getGraduacaoAlcoolica() {
        return graduacaoAlcoolica;
    }

    public void setGraduacaoAlcoolica(double graduacaoAlcoolica) {
        this.graduacaoAlcoolica = graduacaoAlcoolica;
    }

    @Override
    public String toString() {
        return super.toString() + " GraduacaoAlcoolica: " + graduacaoAlcoolica;
    }
    
    
}
