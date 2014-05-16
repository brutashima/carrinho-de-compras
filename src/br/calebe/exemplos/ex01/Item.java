package br.calebe.exemplos.ex01;

public class Item {
    private Produto produto;
    private int qtde;

    public Item(int qtde, Produto produto) {
        this.qtde = qtde;
        this.produto = produto;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    
    public Produto getProduto(){
        return produto;
    }
}