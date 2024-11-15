package components.cardcollection;

import components.map.Map;
import components.map.Map1L;

/**
 * {@code CardCollection} represented as {@link components.map} and
 * {@code String} with implementations of primary methods.
 */
public class CardCollectionMap extends CardCollectionSecondary {
    /**
     * Private members -- -----------------------------------------------------.
     */

    //The card name of this card.
    private String card;

    /**
     * The map that stores the card values of this card. Map Pair: Key: The date
     * as a string of the value of this card. Value: The value as an integer of
     * this card at the date (Key).
     */
    private Map1L<String, Integer> cardValues;

    /**
     * Creates initial representation for a card.
     *
     * @param cardName
     *            The name of the card that will be created.
     */
    private void newCardRep(String cardName) {
        this.card = cardName;
        this.cardValues = new Map1L<String, Integer>();
    }

    /**
     * Argument constructor.
     *
     * @param cardName
     *            the name of the card that will be built with this constructor.
     */
    public CardCollectionMap(String cardName) {
        this.newCardRep(cardName);
    }

    /**
     * Kernel Methods of CardCollection.
     */

    @Override
    public final String card() {
        return this.card;
    }

    @Override
    public final int mapSize() {
        return this.cardValues.size();
    }

    @Override
    public final void addCardValue(String date, int val) {
        this.cardValues.add(date, val);
    }

    @Override
    public final int removeCardDate(String date) {
        Map.Pair<String, Integer> dateValue = this.cardValues.remove(date);
        return dateValue.value();
    }

    @Override
    public final int valAtDate(String date) {
        int value = 0;
        if (this.cardValues.hasKey(date)) {
            value = this.cardValues.value(date);
        }
        return value;
    }
}
