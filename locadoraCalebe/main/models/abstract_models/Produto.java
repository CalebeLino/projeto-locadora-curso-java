package main.models.abstract_models;
import java.util.ArrayList;
import java.util.List;

import main.enums.Cardinality;
import main.interfaces.IJoinable;
import main.models.Cliente;

public abstract class Produto extends IntegerIdentifiableModel implements IJoinable<Pessoa>{
    private Double preco;
    private boolean alugado = false;
    private List<Cliente> locadores = new ArrayList<>();

    public Produto(Double preco) {
        this.preco = preco;
    }
    
    public Double getPreco() {
        return preco;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public List<Cliente> getLocadores() {
        return locadores;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public void setLocadores(List<Cliente> locadores) {
        this.locadores = locadores;
    }

    @Override
    public Cardinality cardinality() {
        return Cardinality.ONE_TO_ONE;
    }
    
}
