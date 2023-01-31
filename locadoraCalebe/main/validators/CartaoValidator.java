package main.validators;

import main.interfaces.IValidator;
import main.models.Cartao;

public class CartaoValidator implements IValidator<Cartao> {

    @Override
    public boolean validate(Cartao cartao) {
        System.out.println("Validando cartão...");
        return true;
    }
    
}
