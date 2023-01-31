package main.interfaces;

import java.util.Collection;

public interface IService<T>{
    Collection<T> execute(T required, IValidator<T> validator);    
}
