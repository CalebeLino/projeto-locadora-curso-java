package main.models;
import java.util.ArrayList;
import java.util.List;

import main.interfaces.IEditable;
import main.models.abstract_models.Pessoa;
import main.models.abstract_models.Produto;

public class Cliente extends Pessoa implements IEditable<Cliente>{

    private List<Produto> locacoes = new ArrayList<>();

    public Cliente(String nome, String cpf, String telefone, String endereco) {
        super(nome, cpf, telefone, endereco);
    }

    public List<Produto> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(List<Produto> locacoes) {
        this.locacoes = locacoes;
    }    

    @Override
    public Cliente editar(Cliente model) {
        if(model instanceof Cliente){
            this.setCpf(((Cliente)model).getCpf());
            this.setEndereco(((Cliente)model).getEndereco());
            this.setNome(((Cliente)model).getNome());
            this.setLocacoes(((Cliente)model).getLocacoes());
        }
        return this;
    }
    
}
