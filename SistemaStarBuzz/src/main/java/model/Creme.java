package model;

public class Creme extends AdicionalDecorator{

    Bebida bebida;
    
    public Creme(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public Double custo() {
        return bebida.custo() + 0.1;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Creme Chantilly";
    }
}