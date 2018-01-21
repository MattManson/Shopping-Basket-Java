import basket.*;
import discount.Bogof;
import discount.Loyalty2;
import discount.TenPercent;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BasketTest {

    Basket basket;

    Milk milk;
    Eggs eggs;
    Bread bread;
    ExpensiveThing expensiveThing;

    Bogof bogof;
    TenPercent tenPercent;
    Loyalty2 loyalty2;

    @Before
    public void before(){
        basket = new Basket();

        milk = new Milk("semi-skimmed milk", 0.86);
        eggs = new Eggs("half dozen eggs", 1.20);
        bread = new Bread("wholemeal sandwich loaf", 1.40);
        expensiveThing = new ExpensiveThing("i'm pricey", 40.5);
    }

    @Test
    public void canIsEmpty(){
        assertEquals(true, basket.isEmpty());
    }

    @Test
    public void canGetNumItems(){
        assertEquals(0, basket.numItems());
    }

    @Test
    public void canAddItems(){
        basket.addItem(milk);
        basket.addItem(bread);
        assertEquals(2, basket.numItems());
    }

    @Test
    public void canRemoveItems(){
        basket.addItem(milk);
        basket.addItem(bread);
        basket.addItem(eggs);
        basket.removeItem(bread);
        assertEquals(2, basket.numItems());
    }
    @Test
    public void containsSpecificItem(){
        basket.addItem(milk);
        basket.addItem(bread);
        basket.addItem(eggs);
        assertEquals(true, basket.containsItem(bread));
        assertEquals(true, basket.containsItem(milk));
        assertEquals(true, basket.containsItem(eggs));
        assertEquals(false, basket.containsItem(expensiveThing));
    }
    @Test
    public void canEmptyBasket(){
        basket.addItem(milk);
        basket.addItem(bread);
        basket.addItem(eggs);
        basket.emptyBasket();
        assertEquals(0, basket.numItems());
    }
}
