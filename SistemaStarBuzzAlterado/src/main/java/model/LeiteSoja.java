package model;

public class LeiteSoja extends AdicionalDecorator{

    Bebida bebida;
    
    public LeiteSoja(Bebida bebida) {
        this.bebida = bebida;
        this.tamanho = bebida.getTamanho();
    }

    @Override
    public Double custo() {
        Double valor = 0.15;
        switch (tamanho) {
            case P:
                return bebida.custo() + valor;
            case M:
                return bebida.custo() + valor + 0.06;
            case G:
                return bebida.custo() + valor + 0.12;
            default:
                return null;
        }
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Leite de Soja";
    }
}