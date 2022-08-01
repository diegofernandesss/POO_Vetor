
package com.mycompany.figurasgeometricas;

public class CadastroGeometrias {
    private Geometria[] geometrias;
    private int indice;
    
    public CadastroGeometrias(int tamanho){
        geometrias = new Geometria[tamanho];
        indice = 0;
    }
    
    public void adicionar(Geometria g){
        if (indice < geometrias.length){
            geometrias[indice++] = g;
        }        
    }
    
    public void desenharTodoMundo(){
        for (int i = 0; i < indice; i++){
            geometrias[i].desenhar();
        }
    }
}
