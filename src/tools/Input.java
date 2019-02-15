package tools;

import java.util.Scanner;

public class Input {

    public String[] takeOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入所选菜品（例如：ITEM0001 * 2）,不同菜品请使用逗号隔开");
        String[] order = scanner.nextLine().split(",");
        return order;
    }
}
