import basket.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Milk milk;
    Eggs eggs;
    Bread bread;
    ExpensiveThing expensiveThing;

    @Before
    public void before(){
        milk = new Milk("semi-skimmed milk", 0.86);
        eggs = new Eggs("half dozen eggs", 1.20);
        bread = new Bread("wholemeal sandwich loaf", 1.40);
        expensiveThing = new ExpensiveThing("i'm pricey", 40.5);
    }

    @Test
    public void canGetName(){
        assertEquals("semi-skimmed milk", milk.getName());
    }
    @Test
    public void canSetName(){
        milk.setName("milk");
        assertEquals("milk", milk.getName());
    }
    @Test
    public void canGetPrice(){
        assertEquals(1.20, eggs.getPrice(), 0.001);
    }
    @Test
    public void canSetPrice(){
        eggs.setPrice(1.50);
        assertEquals(1.50, eggs.getPrice(), 0.001);
    }


}
