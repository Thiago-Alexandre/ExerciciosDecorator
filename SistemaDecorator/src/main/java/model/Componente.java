package model;

public abstract class Componente {
    
    private Produto produto;
    private Tamanho tamanho;
    private Double valorBase;

    public Componente(Produto produto, Tamanho tamanho) {
        this.produto = produto;
        this.tamanho = tamanho;
        valorBase = produto.getValor() * tamanho.getPorcentagemAcrescimo();
    }
    
    public abstract Double custo();
    
    @Override
    public String toString(){
        return "    Produto: " + produto.getNome() + " | Tamanho: " + tamanho.getMedida() + " | Valor: $" + valorBase;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto tipo) {
        this.produto = tipo;
        //valor = tipo.getValor() + (tipo.getValor() * tamanho.getPorcentagemAcrescimo());
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
        //valor = produto.getValor() + (produto.getValor() * tamanho.getPorcentagemAcrescimo());
    }

    public Double getValorBase() {
        return valorBase;
    }
}