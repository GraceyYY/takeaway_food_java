package tools;

import model.Dish;
import service.Discount;
import service.Order;

import java.util.List;

public class Print {
    private Order order;

    public Print(Order order) {
        this.order = order;
    }

    public void printOrder() {
        String output = "============= 订餐明细 =============\n";
        List<Dish> ordered = this.order.getOrder();
        for (int i = 0; i < ordered.size(); i++) {
            Dish dish = ordered.get(i);
            String tmp = dish.getName() + " x " + dish.getNum() + " = " + (dish.getNum() * dish.getPrice()) + "\n";
            output += tmp;
        }

        System.out.println(output);
    }

    public void printPromotion() {
        Discount discount = new Discount(this.order);
        String output = "-----------------------------------\n使用优惠: " + discount.getBestPromotion() + "，省" + discount.getDiscount() + "元";
        System.out.println(output);
    }

    public void printTotalPrice() {
        Discount discount = new Discount(this.order);
        String output = "-----------------------------------\n总计：" + (this.order.getFullPrice() - discount.getDiscount()) + "元";
        System.out.println(output);
    }
}
