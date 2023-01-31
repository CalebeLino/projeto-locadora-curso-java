package main.dao;

import main.interfaces.ICRUDable;
import main.interfaces.IRepository;
import main.interfaces.Identifiable;

public class DAO<ID, M extends ICRUDable & Identifiable<ID>, R extends IRepository<ID, M>> extends AbstractDAO<ID, M, R>{


    public DAO(R modelRepository) {
        super(modelRepository);
    }

    
}
