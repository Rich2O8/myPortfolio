import components.cardcollection.CardCollectionMap;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter1L;

/**
 * First use case for CardCollection component. This use case will promt the
 * user to make a card by giving it a name, then start adding values with their
 * dates. Then, if the card has at least one value, it will ask if they want to
 * edit one of their entries. At the end, this use case will print out the card
 * and its entries in no particular order.
 */
public final class CardMaker {
    /**
     * No argument constructor--private to prevent instantiation.
     */
    private CardMaker() {
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

        out.println("Hello there! I'm generator!");
        out.println(
                "Make a card of your choice, then add the card's value at a date");

        out.print("What will be the name of the card? ");
        String cardName = in.nextLine();

        //Creates a card with the given name
        CardCollectionMap userCard = new CardCollectionMap(cardName);

        boolean add = true;
        while (add) {
            /**
             * Asks the user if they want to add a date and value to their card.
             * If no then, it will not ask for a date and value. Otherwise, it
             * will keep asking for date and value.
             */
            out.print(
                    "Would you like to add a date & value of the card? (Y/N): ");
            String yesNo = in.nextLine();

            if (yesNo.toUpperCase().equals("Y")) {
                //Asks user for the date of a card.
                out.print("Enter a date? Ex: 10/21/2024; ");
                String dateString = in.nextLine();

                //Asks user for the value at the date given.
                out.print("What was the value of " + userCard.card() + " at "
                        + dateString + " ? ");
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

                    if (editYn.toUpperCase().equals("Y")) {
                        out.print("Enter a date to edit? Ex: 10/21/2024; ");
                        String dateReplace = in.nextLine();

                        out.print("Enter a replacement date? Ex: 10/21/2021; ");
                        String dateReplaceWith = in.nextLine();

                        userCard.changeDate(dateReplace, dateReplaceWith);
                        add = true;
                    }
                }
            }
        }

        //prints out the card.
        int count = 0;
        out.println("Card name " + userCard.card());
        while (userCard.mapSize() > count) {
            out.println(userCard.removeAnyDate());
        }
        in.close();
        out.close();
    }
}
