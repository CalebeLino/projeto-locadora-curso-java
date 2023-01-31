package main.models.abstract_models;

import main.enums.MeioPagamentoEnum;
import main.models.Cliente;

public abstract class MeioPagamento extends IntegerIdentifiableModel{

    private Cliente cliente;
    private Double valor;
    
    public MeioPagamento(Cliente cliente, Double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Double getValor() {
        return valor;
    }
    
}
