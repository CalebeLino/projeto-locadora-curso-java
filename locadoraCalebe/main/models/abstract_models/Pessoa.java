package main.models.abstract_models;

import main.enums.Cardinality;
import main.interfaces.IJoinable;

public abstract class Pessoa extends IntegerIdentifiableModel implements IJoinable<Produto> {

    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;

    public Pessoa(String nome, String cpf, String telefone, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public Cardinality cardinality() {
        return Cardinality.ONE_TO_MANY;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Pessoa){
            if(((Pessoa)o).getCpf().equals(this.getCpf())) return true;
            else if(((Pessoa)o).getNome().equalsIgnoreCase(this.getNome())) return true;
            else return false;
        }
        return false;
    }

}
