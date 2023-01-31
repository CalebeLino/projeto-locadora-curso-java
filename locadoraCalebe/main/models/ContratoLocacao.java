package main.models;

import java.util.AbstractMap;
import java.util.Date;
import java.util.Map.Entry;
import main.models.abstract_models.IntegerIdentifiableModel;
import main.models.abstract_models.Produto;

public class ContratoLocacao<P extends Produto> extends IntegerIdentifiableModel{

    private String protocolo;
    private Entry<Cliente, P> locacao;
    private Funcionario funcionario;
    private Date inicio;
    private Date fim;

    public ContratoLocacao(Cliente cliente, P produto, Date inicio, Date fim, Funcionario funcionario, String protocolo) {
        this.locacao = new AbstractMap.SimpleEntry<Cliente, P>(cliente, produto);
        this.inicio = inicio;
        this.fim = fim;
        this.funcionario = funcionario;
        this.protocolo = protocolo;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public Entry<Cliente, P> getLocacao() {
        return locacao;
    }

    public void setLocacao(Entry<Cliente, P> locacao) {
        this.locacao = locacao;
    }

    public Date getInicio() {
        return inicio;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof ContratoLocacao<?>){
            if(((ContratoLocacao<?>)o).getProtocolo().equals(this.getProtocolo())) return true;
            else return false;
        }
        return false;
    }
    
}
