package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    private final List<Componente> itens;
    private Double total;
    
    public Pedido(){
        itens = new ArrayList();
        total = 0.0;        
    }
    
    public void adicionarItem(Componente item){
        itens.add(item);
        total += item.custo();
    }
    
    public void removerItem(Componente item){
        itens.remove(item);
        total -= item.custo();
    }

    @Override
    public String toString() {
        String pedido = "Mostrando o Pedido...";
        pedido += "\n";
        pedido += "******************************";
        pedido += "\n";
        pedido += "------------------------------";
        pedido += "\n";
        for(Componente c : itens){
            pedido += c;
            pedido += "\n";
            pedido += "    Valor: $" + c.custo();
            pedido += "\n";
            pedido += "------------------------------";
            pedido += "\n";
        }
        pedido += "    Total do Pedido: $" + total;
        pedido += "\n";
        pedido += "------------------------------";
        return pedido;
    }
}