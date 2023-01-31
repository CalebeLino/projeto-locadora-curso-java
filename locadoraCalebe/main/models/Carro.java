package main.models;
import java.util.Date;

import main.enums.Fabricante;
import main.enums.Motor;
import main.interfaces.IEditable;
import main.models.abstract_models.Veiculo;

public class Carro extends Veiculo implements IEditable<Carro>{


    public Carro(Double preco, Date anoFabricacao, Motor motor, String placa, Fabricante fabricante) {
        super(preco, anoFabricacao, motor, placa, fabricante);
    }

    @Override
    public Carro editar(Carro model) {
        if(model instanceof Carro){
            this.setAlugado(((Carro)model).isAlugado());
            this.setAnoFabricacao(((Carro)model).getAnoFabricacao());
            this.setLocadores(((Carro)model).getLocadores());
            this.setMotor(((Carro)model).getMotor());
            this.setPlaca(((Carro)model).getPlaca());
            this.setPreco(((Carro)model).getPreco());
        }
        return this;
    }
    
}
