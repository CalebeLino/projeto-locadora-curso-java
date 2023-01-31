package main.models;

import main.models.abstract_models.MeioPagamento;

public class Pix extends MeioPagamento{

    private String chave;

    public Pix(Cliente cliente, Double valor, String chave) {
        super(cliente, valor);
        this.chave = chave;
    }
    
    public String getChave() {
        return chave;
    }

}
