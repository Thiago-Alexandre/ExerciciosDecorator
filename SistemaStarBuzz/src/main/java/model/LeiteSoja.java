package model;

public class LeiteSoja extends AdicionalDecorator{

    Bebida bebida;
    
    public LeiteSoja(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public Double custo() {
        return bebida.custo() + 0.15;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Leite de Soja";
    }
}