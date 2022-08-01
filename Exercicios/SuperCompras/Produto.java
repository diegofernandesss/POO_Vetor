

package com.mycompany.supercompras;

import java.util.Date;

/**
 *
 * @author Monitoria Lab Gestao
 */
public class Produto {
    private int codigo;
    private String descricao;
    private Date dataFabricacao, dataValidade;
    private double valor;

    public Produto(int codigo, String descricao, Date dataFabricacao, Date dataValidade, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
        this.valor = valor;
    }
    
    
    public int getCodigo(){
        return codigo;
    }
   
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String toString(){
        return "Código: " + codigo + " Descrição: " + descricao + " Data de fabricação: " + dataFabricacao + " Data de validade: " + dataValidade + " Valor: " + valor;
    }
    
}
