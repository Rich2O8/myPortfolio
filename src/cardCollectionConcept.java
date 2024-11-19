import components.cardcollection.CardCollectionMap;

public class CardCollectionConcept {
    // private String card;
    // private HashMap<String, Integer> cardValues;

    // public CardCollectionConcept(String cardName) {
    //     this.card = cardName;
    //     this.cardValues = new HashMap<String, Integer>();
    // }

    // public String getCard() {
    //     return this.card;
    // }

    // public void setDateValue(String date, int value) {
    //     this.cardValues.put(date, value);
    // }

    // public int getValueAtDate(String date) {
    //     return this.cardValues.get(date);
    // }

    /**
     * testing
     *
     * @param args
     */
    public static void main(String[] args) {
        CardCollectionMap pika = new CardCollectionMap("Pikachu");

        pika.addCardValue("10/21/2024", 1500);
        pika.addCardValue("11/14/2024", 5);

        System.out.println("This is the rare " + pika.card() + " card!");
        System.out.println(
                "The value of " + pika.card() + " at 10/21/2024 was: ");
        System.out.println("$ " + pika.valAtDate("10/21/2024"));

    }
}
