public class DemoApp {
    public static void main(String[] args) {
        System.out.println("Hello World");


        Card card = new Card(1, "red");

        System.out.println(card);

        Card[] array = new Card[8];
        CardStack cardStack = new CardStack(array);

    }
}
