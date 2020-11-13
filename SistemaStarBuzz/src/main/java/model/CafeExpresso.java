package model;

public class CafeExpresso extends Bebida{

    public CafeExpresso(){
        super.descricao = "Café Expresso";
    }
    
    @Override
    public Double custo() {
        return 1.99;
    }
}