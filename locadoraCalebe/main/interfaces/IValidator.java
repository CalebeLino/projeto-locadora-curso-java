package main.interfaces;

public interface IValidator<T> extends ICRUDable{
    // A ideia do IValidator herdar de ICRUDable era armazenar os validadores em um repositório para facilitar o uso dos services
    boolean validate(T required);
}
