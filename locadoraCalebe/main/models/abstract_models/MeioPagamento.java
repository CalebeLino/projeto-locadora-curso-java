package main.models.abstract_models;

import main.enums.MeioPagamentoEnum;
import main.models.Cliente;

public abstract class MeioPagamento extends IntegerIdentifiableModel{

    private Cliente cliente;
    private Double valor;
    private MeioPagamentoEnum meio;
    
    public MeioPagamento(Cliente cliente, Double valor, MeioPagamentoEnum meio) {
        this.cliente = cliente;
        this.valor = valor;
        this.meio = meio;
    }
    
    public MeioPagamentoEnum getMeio() {
        return meio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
}
