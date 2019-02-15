package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Dish> order;

    public Order() {
        this.order = new ArrayList<Dish>();
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

    public List<Dish> getOrder() {
        return this.order;
    }

    public void setOrder(List<Dish> order) {
        this.order = order;
    }
}
