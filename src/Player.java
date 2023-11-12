import java.util.ArrayList;

public class Player {

    private ArrayList<Card> playerCards = new ArrayList<Card>();
    private int playerNum;
    private int numCards = 0;

    public Player(Card starterCard1, Card starterCard2, int playerNum) {

        playerCards.add(starterCard1);
        playerCards.add(starterCard2);
        this.playerNum = playerNum;
        numCards += 2;
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public int getNumCards() {
        return numCards;
    }

    public void addCard(Card newCard) {

        playerCards.add(newCard);
        numCards++;
    }

    public Card getCard(int cardNum) {

        return playerCards.get(cardNum);
    }

    public ArrayList<Card> getAllCards() {

        return playerCards;
    }
}