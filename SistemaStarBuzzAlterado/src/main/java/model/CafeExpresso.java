package model;

public class CafeExpresso extends Bebida{

    public CafeExpresso(){
        super.descricao = "Café Expresso";
    }
    
    @Override
    public Double custo() {
        Double valor = 1.99;
        switch (tamanho) {
            case P:
                return valor;
            case M:
                return valor + 0.5;
            case G:
                return valor + 1.0;
            default:
                return null;
        }
    }
}