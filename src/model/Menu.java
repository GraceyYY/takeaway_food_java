package model;

import java.util.HashMap;

public class Menu {

    private HashMap<String, Dish> menu = new HashMap<String, Dish>();

    public Menu() {
        menu.put("ITEM0001", new Dish("黄焖鸡", "ITEM0001", 18.00));
        menu.put("ITEM0013", new Dish("肉夹馍", "ITEM0013", 6.00));
        menu.put("ITEM0022", new Dish("凉皮", "ITEM0022", 8.00));
        menu.put("ITEM0030", new Dish("冰峰", "ITEM0030", 2.00));
    }

    public HashMap<String, Dish> getMenu() {
        return this.menu;
    }
}
