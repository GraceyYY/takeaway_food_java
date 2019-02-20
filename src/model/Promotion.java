package model;

import service.Order;

public abstract class Promotion {
    private String type;
    protected String items;

    public Promotion(String type, String items) {
        this.type = type;
        this.items = items;
    }

    public abstract double discount(Order order);

    public String getType() {

        return this.type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public String getItems() {

        return this.items;
    }

    public void setItems(String items) {

        this.items = items;
    }
}
