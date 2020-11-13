package model;

public class Cafe extends Bebida{

    public Cafe(){
        super.descricao = "Café da Casa";
    }
    
    @Override
    public Double custo() {
        Double valor = 0.89;
        switch (tamanho) {
            case P:
                return valor;
            case M:
                return valor + 0.1;
            case G:
                return valor + 0.2;
            default:
                return null;
        }
    }
}