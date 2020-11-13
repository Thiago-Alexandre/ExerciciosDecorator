package model;

public class CafeBemPassado extends Bebida{

    public CafeBemPassado(){
        super.descricao = "Café Bem Passado";
    }
    
    @Override
    public Double custo() {
        return 0.99;
    }
}