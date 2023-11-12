import java.util.ArrayList;

public class GameManager {

    private ArrayList<Card> cardDeck;
    private ArrayList<Player> players;

    public GameManager(ArrayList<Card> cardDeck, ArrayList<Player> playerList) {

        this.cardDeck = cardDeck;
        this.players = playerList;
    }

    public void addCard(Card card) {

        cardDeck.add(card);
    }

    public void addPlayer(Player player) {

        players.add(player);
    }

    public Card getCard(int indexOfCard) {

        return cardDeck.get(indexOfCard);
    }

    public Player getPlayer(int indexOfPlayer) {
    
        return players.get(indexOfPlayer);
    }
    
    public int getNumberOfPlayers() {

        return players.size();
    }

    public int getNumberOfCards() {

        return cardDeck.size() - 1;
    }

    public Card randomCard(int index) {

        Card randCard = cardDeck.get(index);
        cardDeck.remove(index);
        return randCard;
    }

    public int currentPlayerScore(Player currPlayer) {
        int totalScore = 0;

        for (int i = 0; i < currPlayer.getNumCards(); i++) {

            totalScore += currPlayer.getCard(i).getCardValue();
        }

        return totalScore + 1;
    }

    public void checkGameState() {

        ArrayList<Player> busters = new ArrayList<Player>();

        for (int currPlayerIndex = 0; currPlayerIndex < players.size(); currPlayerIndex++) {

            Player currPlayer = players.get(currPlayerIndex);

            if (currentPlayerScore(currPlayer) > 21) {

                System.out.println("Player " + currPlayer.getPlayerNum() + " has gone Bust!");
                busters.add(currPlayer);
                
            } else {
                System.out.println("Player " + currPlayer.getPlayerNum() + " has a score of " + currentPlayerScore(currPlayer));
            }

        }
        //removing busters now (not before so the index doesn't get screwed up)
        for (int i = 0; i < busters.size(); i++) {

            players.remove(busters.get(i));
        }

        if (getNumberOfPlayers() == 1) System.out.println("Player " + players.get(0).getPlayerNum() + " Won!");
    }
}