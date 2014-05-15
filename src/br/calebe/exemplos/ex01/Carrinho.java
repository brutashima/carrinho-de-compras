package br.calebe.exemplos.ex01;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    int qtdDeItens;
    private List<Produto> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();  
    }
    public List<Produto> getProdutos() {
        return produtos;
    }
    public Carrinho(int qtdDeItens, List<Produto> produtos) {
        this.qtdDeItens = qtdDeItens;
        this.produtos = produtos;
    }

    public int getQtdDeItens() {
        return qtdDeItens;
    }
   
    //Adicionar um produto
    public void colocandoUmProduto() throws CarrinhoVazioExpected {
        qtdDeItens++;
    }
    
    public void remover(Produto produto) throws CarrinhoVazioExpected
    {
        qtdDeItens--;
    }
    public void colocandoMaisProdutos() throws CarrinhoVazioExpected {
        qtdDeItens++;
    }

    public Produto menorProduto() throws CarrinhoVazioExpected {
        if (produtos.isEmpty()) {
            throw new CarrinhoVazioExpected();
        }
        Produto menor = produtos.get(0);
        for (Produto produto : produtos) {
            if (produto.getPreco() < menor.getPreco()) {
                menor = produto;
            }
        }
        return menor;
    }

    public boolean isEmpty()
    {
        return qtdDeItens == 0;
    }

    void add(Produto livro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
