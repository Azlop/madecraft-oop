package exercise;

import java.util.ArrayList;

public class BetterArrayList extends ArrayList<Integer> {

    public Integer pop() {
        int lastElement = get(size() - 1);
        remove(size() - 1);
        return lastElement;
    }
    
    public void print() {
        forEach(value -> System.out.print(value + ","));
    }
}
