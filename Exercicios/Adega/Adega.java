
package com.mycompany.adega;

public class Adega {
    private Vinho[][] colmeia = new Vinho[20][10];
    private int linha, coluna;
    public void adicionar(Vinho v){  
        if (linha < colmeia.length){
            colmeia[linha][coluna++] = v;
            if (coluna == colmeia[linha].length){
               coluna = 0;
               linha++;
           }
        }        
    }
    
    public void vinhosPorTipo(String tipo){
        for (int linha = 0; linha < colmeia.length; linha++){
            for (int coluna = 0; coluna < colmeia[linha].length; coluna++){
                if (colmeia[linha][coluna] != null){
                    if (tipo.equals("Vinho Branco")){
                         if (colmeia[linha][coluna] instanceof VinhoBranco){
                             System.out.println(colmeia[linha][coluna]);
                          }
                    }else if (tipo.equals("Vinho Tinto")){
                        if (colmeia[linha][coluna] instanceof VinhoTinto){
                             System.out.println(colmeia[linha][coluna]);
                          }
                    }          
                }
            }
        }
    }
    
    public int quantidadeGarrafas(){
        int quantidade = 0;
        for (int linha = 0; linha < colmeia.length; linha++){
            for (int coluna = 0; coluna < colmeia[linha].length; coluna++){
                if (colmeia[linha][coluna] != null){
                     quantidade++;
                }
            }
        }
        
        return quantidade;
    }
    
    
     public double valorAdega(){
        double valorTotal = 0;
        for (int linha = 0; linha < colmeia.length; linha++){
            for (int coluna = 0; coluna < colmeia[linha].length; coluna++){
                if (colmeia[linha][coluna] != null){
                     valorTotal = valorTotal +  colmeia[linha][coluna].getValor();
                }
            }
        }
        
        return valorTotal;
    }
    
     
     public Vinho maisAntigo(){
        Vinho maisAntigo = colmeia[0][0];
        for (int linha = 0; linha < colmeia.length; linha++){
            for (int coluna = 0; coluna < colmeia[linha].length; coluna++){
                if (colmeia[linha][coluna] != null){
                     if (colmeia[linha][coluna].getDataFabricacao().before(maisAntigo.getDataFabricacao())){
                         maisAntigo = colmeia[linha][coluna];
                     }
                }
            }
        }
        
        return maisAntigo;
    }
     
     public Vinho obterVinho(int linha, int coluna){
         if (linha < colmeia.length && coluna < colmeia[linha].length){
              return colmeia[linha][coluna];
         }
        
         return null;
     }
    
}
