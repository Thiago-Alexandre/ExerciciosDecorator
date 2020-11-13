package model;

public class Cafe extends Bebida{

    public Cafe(){
        super.descricao = "Café da Casa";
    }
    
    @Override
    public Double custo() {
        return 0.89;
    }
}