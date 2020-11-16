package model;

public class ItemPedido extends Componente{
    
    public ItemPedido(Produto tipo, Tamanho tamanho) {
        super(tipo, tamanho);
    }

    @Override
    public Double custo() {
        return this.getValorBase();
    }
}