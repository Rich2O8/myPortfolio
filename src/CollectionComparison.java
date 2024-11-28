import components.cardcollection.CardCollectionMap;
import components.map.Map;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter1L;

/**
 * Compares two cards to figure out which one has the higher value based
 * on the average of the values of each card.
 */
public final class CollectionComparison {
    /**
     * No argument constructor--private to prevent instantiation.
     */
    private CollectionComparison() {
    }

    /**
     * Gets the avg value of the {@Code card}.
     *
     * @param card
     *            Card to get average value of.
     * @return the average value of {@Code card}.
     */
    public int averageLostGained(CardCollectionMap card) {
        int average = 0, numberOfValues = card.mapSize();
        CardCollectionMap cardCopy = card.newInstance();
        for (int i = 0; i < numberOfValues; i++) {
            Map.Pair<String, Integer> entry = card.removeAnyDate();
            average += entry.value();
            cardCopy.addCardValue(entry.key(), entry.value());
        }
        card.transferFrom(cardCopy);
        return average / numberOfValues;
    }

    /**
     * Determines whether {@Code card1} is more valuable than {@Code card2}.
     *
     * @param card1
     *            The card to compare agaisnt {@Code card2}
     * @param card2
     *            The card that {@Code card1} will be compared agaisnt.
     * @return True if card1 is more valuable than card2. False if otherwise.
     */
    public boolean isValuabler(CardCollectionMap card1,
            CardCollectionMap card2) {
        boolean itIsValuabler = true;
        if (this.averageLostGained(card1) <= this.averageLostGained(card2)) {
            itIsValuabler = false;
        }
        return itIsValuabler;
    }

    /**
     * Main class using OSU read and write components.
     *
     * @param args
     */
    public static void main(String[] args) {
        //Establishes read and write objects.
        SimpleReader1L in = new SimpleReader1L();
        SimpleWriter1L out = new SimpleWriter1L();
        String yes = "Y";

        CardCollectionMap firstCard = new CardCollectionMap("");
        CardCollectionMap secondCard = firstCard.newInstance();
        for (int i = 0; i < 2; i++) {
            out.print("What will be the name of the card? ");
            String cardName = in.nextLine();

            //Creates a card with the given name
            CardCollectionMap userCard = new CardCollectionMap(cardName);

            boolean add = true;
            while (add) {
                /**
                 * Asks the user if they want to add a date and value to their
                 * card. If no then, it will not ask for a date and value.
                 * Otherwise, it will keep asking for date and value.
                 */
                out.print(
                        "Would you like to add a date & value of the card? (Y/N): ");
                String yesNo = in.nextLine();

                if (yesNo.toUpperCase().equals(yes)) {
                    //Asks user for the date of a card.
                    out.print("Enter a date? Ex: 10/21/2024; ");
                    String dateString = in.nextLine();

                    //Asks user for the value at the date given.
                    out.print("What was the value of " + userCard.card()
                            + " at " + dateString + " ? ");
                    int cardValue = in.nextInteger();

                    //Adds the date & value to the storage of values in userCard.
                    userCard.addCardValue(dateString, cardValue);
                } else {
                    add = false;
                    if (!add && userCard.mapSize() > 0) {
                        //Asks the user if they want to edit a response
                        out.print(
                                "Would you like to edit a response's date? (Y/N): ");
                        String editYn = in.nextLine();

                        if (editYn.toUpperCase().equals(yes)) {
                            out.print("Enter a date to edit? Ex: 10/21/2024; ");
                            String dateReplace = in.nextLine();

                            out.print(
                                    "Enter a replacement date? Ex: 10/21/2021; ");
                            String dateReplaceWith = in.nextLine();

                            userCard.changeDate(dateReplace, dateReplaceWith);
                            add = true;
                        }
                    }
                }
            }
            if (i == 0) {
                firstCard.transferFrom(userCard);
            } else {
                secondCard.transferFrom(userCard);
            }
        }

        out.print("Would you like know which card is more valuable? (Y/N): ");
        String findOut = in.nextLine();
        if (findOut.toUpperCase().equals(yes)) {
            CollectionComparison comparitor = new CollectionComparison();
            boolean oneValuable = comparitor.isValuabler(firstCard, secondCard);

            if (oneValuable) {
                out.println(firstCard.card() + " is more valuable than "
                        + secondCard.card() + ".");
                out.print(" This is based on the value avg over "
                        + firstCard.mapSize() + " dates of "
                        + firstCard.card());
                out.print(", and " + secondCard.mapSize() + " dates of "
                        + secondCard.card());
            } else {
                out.println(secondCard.card() + " is more valuable than "
                        + firstCard.card() + ".");
                out.print(" This is based on the value avg over "
                        + secondCard.mapSize() + " dates of "
                        + secondCard.card());
                out.print(", and " + firstCard.mapSize() + " dates of "
                        + firstCard.card());
            }
        }
        in.close();
        out.close();
    }
}
