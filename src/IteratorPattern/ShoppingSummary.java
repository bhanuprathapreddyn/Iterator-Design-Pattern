package IteratorPattern;

public class ShoppingSummary {
    cartCollection nc;

    ShoppingSummary(cartCollection nc)
    {
        this.nc = nc;
    }
    public void PrintCart()
    {
        System.out.println("------------------------");
        System.out.println("---  Cart Summary    ---");
        System.out.println("------------------------");
        cartIterator iter = nc.getIterator();

        while(iter.hasNext())
        {
            Product n = (Product)iter.next();
            n.print();
        }
    }
}
