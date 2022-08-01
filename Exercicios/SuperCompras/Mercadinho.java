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
public class Mercadinho {
    private String nome;
    private Proprietario proprietario;
    private Produto[] estoque;
    private  int indice;
    
    public Mercadinho(String nome, Proprietario proprietario){
        this.nome = nome;
        this.proprietario = proprietario;
        estoque = new Produto[1000];
        indice = 0;
    }
    
    public void adcionar(Produto p){
        if (indice < estoque.length){
            this.estoque[indice++] = p;
        }        
    }
    
    public Produto consultar(String descricao){
        for (int i = 0; i < indice; i++){
            if (estoque[i].getDescricao().equals(descricao)){
                return estoque[i];
            }
        }
        return null;
    }
    
    public void alterar(Produto alterado){
        for (int i = 0; i < indice; i++){
            if (estoque[i].getCodigo() == alterado.getCodigo()){
                estoque[i] = alterado;
                break;
            }
        }
    }
    
    public void excluir(int codigo){
        for (int i = 0; i < indice; i++){
            if (estoque[i].getCodigo() == codigo){
                for (int j = i; j < indice + 1; j++){
                    estoque[j] = estoque[j + 1];
                }  
                indice--;
                break;
            }
        }
    }
    
    public Produto maisAntigo(){
        Produto maisAntigo = null;
        if (indice > 0){
            maisAntigo = estoque[0];
            for (int i = 1; i < indice; i++){
               if (estoque[i].getDataFabricacao().before(maisAntigo.getDataFabricacao())){
                   maisAntigo = estoque[i];
               }
           }
        }
        
        return maisAntigo;
    }
    
    public double valorTotalMercadorias(){
        double total = 0;
        for (int i = 0; i < indice; i++){          
               total +=  estoque[i].getValor();
        }        
        return total;
    }
    
    public void produtosVencidos(){
            Date hoje = new Date();
            for (int i = 0; i < indice; i++){
               if (estoque[i].getDataValidade().before(hoje)){
                   System.out.println(estoque[i]);
               }
           }
    }
    
    public int getQuantidadeProdutos(){
        return indice;
    }
     

    public String getNome() {
        return nome;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }
    
    
    
}
