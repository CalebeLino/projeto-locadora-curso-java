package main.validators;

import main.interfaces.IValidator;
import main.models.Dinheiro;

public class DinheiroValidator implements IValidator<Dinheiro>{
    @Override
    public boolean validate(Dinheiro dinheiro) {
        System.out.println("Validando dinheiro...");
        return true;
    }
}
