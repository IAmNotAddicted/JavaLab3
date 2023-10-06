package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {



    }
}

class Product
{
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(String s, double v) {
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }
}

class Cart
{
    private List<Product> products;

    public Cart()
    {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product)
    {
        products.add(product);
    }

    public void removeProduct(Product product)
    {
        products.remove(product);
    }

    public List<Product> getProducts()
    {
        return products;
    }
}

enum OrderStatus
{
    PENDING,
    SHIPPED,
    DELIVERED,
    CANCELED
}

class Order
{
    private int orderId;
    private List<Product> products;
    private OrderStatus status;

    public Order(int orderId, List<Product> products)
    {
        this.orderId = orderId;
        this.products = products;
        this.status = OrderStatus.PENDING;
    }

    public int getOrderId()
    {
        return orderId;
    }

    public List<Product> getProducts()
    {
        return products;
    }

    public OrderStatus getStatus()
    {
        return status;
    }

    public void setStatus(OrderStatus status)
    {
        this.status = status;
    }
}
