package Stack;

public class DemoApp {
    public static void main(String[] args) {
 Card[] cards = new Card[3];
 CardStack cardStack = new CardStack(cards);
        cardStack.push(new Card(3 , "yellow"));
        cardStack.push(new Card(7, "green"));
        cardStack.push(new Card(9, "blue"));
        cardStack.push(new Card(9, "blue"));
        Card c1 = cardStack.pop();
        System.out.println("c1 = " + c1);
        Card c2 = cardStack.pop();
        System.out.println("c2 = " + c2);
        Card c3 = cardStack.pop();
        System.out.println("c3 = " + c3);
        Card c4 = cardStack.pop();
        System.out.println("c4 = " + c4);
    }
}
