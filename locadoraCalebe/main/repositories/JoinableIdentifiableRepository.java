/*package main.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import main.interfaces.IJoinable;
import main.interfaces.IJoinableRepository;
import main.interfaces.IModel;
import main.interfaces.IdentifiableRepository;
import main.interfaces.Identifiable;

public class JoinableIdentifiableRepository<M1 extends IJoinable<M2>, M2 extends IJoinable<M1> & IModel> implements IJoinableRepository<M1, M2>{
    
    private Map<Collection<M1>, Collection<M2>> repository = new HashMap<>();

    public JoinableIdentifiableRepository() {
    }
    
    @Override
    public Entry<Collection<M1>, Collection<M2>> adicionar(Collection<M1> model1, Collection<M2> model2) {
        repository.put(model1, model2);
        return null;
    }

    @Override
    public Entry<M1, M2> deletar(M1 model) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Entry<M1, M2> deletar(M2 model) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Entry<M1, M2> consultarPorModelo(M1 model) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Entry<M1, M2> consultarPorModelo(M2 model) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Collection<Entry<M1, M2>> consultarPorComparacao(M1 model) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Collection<Entry<M1, M2>> consultarPorComparacao(M2 model) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Collection<Entry<M1, M2>> consultarTodos() {
        // TODO Auto-generated method stub
        return null;
    }


    
}
*/