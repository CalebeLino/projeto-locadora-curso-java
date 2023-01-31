package main.models;

import java.util.ArrayList;
import java.util.List;
import main.interfaces.IEditable;
import main.models.abstract_models.Pessoa;

public class Funcionario extends Pessoa implements IEditable<Funcionario>{

    private List<Cliente> clientes = new ArrayList<>();
    private String matricula;

    public Funcionario(String nome, String cpf, String telefone, String endereco, String matricula) {
        super(nome, cpf, telefone, endereco);
        this.matricula = matricula;
    }
    
    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public Funcionario editar(Funcionario model) {
        if(model instanceof Funcionario){
            this.setCpf(((Funcionario)model).getCpf());
            this.setEndereco(((Funcionario)model).getEndereco());
            this.setNome(((Funcionario)model).getNome());
            this.setMatricula(((Funcionario)model).getMatricula());
            this.setClientes(((Funcionario)model).getClientes());
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Funcionario){
            if(((Funcionario)o).getMatricula().equals(this.getMatricula())) return true;
            else if(((Funcionario)o).getCpf().equals(this.getCpf())) return true;
            else if(((Funcionario)o).getNome().equalsIgnoreCase(this.getNome())) return true;
            else return false;
        }
        return false;
    }
    
}
