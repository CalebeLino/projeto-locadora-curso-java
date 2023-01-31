package main.models.abstract_models;
import java.util.Date;

import main.enums.Fabricante;
import main.enums.Motor;

public abstract class Veiculo extends Produto{

    private Date anoFabricacao;
    private String placa;
    private Motor motor;
    private Fabricante fabricante;
    

    public Veiculo(Double preco, Date anoFabricacao, Motor motor, String placa, Fabricante fabricante) {
        super(preco);
        this.anoFabricacao = anoFabricacao;
        this.motor = motor;
        this.placa = placa;
        this.fabricante = fabricante;
    }

    public Date getAnoFabricacao() {
        return anoFabricacao;
    }


    public String getPlaca() {
        return placa;
    }


    public Motor getMotor() {
        return motor;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public void setAnoFabricacao(Date anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Veiculo){
            if(((Veiculo)o).getPlaca().equals(this.getPlaca())) return true;
            else return false;
        }
        return false;
    }
    
}
