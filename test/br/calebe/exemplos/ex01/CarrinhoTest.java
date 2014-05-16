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
    @Test
    public void naoTemProduto() throws CarrinhoVazioExpected
    {   
        Carrinho car = new Carrinho();
        
        boolean aux = false;
        if(car.getQtdDeItens() > 0)
            aux = true;
        else
            aux = false;
        assertEquals(false, aux);
    }
//    
    @Test
    public void removerProduto() throws CarrinhoVazioExpected
    {
        Carrinho car = new Carrinho();
        Produto livro = new Produto("Java em 24 horas", 50.00 ); 
        car.remover(livro);
        boolean vazio;
        vazio = car.isEmpty();
        Assert.assertTrue(vazio);
    }
//    
    @Test
    public void colocandoMaisProdutos() throws CarrinhoVazioExpected {
        Carrinho carrinho = new Carrinho();
        Produto livro = new Produto("Java em 24 horas", 50.00);
        carrinho.add(livro);
        Produto deitel = new Produto("Java: como programar", 150.00);
        carrinho.add(deitel);
        int qtdDeItens = carrinho.getQtdDeItens();
        assertEquals(2, qtdDeItens);
    }

    @Test
    public void obterListaProdutos() throws CarrinhoVazioExpected {
        Carrinho carrinho = new Carrinho();
        Produto livro = new Produto("Java em 24 horas", 50.00);
        carrinho.add(livro);
        Produto deitel = new Produto("Java: como programar", 150.00);
        carrinho.add(deitel);
        
        int aux = carrinho.getLista().size();
        assertEquals(2, aux);
        
    }
    
 
    

//    @Test
//    public void identidadeDeProdutos() throws CarrinhoVazioExpected {
//        Produto original = new Produto("Java em 24 horas", 50.00);
//        carrinho.add(original);
//        Produto copia = new Produto("Java em 24 horas", 50.00);
//        original = carrinho.menorProduto();
//        assertEquals(original, copia);
//    } 
}