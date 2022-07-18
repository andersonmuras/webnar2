package com.example.appprojetos;

import junit.framework.TestCase;

public class ProdutoTeste extends TestCase {
    public void testsetNome(){
        Produto p = new Produto();
        boolean resultado = p.setNome("Anderson");
        assertEquals(true, resultado);
    }
    public void testSetQuantidade (){
        Produto p = new Produto();
        boolean resultado = p.setQuantidade(1);
        assertEquals(true,resultado);
    }
    public void testPreco (){
        Produto p = new Produto();
        boolean resultado = p.setPreco(1);
        assertEquals(true, resultado);
    }
}
