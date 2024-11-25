import java.util.HashMap;
/**
 * Concept of component, very basic.
 */
public class CardCollectionConcept {
    /** name of card. */
    private String card;
    /** Map where values are stored. */
    private HashMap<String, Integer> cardValues;

    /**
     * Constructor.
     * @param cardName
     */
    public CardCollectionConcept(String cardName) {
        this.card = cardName;
        this.cardValues = new HashMap<String, Integer>();
    }

    /**
     * gets card name.
     * @return card name
     */
    public String getCard() {
        return this.card;
    }

    /**
     * Adds date,value pair to cardvalues.
     * @param date
     * @param value
     */
    public void setDateValue(String date, int value) {
        this.cardValues.put(date, value);
    }

    /**
     * Gets the value at {@code date}.
     * @param date
     * @return value at date
     */
    public int getValueAtDate(String date) {
        return this.cardValues.get(date);
    }

    /**
     * testing.
     *
     * @param args
     */
    public static void main(String[] args) {
        CardCollectionConcept pika = new CardCollectionConcept("Pikachu");

        pika.setDateValue("10/21/2024", 1500);
        pika.setDateValue("11/14/2024", 5);

        System.out.println("This is the rare " + pika.getCard() + " card!");
        System.out.println(
                "The value of " + pika.getCard() + " at 10/21/2024 was: ");
        System.out.println("$ " + pika.getValueAtDate("10/21/2024"));
    }
}
