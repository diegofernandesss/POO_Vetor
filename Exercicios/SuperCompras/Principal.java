/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.supercompras;

import java.util.Date;

/**
 *
 * @author Monitoria Lab Gestao
 */
public class Principal {

    public static void main(String[] args) {
        Proprietario p = new Proprietario("João", new Date("10/01/1979"), "masculino");
        Mercadinho m = new Mercadinho("Comprão", p);
        
        Produto alimento = new Alimento(10, "Arroz", new Date("11/03/2021"), new Date("10/05/2023"), 5.00, "natural");
        m.adcionar(alimento);
        
        Produto bebida = new Bebida(11, "Suco", new Date("11/03/2022"), new Date("10/07/2023"), 5.00, 0.0);
        m.adcionar(bebida);
        
        Produto limpeza = new Limpeza(12, "Detergente", new Date("11/03/2022"), new Date("07/07/2022"), 5.00, false);
        m.adcionar(limpeza);
        
        System.out.println(m.consultar("Arroz"));
        
        System.out.println(m.getQuantidadeProdutos());
        
        m.produtosVencidos();
        
       System.out.println(m.valorTotalMercadorias());
        
    }
}
