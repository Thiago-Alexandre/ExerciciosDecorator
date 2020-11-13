package model;

public class Chocolate extends AdicionalDecorator{

    Bebida bebida;
    
    public Chocolate(Bebida bebida) {
        this.bebida = bebida;
        this.tamanho = bebida.getTamanho();
    }
    
    @Override
    public Double custo() {
        Double valor = 0.02;
        switch (tamanho) {
            case P:
                return bebida.custo() + valor;
            case M:
                return bebida.custo() + valor + 0.1;
            case G:
                return bebida.custo() + valor + 0.2;
            default:
                return null;
        }
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Chocolate para capuccino";
    }
}