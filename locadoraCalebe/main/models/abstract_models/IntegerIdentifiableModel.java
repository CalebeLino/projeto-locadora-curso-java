package main.models.abstract_models;
import main.interfaces.IModel;
import main.interfaces.Identifiable;

public abstract class IntegerIdentifiableModel implements IModel, Identifiable<Integer>{
    private Integer id = 0;

    @Override
    public Integer getId() {
        return id;
    }
    
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

}
