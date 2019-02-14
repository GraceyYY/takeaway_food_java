package model;

public class Promotion {
    private String type;
    private String[] items;

    public Promotion(String type, String[] items) {
        this.type = type;
        this.items = items;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getItems() {
        return this.items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }
}
