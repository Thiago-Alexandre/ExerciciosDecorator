package model;

public class CafeBemPassado extends Bebida{

    public CafeBemPassado(){
        super.descricao = "Café Bem Passado";
    }
    
    @Override
    public Double custo() {
        Double valor = 0.99;
        switch (tamanho) {
            case P:
                return valor;
            case M:
                return valor + 0.08;
            case G:
                return valor + 0.12;
            default:
                return null;
        }
    }
}