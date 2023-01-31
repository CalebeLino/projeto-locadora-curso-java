package main.interfaces;

public interface IValidator<T> extends ICRUDable{
    boolean validate(T required);
}
