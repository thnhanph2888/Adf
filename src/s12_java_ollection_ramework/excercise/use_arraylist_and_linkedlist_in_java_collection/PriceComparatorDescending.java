package excercise.use_arraylist_and_linkedlist_in_java_collection;

import java.util.Comparator;

public class PriceComparatorDecending implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        if (product1.getPrice() > product2.getPrice()){
            return 1;
        } else if (product1.getPrice() < product2.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }

}
