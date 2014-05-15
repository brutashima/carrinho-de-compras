package br.calebe.exemplos.ex01;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    int qtdDeItens;
    private List<Produto> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();  
    }

    public Carrinho(int qtdDeItens, List<Produto> produtos) {
        this.qtdDeItens = qtdDeItens;
        this.produtos = produtos;
    }

    public int getQtdDeItens() {
        return qtdDeItens;
    }

    public void setQtdDeItens(int qtdDeItens) {
        this.qtdDeItens = qtdDeItens;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    //Adicionar um produto
    public void add(Produto produto) throws CarrinhoVazioExpected{
        Produto p = new Produto();
        produtos.add(produto);
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
}
