package model;

public abstract class Bebida {
    
    String descricao = "Bebida desconhecida!";
    Tamanho tamanho;
    
    public String getDescricao(){
        return descricao + " tamanho " + tamanho;
    }
    
    public abstract Double custo();

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }
}