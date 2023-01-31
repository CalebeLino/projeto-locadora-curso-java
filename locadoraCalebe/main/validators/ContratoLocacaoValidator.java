package main.validators;

import main.interfaces.IValidator;
import main.models.ContratoLocacao;
import main.models.abstract_models.Produto;

public class ContratoLocacaoValidator<P extends Produto> implements IValidator<ContratoLocacao<P>>{

    @Override
    public boolean validate(ContratoLocacao<P> contrato) {
        if(!contrato.getLocacao().getValue().isAlugado()){
            
            if(contrato.getInicio().getTime() < contrato.getFim().getTime()){
                return true;
            }
            return true;
        }
        System.out.println("Produto locado!");
        return false;
    }
}
