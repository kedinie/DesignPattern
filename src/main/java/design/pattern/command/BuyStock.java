package design.pattern.command;

public class BuyStock implements Order {
    private Stock absStock;

    public BuyStock(Stock absStock) {
        this.absStock = absStock;
    }

    @Override
    public void execute() {
        absStock.buy();
    }
}
