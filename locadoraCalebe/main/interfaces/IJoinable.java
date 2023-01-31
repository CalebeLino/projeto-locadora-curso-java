package main.interfaces;

import main.enums.Cardinality;

public interface IJoinable<T> {
    //A ideia da interface IJoinable<T> era criar repositórios relacionais entre dois objetos
    Cardinality cardinality(); 
}
