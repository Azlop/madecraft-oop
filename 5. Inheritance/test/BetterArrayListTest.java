package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercise.BetterArrayList;

public class BetterArrayListTest {

    private BetterArrayList stack = new BetterArrayList();
    
    @BeforeEach
    public void setup() {
        stack.add(5);
        stack.add(7);
        stack.add(3);
    }
    
    @Test
    public void removeLastElementAndPrintIt() {
        stack.add(2);
        assertEquals(2, stack.pop());
    }
}
