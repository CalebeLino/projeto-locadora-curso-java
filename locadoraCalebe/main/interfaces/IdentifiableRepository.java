package main.interfaces;
import java.util.Collection;

public interface IdentifiableRepository<ID, M extends Identifiable<ID>> extends IRepository<ID, M>{

    M adicionar(M model);
    M deletar(ID id);
    M consultarPorId(ID id);
    Collection<M> consultarPorComparacao(M model);
    Collection<M> consultarTodos();

}
