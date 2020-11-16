package model;

public class Adicional extends Decorador{

    public Adicional(Produto produto, Componente item) {
        super(produto, item);
    }

    @Override
    public String toString() {
        return this.getItem() + "\n" + "    Adicional: " + this.getProduto().getNome() + " | Valor: $" + this.getValorBase();
    }

    @Override
    public Double custo() {
        return (this.getValorBase() + this.getItem().custo());
    }
}