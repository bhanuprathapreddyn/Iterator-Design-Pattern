package IteratorPattern;

public class Main {

    public static void main(String[] args) {

        Product n1 = new Product("Blue LED Light ");
        Product n2 = new Product("Red C7 light ");
        Product n3 = new Product("Yellow C9 Light ");
        Product n4 = new Product("White LED Light ");


        cartCollection c = new myCollection();
        c.addCart(n1);
        c.addCart(n2);
        c.addCart(n3);

        ShoppingSummary ss = new ShoppingSummary(c);
        ss.PrintCart();
        //remove from cart
        c.removeFromCart(n1);
        c.addCart(n4);
        ss.PrintCart();
    }
}
