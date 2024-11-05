import java.util.HashMap;

public class CardCollectionConcept {
    private String card;
    private HashMap<String, Integer> cardValues;

    public CardCollectionConcept(String cardName) {
        this.card = cardName;
        this.cardValues = new HashMap<String, Integer>();
    }

    public String getCard() {
        return this.card;
    }

    public void setDateValue(String date, int value) {
        this.cardValues.put(date, value);
    }

    public int getValueAtDate(String date) {
        return this.cardValues.get(date);
    }

    public static void main(String[] args) {
        CardCollectionConcept card1 = new CardCollectionConcept("Pikachu");

        String d1 = "10/12/2021", d2 = "12/18/2024";
        int v1 = 500, v3 = 1500;

        card1.setDateValue(d1, v1);
        card1.setDateValue(d2, v3);

        System.out.println("Card: " + card1.getCard());
        System.out.println("Date: " + d2);
        System.out.println("Value: " + card1.getValueAtDate(d2));
    }
}
