package main.interfaces;

import java.util.Collection;

public interface IRepository<T, U>{
    U adicionar(U model);
    U deletar(T id);
    U atualizar(U model);
    U consultarPorId(T id);
    Collection<U> consultarPorComparacao(U model);
    Collection<U> consultarTodos();    
}
