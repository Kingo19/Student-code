package Items;

public abstract class CandyStoreItems {

    private String name;
    private String ID;
    private String description;
    private double price;
    private int quantity = 100;
    private String isWrapped;

    // CONSTRUCTOR

    public CandyStoreItems(String name, String ID, double price, String isWrapped) {
        this.name = name;
        this.ID = ID;
        this.price = price;

    }

    // GETTERS

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getIsWrapped() {
        return isWrapped;
    }

    // SETTERS

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String isWrapped() {
        if (isWrapped.equals("T")) {
            this.isWrapped = "Y";
        } else if (isWrapped.equals("F")) {
            this.isWrapped = "N";
        }
        return isWrapped;
    }
}
