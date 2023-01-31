package main.dao;

import main.interfaces.ICRUDable;
import main.interfaces.IEditable;
import main.interfaces.IRepository;
import main.interfaces.Identifiable;

public class EditableDAO<ID, M extends ICRUDable & Identifiable<ID> & IEditable<M>, R extends IRepository<ID, M>> extends AbstractDAO<ID, M, R>{
    
    // Para respeitar a segregação de interfaces, foi criado uma DAO para editáveis que será requerida por services que necessitam do recurso de edição (apenas os models IEditable)

    public EditableDAO(R modelRepository) {
        super(modelRepository);
    }

    public M editar(M model){
        getModelRepository().consultarPorId(model.getId()).editar(model);
        return getModelRepository().consultarPorId(model.getId());
    }
    
}
