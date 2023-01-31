package main.interfaces;

public interface IJoinableRepository<M1 extends IJoinable<M2>, M2 extends IModel & IJoinable<M1>> extends IRepository<M1, M2>{

}
