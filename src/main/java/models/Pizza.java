package models;

public class Pizza {


    private int id;
    private String name;
    private String cheese;
    private String sauce;
    private String toppings;
    private int qty;
    private float price;

    public Pizza(int id, String name, String cheese, String toppings, int qty, float price) {
        this.id = id;
        this.name = name;
        this.cheese = cheese;
        this.toppings = toppings;
        this.qty = qty;
        this.price = price;
    }
    public Pizza() {

    }
    public String getCheese() {
        return cheese;
    }
    public void setCheese(String cheese) {
        this.cheese = cheese;
    }
    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
    public String getToppings() {
        return toppings;
    }
    public void setToppings(String toppings) {
        this.toppings = toppings;
    }
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}