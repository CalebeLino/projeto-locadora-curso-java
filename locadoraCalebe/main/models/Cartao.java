package main.models;

import main.enums.Bandeira;
import main.enums.MeioPagamentoEnum;
import main.models.abstract_models.MeioPagamento;

public class Cartao extends MeioPagamento{

    private Bandeira bandeira;

    public Cartao(Cliente cliente, Bandeira bandeira) {
        super(cliente, Double.valueOf(0), MeioPagamentoEnum.CARTAO);
        this.bandeira = bandeira;
    }

    public Cartao(Cartao cartao, Double valor) {
        super(cartao.getCliente(), valor, MeioPagamentoEnum.CARTAO);
        this.bandeira = cartao.getBandeira();
    }
    
    public Bandeira getBandeira() {
        return bandeira;
    }

    public void setBandeira(Bandeira bandeira) {
        this.bandeira = bandeira;
    }
    
}
