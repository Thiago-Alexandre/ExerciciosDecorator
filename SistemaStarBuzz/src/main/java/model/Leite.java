package model;

public class Leite extends AdicionalDecorator{

    Bebida bebida;
    
    public Leite(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public Double custo() {
        return bebida.custo() + 0.1;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Leite Normal";
    }
}