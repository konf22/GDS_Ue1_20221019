package stack;

public class CardStack {
    private Card[] cards;
    private int counter;

    public CardStack(Card[] cards) {
        this.cards = cards;
        this.counter = -1;
        //counter = -1;
    }

    public void push(Card newElement) {
        // cards.length == 2
        if (cards.length > counter + 1) {
            counter++;
            cards[counter] = newElement;
        }
        else {
            System.out.println("Stack ist voll: " + newElement);
        }
    }

    public Card pop(){
        if (counter >= 0) {
            Card result = cards[counter];
            counter--;
            return result;
        } else {
            System.out.println("Stack ist bereits leer");
            return null;
        }
    }
}
