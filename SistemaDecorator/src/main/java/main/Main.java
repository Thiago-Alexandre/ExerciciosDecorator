package main;

import java.util.HashMap;
import java.util.Map;
import model.*;

public class Main {
    
    public static void main(String[] args){
        System.out.println("******************************");
        System.out.println("Iniciando o Sistema Decorator com base no problema do StarBuzz...");
        System.out.println("******************************");
        /**
         * Definindo os tamanhos e os valores cobrados com base neles.
         * Neste caso, produtos com porção M terão seu valor base,
         * enquanto que porções P terão metade de seu valor base e 
         * porções G terão metade de seu valor aumentado.
         * Seria possível cadastrar outras formas de valor atribuído ao tamanho.
         * Por exemplo, porção G poderia ter o valor base do produto dobrado:
         * new Tamanho(Medida.G, 2.0)
         */
        Map<Integer,Tamanho> tamanhos = new HashMap();
        tamanhos.put(1, new Tamanho(Medida.P, 0.5));
        tamanhos.put(2, new Tamanho(Medida.M, 1.0));
        tamanhos.put(3, new Tamanho(Medida.G, 1.5));
        System.out.println("Carregando Menu de Bebidas...");
        System.out.println("******************************");
        /**
         * Definindo os produtos com seu valor base.
         * Simula um cadastro no banco de dados.
         */
        Map<Integer,Produto> bebidas = new HashMap();
        bebidas.put(1, new Produto("Café da Casa", 0.8));
        bebidas.put(2, new Produto("Café Bem Passado", 1.0));
        bebidas.put(3, new Produto("Café Descafeinado", 1.2));
        bebidas.put(4, new Produto("Café Expresso", 2.0));
        System.out.println("-----------------------------");
        for(Produto produto : bebidas.values()){
            System.out.println(produto);
            System.out.println("-----------------------------");
        }
        System.out.println("******************************");
        System.out.println("Carregando Menu de Adicionais...");
        System.out.println("******************************");
        /**
         * Definindo os produtos adicionais com seu valor base.
         * Simula um cadastro no banco de dados.
         */
        Map<Integer, Produto> adicionais = new HashMap();
        adicionais.put(1, new Produto("Leite Normal", 0.1));
        adicionais.put(2, new Produto("Mocha (Chocolate)", 0.3));
        adicionais.put(3, new Produto("Leite Soja", 0.2));
        adicionais.put(4, new Produto("Creme (Chantily)", 0.1));
        System.out.println("-----------------------------");
        for(Produto produto : adicionais.values()){
            System.out.println(produto);
            System.out.println("-----------------------------");
        }
        System.out.println("******************************");
        System.out.println("Carregando Itens do Primeiro Pedido...");
        System.out.println("******************************");
        Pedido pedido1 = new Pedido();
        /**
         * Criando um café da casa tamanho G com duas doses de leite normal e uma dose de creme chantily
         */
        Componente item1 = new ItemPedido(bebidas.get(1), tamanhos.get(3));
        item1 = new Adicional(adicionais.get(1),item1);
        item1 = new Adicional(adicionais.get(1),item1);
        item1 = new Adicional(adicionais.get(4),item1);
        pedido1.adicionarItem(item1);
        /**
         * Criando um café bem passado tamanho P com uma dose de leite soja
         */
        Componente item2 = new ItemPedido(bebidas.get(2), tamanhos.get(1));
        item2 = new Adicional(adicionais.get(3),item2);
        pedido1.adicionarItem(item2);
        /**
         * Criando um café descafeinado tamanho M com uma dose de creme chantily e uma dose de mocha (chocolate)
         */
        Componente item3 = new ItemPedido(bebidas.get(3), tamanhos.get(2));
        item3 = new Adicional(adicionais.get(4),item3);
        item3 = new Adicional(adicionais.get(2),item3);
        pedido1.adicionarItem(item3);
        /**
         * Criando um café expresso tamanho G com uma dose de creme chantily, uma dose de mocha (chocolate) e uma dose de leite soja
         */
        Componente item4 = new ItemPedido(bebidas.get(4), tamanhos.get(3));
        item4 = new Adicional(adicionais.get(4),item4);
        item4 = new Adicional(adicionais.get(2),item4);
        item4 = new Adicional(adicionais.get(3),item4);
        pedido1.adicionarItem(item4);
        System.out.println(pedido1);
        System.out.println("******************************");
        System.out.println("Carregando Itens do Segundo Pedido...");
        System.out.println("******************************");
        Pedido pedido2 = new Pedido();
        /**
         * Criando um café expresso tamanho G com creme chantily, mocha (chocolate), leite e leite soja
         */
        Componente item5 = new ItemPedido(bebidas.get(4), tamanhos.get(3));
        item5 = new Adicional(adicionais.get(4),item5);
        item5 = new Adicional(adicionais.get(2),item5);
        item5 = new Adicional(adicionais.get(1),item5);
        item5 = new Adicional(adicionais.get(3),item5);
        pedido2.adicionarItem(item5);
        System.out.println(pedido2);
        System.out.println("******************************");
        System.out.println("Finalizando o Sistema Decorator...");
        System.out.println("******************************");
    }
}