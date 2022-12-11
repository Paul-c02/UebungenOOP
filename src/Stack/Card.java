package Stack;

public class Card {
    private int value;
    private String colour;

    public Card(int value, String colour) {
        if (value < 1 || value > 9){
            System.out.println("Not allowed value:"+ value);
            return;
        }
        if (colour.equals("blue") || colour.equals("red") || colour.equals("green") || colour.equals("yellow")){
            this.value = value;
            this.colour = colour;
        } else System.out.println("Not allowed colour:"+ colour);

    }

    public int getValue() {
        return value;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", colour='" + colour + '\'' +
                '}';
    }
}
