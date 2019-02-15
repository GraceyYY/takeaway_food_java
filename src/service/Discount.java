package service;

import model.DeductOverFullPrice;
import model.HalfPrice;

public class Discount {
    private String bestPromotion;
    private double discount;

    public Discount(Order order) {
        DeductOverFullPrice deductOver30 = new DeductOverFullPrice("满30减6", "All");
        HalfPrice halfPrice = new HalfPrice("指定菜品半价", "ITEM0001, ITEM0022");
        double discountOver30 = deductOver30.discount(order);
        double discountHalfPrice = halfPrice.discount(order);
        if ( discountOver30 == 0 && discountHalfPrice == 0) {
            this.bestPromotion = "无";
            this.discount = 0;
        } else if (discountOver30 >= discountHalfPrice) {
            this.bestPromotion = deductOver30.getType();
            this.discount = discountOver30;
        } else {
            this.bestPromotion = halfPrice.getType();
            this.discount = discountHalfPrice;
        }
    }

    public String getBestPromotion() {
        return this.bestPromotion;
    }

    public void setBestPromotion(String bestPromotion) {
        this.bestPromotion = bestPromotion;
    }

    public double getDiscount() {
        return this.discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
