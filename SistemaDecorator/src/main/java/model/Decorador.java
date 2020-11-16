package model;

public abstract class Decorador extends Componente{
    
    private Componente item;
    
    public Decorador(Produto produto, Componente item) {
        super(produto, item.getTamanho());
        this.item = item;
    }
    
    @Override
    public abstract String toString();

    public Componente getItem() {
        return item;
    }

    public void setItem(Componente item) {
        this.item = item;
    }
}