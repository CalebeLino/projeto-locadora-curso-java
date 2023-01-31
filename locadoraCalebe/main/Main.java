package main;
import java.util.Date;
import main.dao.DAO;
import main.enums.Bandeira;
import main.enums.Fabricante;
import main.enums.Motor;
import main.interfaces.IdentifiableRepository;
import main.models.Carro;
import main.models.Cartao;
import main.models.Cliente;
import main.models.ContratoLocacao;
import main.models.Funcionario;
import main.repositories.IntegerIdentifiableRepository;
import main.services.AluguelService;
import main.services.PagamentoService;
import main.validators.CartaoValidator;
import main.validators.ContratoLocacaoValidator;

public class Main {
    public static void main(String[] args) {
        IdentifiableRepository<Integer, Funcionario> funcionarios = new IntegerIdentifiableRepository<>();
        IdentifiableRepository<Integer, Cliente> clientes = new IntegerIdentifiableRepository<>();
        IdentifiableRepository<Integer, Carro> carros = new IntegerIdentifiableRepository<>();
        IdentifiableRepository<Integer, ContratoLocacao<Carro>> contratosCarros = new IntegerIdentifiableRepository<>();
        IdentifiableRepository<Integer, Cartao> cartoes = new IntegerIdentifiableRepository<>();

        var funcionarioDAO = new DAO<>(funcionarios);
        var clienteDAO = new DAO<>(clientes);
        var carroDAO = new DAO<>(carros);
        var contratosCarroDao = new DAO<>(contratosCarros);
        var cartoesDao = new DAO<>(cartoes);

        Funcionario funcionario0 = new Funcionario("Maicou", "888", "100", "ponte", "F111");
        Cliente cliente0 = new Cliente("Calebe", "123", "123", "rua");
        Cliente cliente1 = new Cliente("Fulano", "866", "999", "outro lugar");
        Cartao cartao0 = new Cartao(cliente0, Bandeira.VISA);
        Carro carro0 = new Carro(Double.valueOf(130), new Date(), Motor.GASOLINA, "MZU8077", Fabricante.FORD);
        Carro carro1 = new Carro(Double.valueOf(290), new Date(), Motor.ELETRICO, "NEL3002", Fabricante.TESLA);

        funcionarioDAO.inserir(funcionario0);
        clienteDAO.inserir(cliente0);
        clienteDAO.inserir(cliente1);
        cartoesDao.inserir(cartao0);
        carroDAO.inserir(carro0);
        carroDAO.inserir(carro1);

        System.out.println(clienteDAO.consultarPorId(0));
        System.out.println(clienteDAO.consultarPorComparacao(cliente0));

        ContratoLocacao<Carro> contratoCarro0 = new ContratoLocacao<>(cliente0, carro0, new Date(), new Date(), funcionario0, "0a224f");
        ContratoLocacaoValidator<Carro> contratoValidator = new ContratoLocacaoValidator<>();
        AluguelService<Carro> aluguelServiceCarro = new AluguelService<>(contratosCarroDao);
        
        System.out.println(carro0.isAlugado());
        System.out.println(aluguelServiceCarro.execute(contratoCarro0, contratoValidator));
        System.out.println(carro0.isAlugado());

        CartaoValidator cartaoValidator = new CartaoValidator();
        PagamentoService<Cartao> pagamentoServiceCartao = new PagamentoService<>(cartoesDao);

        System.out.println(pagamentoServiceCartao.execute(new Cartao(cartao0, Double.valueOf(10)), cartaoValidator));
    }
}
