package main.interfaces;

import main.enums.Cardinality;

public interface IJoinable<T> {
    Cardinality cardinality(); 
}
