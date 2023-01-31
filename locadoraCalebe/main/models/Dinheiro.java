package main.models;

import main.enums.MeioPagamentoEnum;
import main.enums.Moeda;
import main.models.abstract_models.MeioPagamento;

public class Dinheiro extends MeioPagamento{

    public Moeda moeda;

    public Dinheiro(Cliente cliente, Double valor, Moeda moeda) {
        super(cliente, valor, MeioPagamentoEnum.DINHEIRO);
        this.moeda = moeda;
    }

}
