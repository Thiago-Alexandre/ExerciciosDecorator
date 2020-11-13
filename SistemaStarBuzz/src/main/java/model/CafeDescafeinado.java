package model;

public class CafeDescafeinado extends Bebida{

    public CafeDescafeinado(){
        super.descricao = "Café Descafeinado";
    }
    
    @Override
    public Double custo() {
        return 1.05;
    }
}