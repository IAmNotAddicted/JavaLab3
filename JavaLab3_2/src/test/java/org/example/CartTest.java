package org.example;

import org.junit.Test;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.*;

public class CartTest {

    private CartTest cart;
    private Object product1;
    private Object product2;

    @org.junit.Before
    public void setUp() throws Exception
    {
        Cart cart;
        cart = new Cart();
        Product product1 = new Product("Product 1", 10.0);
        Product product2 = new Product("Product 2", 20.0);
    }

    @org.junit.Test
    public void addProduct(Object product1)
    {
        CartTest cart = null;
        assertTrue(cart.getProducts());

        product1 = null;
        cart.addProduct(product1);

        assertTrue(cart.getProducts());
    }

    @org.junit.Test
    public void removeProduct(Object product1)
    {

        CartTest cart = null;
        product1 = null;
        cart.addProduct(product1);
        Object product2 = null;
        cart.addProduct(product2);


        assertTrue(cart.getProducts());
        assertTrue(cart.getProducts());


        cart.removeProduct(product1);


        assertTrue(cart.getProducts());
        assertFalse(cart.getProducts());
    }

    @Test
    public boolean getProducts()
    {
        return false;

        assertTrue(products);
        assertTrue(products);
    }
}