import service.Order;
import tools.Input;
import tools.Print;

public class Main {

    public static void main(String[] args) {
        Input input = new Input();
        Order order = new Order(input.takeOrder());
        Print output = new Print(order);
        output.printOrder();
        output.printPromotion();
        output.printTotalPrice();
    }
}