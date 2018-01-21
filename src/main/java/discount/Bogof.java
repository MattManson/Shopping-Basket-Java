package discount;

import basket.*;

import java.util.ArrayList;

public class Bogof implements IDiscount {
    @Override
    public double applyDiscount(ArrayList<Item> items, double total) {
        return 0;
    }
}
