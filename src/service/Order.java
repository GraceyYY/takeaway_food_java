package service;

import model.Dish;
import model.Menu;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Dish> order;
    private double fullPrice;

    public Order(String[] orders) {
        this.order = new ArrayList<Dish>();
        processOrder(orders);
        calculatePrice();
    }

    private void processOrder(String[] orders) {
        Menu menu = new Menu();
        for (int i = 0; i <orders.length; i++) {
            String[] tmp = orders[i].split("x");
            String id = tmp[0].trim();
            int num = Integer.parseInt(tmp[1].trim());
            Dish dish = menu.getMenu().get(id);
            dish.setNum(num);
            this.order.add(dish);
        }
    }

    private void calculatePrice() {
        for (int i = 0; i < this.order.size(); i++) {
            Dish dish = this.order.get(i);
            this.fullPrice += dish.getPrice() * dish.getNum();
        }
    }

    public List<Dish> getOrder() {
        return this.order;
    }

    public void setOrder(List<Dish> order) {
        this.order = order;
    }

    public double getFullPrice() {
        return this.fullPrice;
    }

    public void setFullPrice(double fullPrice) {
        this.fullPrice = fullPrice;
    }
}
