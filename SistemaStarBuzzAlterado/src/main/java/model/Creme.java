package model;

public class Creme extends AdicionalDecorator{

    Bebida bebida;
    
    public Creme(Bebida bebida) {
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
                return bebida.custo() + valor + 0.01;
            case G:
                return bebida.custo() + valor + 0.02;
            default:
                return null;
        }
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Creme Chantilly";
    }
}