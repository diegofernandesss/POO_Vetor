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
public class Alimento extends Produto {
    private String classificacao;
    
    public Alimento(int codigo, String descricao, Date dataFabricacao, Date dataValidade, double valor, String classificacao){
        super(codigo, descricao, dataFabricacao, dataValidade, valor);
        this.classificacao = classificacao;     
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public String toString() {
        return super.toString() + " Classificacao: " + classificacao;
    }
    
    
}
