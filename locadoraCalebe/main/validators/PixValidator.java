package main.validators;

import main.interfaces.IValidator;
import main.models.Pix;

public class PixValidator implements IValidator<Pix>{
    @Override
    public boolean validate(Pix required) {
        System.out.println("Validando PIX...");
        return true;
    }
}
