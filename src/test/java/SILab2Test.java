package src.test.java;
import org.junit.Test;

import src.main.java.SILab2;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Item {
    String name;
    String barcode; //numerical
    int price;
    float discount;

    public Item(String name, String code, int price, float discount) {
        this.name = name;
        this.barcode = code;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public String getBarcode() {
        return barcode;
    }

    public int getPrice() {
        return price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBarcode(String code) {
        this.barcode = code;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}


public class SILab2Test {

    @Test
    public void testPriceGreaterThan300() {
        Item item = new Item("Item1", "0123456789", 350, 0.1f);
        assertTrue(SILab2.checkCart(Arrays.asList(item), 35));
    }

    @Test
    public void testPriceNotGreaterThan300() {
        Item item = new Item("Item1", "0123456789", 300, 0.1f);
        assertTrue(SILab2.checkCart(Arrays.asList(item), 30));
    }

    @Test
    public void testDiscountGreaterThan0() {
        Item item = new Item("Item1", "0123456789", 250, 0.1f);
        assertTrue(SILab2.checkCart(Arrays.asList(item), 25));
    }

    @Test
    public void testDiscountEqualTo0() {
        Item item = new Item("Item1", "0123456789", 250, 0.0f);
        assertTrue(SILab2.checkCart(Arrays.asList(item), 250));
    }

    @Test
    public void testBarcodeStartsWith0() {
        Item item = new Item("Item1", "0123456789", 250, 0.1f);
        assertTrue(SILab2.checkCart(Arrays.asList(item), 25));
    }

    @Test
    public void testBarcodeNotStartsWith0() {
        Item item = new Item("Item1", "1123456789", 250, 0.1f);
        assertTrue(SILab2.checkCart(Arrays.asList(item), 25));
    }
}
