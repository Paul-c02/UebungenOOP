package Stack;

public class CardStack {
    private Card[] cards;
    private int counter;

    public CardStack(Card[] cards) {
        this.cards = cards;
        this.counter = -1;
    }

    public void push(Card newCard) {
        if (cards.length > counter + 1) {
            counter++;
            cards[counter] = newCard;
        } else System.out.println("Stack is full:" + newCard);
    }

    public Card pop() {
        if (counter >= 0) {
            Card result = cards[counter];
            counter--;
            return result;
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }
}
