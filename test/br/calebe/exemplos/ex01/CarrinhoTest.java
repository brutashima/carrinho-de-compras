package br.calebe.exemplos.ex01;

import junit.framework.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class CarrinhoTest {

    
    @Test
    public void criarCarrinhoVazio()
    {
        Carrinho car = new Carrinho();
        boolean isEmpty = car.isEmpty();
        assertEquals(isEmpty, true);
    }
    
    @Test
    public void colocandoUmProduto() throws CarrinhoVazioExpected {
        Carrinho car = new Carrinho(); 
        Produto produto = new Produto("Java em 24 horas", 50.00);
        car.add(produto);
        int qtdDeItens = car.getQtdDeItens();
        assertEquals(qtdDeItens, 1);    
    }
//    
//    
//    @Test
//    public boolean temProduto(Carrinho car) throws CarrinhoVazioExpected
//    {   
//        if(car.getQtdDeItens() >= 0)
//            return true;
//        else
//            return false;
//    }
//    
//    @Test
//    public void removerProduto() throws CarrinhoVazioExpected
//    {
//        Carrinho car = new Carrinho();
//        Produto livro = new Produto("Java em 24 horas", 50.00 ); 
//        car.remover(livro);
//        boolean vazio;
//        vazio = car.isEmpty();
//        Assert.assertTrue(vazio);
//    }
//    
//    @Test
//    public void colocandoMaisProdutos() throws CarrinhoVazioExpected {
//        Produto livro = new Produto("Java em 24 horas", 50.00);
//        carrinho.add(livro);
//        Produto deitel = new Produto("Java: como programar", 150.00);
//        carrinho.add(deitel);
//        int qtdDeItens = carrinho.getQtdDeItens();
//        assertEquals(livro, qtdDeItens);
//    }
//    
    
    

   /* @Test(expected = CarrinhoVazioExpected.class)
    public void colocandoZeroProduto() throws CarrinhoVazioExpected {
        Produto menor;
        menor = carrinho.menorProduto();
        assertEquals(null, menor);
    }

    @Test
    public void colocandoUmProduto() throws CarrinhoVazioExpected {
        Produto livro = new Produto("Java em 24 horas", 50.00);
        carrinho.add(livro);
        Produto menor;
        menor = carrinho.menorProduto();
        assertEquals(livro, menor);
    }

    @Test
    public void colocandoMaisProdutos() throws CarrinhoVazioExpected {
        Produto livro = new Produto("Java em 24 horas", 50.00);
        carrinho.add(livro);
        Produto deitel = new Produto("Java: como programar", 150.00);
        carrinho.add(deitel);
        Produto menor;
        menor = carrinho.menorProduto();
        assertEquals(livro, menor);
    }

    @Test
    public void identidadeDeProdutos() throws CarrinhoVazioExpected {
        Produto original = new Produto("Java em 24 horas", 50.00);
        carrinho.add(original);
        Produto copia = new Produto("Java em 24 horas", 50.00);
        original = carrinho.menorProduto();
        assertEquals(original, copia);
    }*/
}