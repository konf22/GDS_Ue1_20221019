public class Order {
    private String number;
    private OrderLine[] arrayOfOrderLines;

    public Order(String number, OrderLine[] arrayOfOrderLines) {
        this.number = number;
        this.arrayOfOrderLines = arrayOfOrderLines;
    }

    public void printBestellung() {
        System.out.println("Order has " + arrayOfOrderLines.length + " lines:");
        for (int i = 0; i < arrayOfOrderLines.length; i++) {
            System.out.println(arrayOfOrderLines[i].toString());
        }
    }

    public double getCosts() {
        double costs = 0;

        for (int i = 0; i < arrayOfOrderLines.length; i++) {
            costs = costs + arrayOfOrderLines[i].getCosts();
        }

        return costs;
    }

    public String getNumber() {
        return number;
    }

    public OrderLine[] getArrayOfOrderLines() {
        return arrayOfOrderLines;
    }
}
