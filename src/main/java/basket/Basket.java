package basket;

import discount.Bogof;
import discount.IDiscount;

import java.util.ArrayList;

public class Basket {

    ArrayList<Item> items;
    ArrayList<IDiscount> discounts;

    public Basket() {
        this.items = new ArrayList<>();
        this.discounts = new ArrayList<>();
    }

    public boolean isEmpty(){
        return this.items.size() == 0;
    }

    public int numItems() {
        if(isEmpty()) return 0;
        return items.size();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Item removeItem(Item item) {
        items.remove(item);
        return item;
    }

    public boolean containsItem(Item item) {
        return items.contains(item);
    }

    public void emptyBasket() {
        items.clear();
    }

    public boolean discountsEmpty() {
        return this.discounts.size() == 0;
    }

    public void addDiscount(IDiscount discount) {
        this.discounts.add(discount);
    }

    public int numDiscounts() {
        if (discountsEmpty()) return 0;
        return discounts.size();
    }

    public double getTotal() {
        double total = 0;
        for(Item item : items){
            total += item.getPrice();
        }
        return total;
    }
}
