public class CardStack {
    private Card[] cards;
    private int counter;

    public CardStack(Card[] cards) {
        this.cards = cards;
        this.counter = -1;
        //counter = -1;
    }

    public void push(Card newElement) {
        counter++;
        cards[counter] = newElement;
    }

    public Card pop(){
        Card result = cards[counter];
        counter--;
        return result;
    }
}
