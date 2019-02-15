package model;

import service.Order;

public class DeductOverFullPrice extends Promotion {
    public DeductOverFullPrice(String type, String items) {
        super(type, items);
    }

    @Override
    public double discount(Order order) {
        return deductOverFullPrice(order.getFullPrice(), 6, 30);
    }

    private double deductOverFullPrice(double fullPrice, int deduction, int target) {
        return fullPrice > target ? (fullPrice-deduction) : 0;
    }
}
