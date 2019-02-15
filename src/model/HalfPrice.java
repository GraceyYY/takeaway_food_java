package model;

import service.Order;

import java.util.List;

public class HalfPrice extends Promotion {
    public HalfPrice(String type, String items) {
        super(type, items);
    }

    @Override
    public double discount(Order order) {
        List<Dish> ordered = order.getOrder();
        double discount = 0;
        for (int i = 0; i < ordered.size(); i++) {
            Dish dish = ordered.get(i);
            if (this.getItems().indexOf(dish.getId()) >= 0) {
                discount += dish.getPrice() / 2 * dish.getNum();
            }
        }
        return discount;
    }
}
