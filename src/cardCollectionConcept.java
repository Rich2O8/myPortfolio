import components.map.Map1L;

public class cardCollectionConcept {
    private String card;private Map<
    String date,
    int value>cardValues;

    public cardCollectionConcept(String cardName) {
        this.card = cardName;
        this.cardValues = new Map1L<>();
    }

    public String getCard() {
        return this.card;
    }

    public void setDateValue(String date, int value) {
        this.cardValues.add(date, value);
    }

    public int getValueAtDate(String date) {
        this.cardValues.value(date);
    }

    public static void main(String[] args) {
        cardCollectionConcept card1 = new cardCollectionConcept("Pikachu");

        String d1 = "10/12/2021", d2 = "12/18/2024";
        int v1 = 500, v3 = 1500;

        card1.setDateValue(d1, v1);
        card1.setDateValue(d2, v3);

        System.out.println("Card: " + card1.getCard());
        System.out.println("Date: " + d2);
        System.out.println("Value: " + card1.getValueAtDate(d2));
    }
}
