package main.services;

import java.util.Collection;
import main.dao.DAO;
import main.interfaces.IService;
import main.interfaces.IValidator;
import main.interfaces.IdentifiableRepository;
import main.models.ContratoLocacao;
import main.models.abstract_models.Produto;

public class AluguelService<P extends Produto> implements IService<ContratoLocacao<P>>{

    private DAO<Integer, ContratoLocacao<P>, IdentifiableRepository<Integer, ContratoLocacao<P>>> daoContratoLocacao;

    public AluguelService(
            DAO<Integer, ContratoLocacao<P>, IdentifiableRepository<Integer, ContratoLocacao<P>>> daoContratoLocacao) {
        this.daoContratoLocacao = daoContratoLocacao;
    }

    @Override
    public Collection<ContratoLocacao<P>> execute(ContratoLocacao<P> contratoLocacao,
            IValidator<ContratoLocacao<P>> validator) {
        if(validator.validate(contratoLocacao)){
            System.out.println("Aluguel contratado!");
            contratoLocacao.getLocacao().getValue().setAlugado(true);
            daoContratoLocacao.inserir(contratoLocacao);
        }
        else{
            System.out.println("Contrato inválido");
        } 
        return daoContratoLocacao.consultarPorComparacao(contratoLocacao);
    }
    
}
