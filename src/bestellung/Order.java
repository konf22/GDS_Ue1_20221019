package bestellung;

public class Order {
    private String number;
    private OrderLine[] arrayOfOrderLines;

    public Order(String number, OrderLine[] arrayOfOrderLines) {
        this.number = number;
        this.arrayOfOrderLines = arrayOfOrderLines;
    }

    public void printOrder() {
        System.out.println("bestellung.Order has " + arrayOfOrderLines.length + " lines:");
        for (int i = 0; i < arrayOfOrderLines.length; i++) {
            System.out.println(arrayOfOrderLines[i].toString());
        }
    }

    public double getTotalCosts() {
        double costs = 0;

        for (int i = 0; i < arrayOfOrderLines.length; i++) {
            costs = costs + arrayOfOrderLines[i].getCosts();
        }

        return costs;
    }

    public double getAverageOrderlineCosts() {
        double costs = 0;
        for (int i = 0; i < arrayOfOrderLines.length; i++) {
            costs += arrayOfOrderLines[i].getCosts();
        }
        return costs / (arrayOfOrderLines.length * 1.0);
    }

    public double getAverageOrderlineCosts2() {
        double totalCosts = getTotalCosts();
        return totalCosts / (arrayOfOrderLines.length * 1.0);
    }

    public double getAverageOrderlineCosts3() {
        return getTotalCosts() / (arrayOfOrderLines.length * 1.0);
    }

    public String getNumber() {
        return number;
    }

    public OrderLine[] getArrayOfOrderLines() {
        return arrayOfOrderLines;
    }
}
