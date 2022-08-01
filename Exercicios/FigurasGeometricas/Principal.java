package com.mycompany.figurasgeometricas;

/**
 *
 * @author Monitoria Lab Gestao
 */
public class Principal {

    public static void main(String[] args) {
        CadastroGeometrias cadastro = new CadastroGeometrias(5);
        
        Geometria quadrado = new Quadrado("preto");
        cadastro.adicionar(quadrado);
        
        Geometria triangulo = new Triangulo("Prento");
        cadastro.adicionar(triangulo);
        
        Retangulo retangulo = new Retangulo("Preto");
        cadastro.adicionar(retangulo);
        
        Geometria losango = new Losango(("Preto"));
        cadastro.adicionar(losango);
                
        
        cadastro.desenharTodoMundo();
        
    }
}
