package main;

import java.util.ArrayList;
import java.util.List;
import model.*;

public class Main {
    
    public static void main(String[] args){
        System.out.println("-----------------------");
        System.out.println("Iniciando o Sistema StarBuzz...");
        System.out.println("-----------------------");
        System.out.println("Carregando Pedido...");
        List<Bebida> bebidas = new ArrayList();
        Bebida bebida1 = new Cafe();
        bebida1 = new Leite(bebida1);
        bebida1 = new Chocolate(bebida1);
        bebidas.add(bebida1);
        Bebida bebida2 = new CafeExpresso();
        bebida2 = new LeiteSoja(bebida2);
        bebida2 = new Creme(bebida2);
        bebidas.add(bebida2);
        Bebida bebida3 = new CafeBemPassado();
        bebida3 = new Leite(bebida3);
        bebidas.add(bebida3);
        Bebida bebida4 = new CafeDescafeinado();
        bebidas.add(bebida4);
        System.out.println("-----------------------");
        System.out.println("Mostrando o Pedido...");
        System.out.println("-----------------------");
        System.out.println(bebida1.getDescricao());
        System.out.println("Valor: $" + bebida1.custo());
        System.out.println("-----------------------");
        System.out.println(bebida2.getDescricao());
        System.out.println("Valor: $" + bebida2.custo());
        System.out.println("-----------------------");
        System.out.println(bebida3.getDescricao());
        System.out.println("Valor: $" + bebida3.custo());
        System.out.println("-----------------------");
        System.out.println(bebida4.getDescricao());
        System.out.println("Valor: $" + bebida4.custo());
        System.out.println("-----------------------");
        Double total = 0.0;
        for(Bebida b : bebidas){
            total += b.custo();
        }
        System.out.println("Total Pedido: " + total);
        System.out.println("-----------------------");
        System.out.println("Finalizando o Sistema StarBuzz...");
    }
}