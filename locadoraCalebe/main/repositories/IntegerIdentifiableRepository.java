package main.repositories;
import java.util.*;
import java.util.stream.Collectors;

import main.interfaces.IdentifiableRepository;
import main.models.abstract_models.IntegerIdentifiableModel;

public class IntegerIdentifiableRepository<M extends IntegerIdentifiableModel> implements IdentifiableRepository<Integer, M> {

    private Map<Integer, M> repository = new HashMap<>();

    public IntegerIdentifiableRepository() {
    }

    @Override
    public M adicionar(M model){
        model.setId(repository.size());
        return repository.put(model.getId(), model);
    }

    @Override
    public M deletar(Integer id){
        return repository.remove(id);
    }

    @Override
    public M consultarPorId(Integer id) {
        return repository.get(id);
    }

    @Override
    public Collection<M> consultarPorComparacao(M model) {
        return repository.values().stream().filter(m -> m.equals(model)).collect(Collectors.toList());
    }

    @Override
    public Collection<M> consultarTodos() {
        return repository.values();
    }
        
    Map<Integer, M> getRepositoryMap(){
        return this.repository;
    }

    @Override
    public M atualizar(M model) {
        return repository.put(model.getId(), model);
    }
    
}
