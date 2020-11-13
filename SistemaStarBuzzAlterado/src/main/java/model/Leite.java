package model;

public class Leite extends AdicionalDecorator{

    Bebida bebida;
    
    public Leite(Bebida bebida) {
        this.bebida = bebida;
        this.tamanho = bebida.getTamanho();
    }

    @Override
    public Double custo() {
        Double valor = 0.01;
        switch (tamanho) {
            case P:
                return bebida.custo() + valor;
            case M:
                return bebida.custo() + valor + 0.03;
            case G:
                return bebida.custo() + valor + 0.06;
            default:
                return null;
        }
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Leite Normal";
    }
}