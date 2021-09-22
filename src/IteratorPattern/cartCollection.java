package IteratorPattern;

import java.util.ArrayList;

public interface cartCollection {
    cartIterator getIterator();
    void addCart(Product n);
    void removeFromCart(Product n);

}

class myCollection implements cartCollection {
    ArrayList<Product> n_list = new ArrayList<>();

    public cartIterator getIterator()
    {
        return new myIterator(n_list);
    }

    public void addCart(Product n)
    {
        this.n_list.add(n);
    }

    public void removeFromCart(Product n)
    {
        this.n_list.remove(n);
    }
}
