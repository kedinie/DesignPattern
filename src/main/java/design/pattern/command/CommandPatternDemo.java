package design.pattern.command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock absStock = new Stock();

        BuyStock buyStock = new BuyStock(absStock);
        SellStock sellStock = new SellStock(absStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }
}
