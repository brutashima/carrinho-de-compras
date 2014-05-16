package br.calebe.exemplos.ex01;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Item> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();  
    }
    public List<Item> getProdutos() {
        return produtos;
    }
    public Carrinho(List<Item> produtos) {
        this.produtos = produtos;
    }

    public int getQtdDeItens() {
        return produtos.size();
    }
    
    //Criar carrinho vazio
    public boolean isEmpty()
    {
        return getQtdDeItens() == 0;
    }
   
    //Adicionar um produto
    public void add(Produto produto) throws CarrinhoVazioExpected {
        Item i = new Item(1, produto);
        produtos.add(i);
    }
    
    public void remover(Produto produto) throws CarrinhoVazioExpected
    {
        
        for(int j=0; j<getQtdDeItens(); j++)
        {
            Item item = produtos.get(j);
            Produto produtoItem = item.getProduto();
            if(produto.getNome() == produtoItem.getNome()){
                produtos.remove(j);
            }
        }
      }
//
//    public Produto menorProduto() throws CarrinhoVazioExpected {
//        if (produtos.isEmpty()) {
//            throw new CarrinhoVazioExpected();
//        }
//        Produto menor = produtos.get(0);
//        for (Produto produto : produtos) {
//            if (produto.getPreco() < menor.getPreco()) {
//                menor = produto;
//            }
//        }
//        return menor;
//    }

    public List<Item> getLista() {
        return produtos;
    }

   public double total() {
        double aux = 0.0;
        
        for(int j=0; j<getQtdDeItens(); j++)
        {
            Item item = produtos.get(j);
            Produto produtoItem = item.getProduto();
            aux = aux + item.getQtde() * produtoItem.getPreco();
            
        }
        
        return aux;
    }

    

}
