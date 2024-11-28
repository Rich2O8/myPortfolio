package components.cardcollection;

/**
 * Layered implementation of secondary methods for {@code CardCollection}.
 */
public class CardCollectionSecondary implements CardCollection {

    @Override
    public final int valueBWDates(String date1, String date2) {
        int value1 = this.valAtDate(date1), value2 = this.valAtDate(date2);

        return (value2 - value1);
    }

    @Override
    public final void changeDate(String originalDate, String date2) {
        this.addCardValue(date2, this.removeCardDate(originalDate));
    }

    @Override
    public final boolean valBigger(String date1, String date2) {
        int val1 = this.valAtDate(date1), val2 = this.valAtDate(date2);

        return (val1 > val2);
    }

    @Override
    public final boolean equals(Object an) {
        boolean same = true;
        if (an instanceof CardCollection) {
            CardCollection otherCard = (CardCollection) an;
            if (this.card() != otherCard.card()) {
                same = false;
            } else if (this.mapSize() != otherCard.mapSize()) {
                same = false;
            }
        } else {
            same = false;
        }
        return same;
    }

    @Override
    public final int hashCode() {
        return this.card().hashCode();
    }

}
