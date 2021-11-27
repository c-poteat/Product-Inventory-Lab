package models;

public class Beer {
    private int id;
    private String name;
    private float price;
    private int quantity;
    private String type;

    public Beer(int id, String name, float price, int quantity, String type) {
    this.id  = id;
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.type = type;
    }

    public Beer() {

    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
}
