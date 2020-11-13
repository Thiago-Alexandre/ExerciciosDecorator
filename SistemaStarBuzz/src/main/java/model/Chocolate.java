package model;

public class Chocolate extends AdicionalDecorator{

    Bebida bebida;
    
    public Chocolate(Bebida bebida) {
        this.bebida = bebida;
    }
    
    @Override
    public Double custo() {
        return bebida.custo() + 0.2;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Chocolate para capuccino";
    }
}