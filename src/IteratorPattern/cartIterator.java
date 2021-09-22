package IteratorPattern;

import java.util.ArrayList;

public interface cartIterator {
    boolean hasNext();
    Object next();
}

class myIterator implements cartIterator {
    ArrayList<Product> n_list = new ArrayList<>();
    int pos = 0;

    public myIterator(ArrayList<Product> n_list) {
        this.n_list = n_list;
    }

    public boolean hasNext() {
        if (pos >= this.n_list.size() || this.n_list.get(pos) == null) {
            return false;
        }
        return true;
    }

    public Object next() {
        Product n = this.n_list.get(pos);
        pos++;
        return n;
    }

}