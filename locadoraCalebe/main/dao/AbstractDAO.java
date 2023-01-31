package main.dao;

import java.util.Collection;

import main.interfaces.ICRUDable;
import main.interfaces.IRepository;
import main.interfaces.Identifiable;

public abstract class AbstractDAO<ID, M extends ICRUDable & Identifiable<ID>, R extends IRepository<ID, M>> {

    private R modelRepository;

    public AbstractDAO(R modelRepository){
        this.modelRepository = modelRepository;
    }
    public M inserir(M model){
        return modelRepository.adicionar(model);
    }

    public M consultarPorId(ID id){
        return modelRepository.consultarPorId(id);
    }
    public Collection<M> consultarPorComparacao(M model){
        return modelRepository.consultarPorComparacao(model); 
    }
    public Collection<M> consultarTodos(){
        return modelRepository.consultarTodos();
    }
    public M deletar(ID id){
        System.out.println("Deletado com sucesso");
        return modelRepository.deletar(id);
    }
    public R getModelRepository() {
        return modelRepository;
    }   
}
