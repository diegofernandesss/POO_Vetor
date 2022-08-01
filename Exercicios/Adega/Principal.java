package com.mycompany.adega;

import java.util.Date;

public class Principal {

    public static void main(String[] args) {
        Adega adega = new Adega();
        
        adega.adicionar(new VinhoBranco("nome", "tipoUva", "fabricante", new Date(), 80, "frisante"));
        adega.adicionar(new VinhoBranco("nome", "tipoUva", "fabricante", new Date(), 80, "frisante"));
        adega.adicionar(new VinhoBranco("nome", "tipoUva", "fabricante", new Date(), 80, "frisante"));
        adega.adicionar(new VinhoBranco("nome", "tipoUva", "fabricante", new Date(), 120, "frisante"));
        adega.adicionar(new VinhoBranco("nome", "tipoUva", "fabricante", new Date(), 80, "frisante"));
        adega.adicionar(new VinhoBranco("nome", "tipoUva", "fabricante", new Date(), 80, "frisante"));
        adega.adicionar(new VinhoBranco("nome", "tipoUva", "fabricante", new Date(), 80, "frisante"));
        
        
        adega.adicionar(new VinhoTinto("nome", "tipoUva", "fabricante", new Date(), 80, 1980));
        adega.adicionar(new VinhoTinto("nome", "tipoUva", "fabricante", new Date(), 70, 1980));
        adega.adicionar(new VinhoTinto("nome", "tipoUva", "fabricante", new Date(), 60, 1980));
        adega.adicionar(new VinhoTinto("nome", "tipoUva", "fabricante", new Date(), 100, 1980));
        
        
        System.out.println(adega.maisAntigo());
        
        System.out.println(adega.quantidadeGarrafas());
        
        System.out.println(adega.valorAdega());
        
        adega.vinhosPorTipo("Vinho Branco");
        
        System.out.println(adega.obterVinho(0, 0));
    }
}
