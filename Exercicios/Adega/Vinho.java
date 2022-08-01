package com.mycompany.adega;

import java.util.Date;

public abstract class Vinho {
    private String nome, tipoUva, fabricante;
    private Date dataFabricacao;
    private double valor;

    public Vinho(String nome, String tipoUva, String fabricante, Date dataFabricacao, double valor) {
        this.nome = nome;
        this.tipoUva = tipoUva;
        this.fabricante = fabricante;
        this.dataFabricacao = dataFabricacao;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoUva() {
        return tipoUva;
    }

    public void setTipoUva(String tipoUva) {
        this.tipoUva = tipoUva;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Vinho{" + "nome=" + nome + ", tipoUva=" + tipoUva + ", fabricante=" + fabricante + ", dataFabricacao=" + dataFabricacao + ", valor=" + valor + '}';
    }
    
}
