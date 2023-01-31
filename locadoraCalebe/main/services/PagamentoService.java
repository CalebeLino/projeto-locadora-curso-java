package main.services;

import java.util.Collection;

import main.dao.DAO;
import main.interfaces.IValidator;
import main.interfaces.IService;
import main.interfaces.IdentifiableRepository;
import main.models.abstract_models.MeioPagamento;

public class PagamentoService<MP extends MeioPagamento> implements IService<MP>{

    private DAO<Integer, MP, IdentifiableRepository<Integer, MP>> daoMeioPagamento;

    public PagamentoService(
            DAO<Integer, MP, IdentifiableRepository<Integer, MP>> daoMeioPagamento) {

        this.daoMeioPagamento = daoMeioPagamento;
    }

    @Override
    public Collection<MP> execute(MP meioPagamento, IValidator<MP> validator) {
        if(validator.validate(meioPagamento)){
            System.out.println("Pagamento realizado!");
            daoMeioPagamento.inserir(meioPagamento);
        }
        else{
            System.out.println("Meio de pagamento inválido!");
        }
        return daoMeioPagamento.consultarPorComparacao(meioPagamento);
    }
    
}
