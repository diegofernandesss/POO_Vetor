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
public class Proprietario {
    private String nome;
    private Date nascimento;
    private String sexo;
    
    public Proprietario(String nome, Date nascimento, String sexo){
        this.nome = nome;
        this.nascimento = nascimento;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Proprietario{" + "nome=" + nome + ", nascimento=" + nascimento + ", sexo=" + sexo + '}';
    }
    
}
