package model;

public class CafeDescafeinado extends Bebida{

    public CafeDescafeinado(){
        super.descricao = "Café Descafeinado";
    }
    
    @Override
    public Double custo() {
        Double valor = 1.05;
        switch (tamanho) {
            case P:
                return valor;
            case M:
                return valor + 0.2;
            case G:
                return valor + 0.4;
            default:
                return null;
        }
    }
}