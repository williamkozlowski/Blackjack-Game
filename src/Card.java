public class Card {

    String suit;
    int number;
    boolean isAce;
    String cardName;

    public Card(String suit, String cardName, int number){
        //this. means the varible in this class
        this.suit = suit;
        this.cardName = cardName;
        this.number = number;
        this.isAce = false;
        
    }

    public Card(String suit, String cardName, int number, boolean isAce) {

        this.suit = suit;
        this.cardName = cardName;
        this.number = number;
        this.isAce = isAce;
    }
    
    public String getCardName() {

        return cardName;
    }

    public int getCardValue() {

        return number;
    }
}