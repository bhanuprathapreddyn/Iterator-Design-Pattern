package IteratorPattern;

public class Product {
    String item;

    Product(String item)
    {
        this.item = item;
    }

    public void print()
    {
        System.out.println(this.item);
    }
}
