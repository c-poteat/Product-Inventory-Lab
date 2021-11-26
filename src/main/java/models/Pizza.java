package models;

public class Pizza {

    private String name;
    private String cheese;
    private String sauce;
    private String toppings;
    private int qty;
    private float price;

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
