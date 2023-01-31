package main.models;

import main.enums.Moeda;
import main.models.abstract_models.MeioPagamento;

public class Dinheiro extends MeioPagamento{

    public Moeda moeda;

    public Dinheiro(Cliente cliente, Double valor, Moeda moeda) {
        // Ter o cliente no dinheiro serve para registro de pagamento
        super(cliente, valor);
        this.moeda = moeda;
    }

}
