import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Card> cardDeck = new ArrayList<Card>();
        ArrayList<Player> players = new ArrayList<Player>();

        GameManager newGame = new GameManager(cardDeck, players);

        // Deck of cards
        Card card1 = new Card("Spades", "2 of Spades", 2);
        newGame.addCard(card1);
        Card card2 = new Card("Spades", "3 of Spades", 3);
        newGame.addCard(card2);
        Card card3 = new Card("Spades", "4 of Spades", 4);
        newGame.addCard(card3);
        Card card4 = new Card("Spades", "5 of Spades", 5);
        newGame.addCard(card4);
        Card card5 = new Card("Spades", "6 of Spades", 6);
        newGame.addCard(card5);
        Card card6 = new Card("Spades", "7 of Spades", 7);
        newGame.addCard(card6);
        Card card7 = new Card("Spades", "8 of Spades", 8);
        newGame.addCard(card7);
        Card card8 = new Card("Spades", "9 of Spades", 9);
        newGame.addCard(card8);
        Card card9 = new Card("Spades", "10 of Spades", 10);
        newGame.addCard(card9);
        Card card10 = new Card("Spades", "Jack of Spades", 10);
        newGame.addCard(card10);
        Card card11 = new Card("Spades", "Queen of Spades", 10);
        newGame.addCard(card11);
        Card card12 = new Card("Spades", "King of Spades", 10);
        newGame.addCard(card12);
        Card card13 = new Card("Spades", "Ace of Spades", 1, true);
        newGame.addCard(card13);
        Card card14 = new Card("Clubs", "2 of Clubs", 2);
        newGame.addCard(card14);
        Card card15 = new Card("Clubs", "3 of Clubs", 3);
        newGame.addCard(card15);
        Card card16 = new Card("Clubs", "4 of Clubs", 4);
        newGame.addCard(card16);
        Card card17 = new Card("Clubs", "5 of Clubs", 5);
        newGame.addCard(card17);
        Card card18 = new Card("Clubs", "6 of Clubs", 6);
        newGame.addCard(card18);
        Card card19 = new Card("Clubs", "7 of Clubs", 7);
        newGame.addCard(card19);
        Card card20 = new Card("Clubs", "8 of Clubs", 8);
        newGame.addCard(card20);
        Card card21 = new Card("Clubs", "9 of Clubs", 9);
        newGame.addCard(card21);
        Card card22 = new Card("Clubs", "10 of Clubs", 10);
        newGame.addCard(card22);
        Card card23 = new Card("Clubs", "Jack of Clubs", 10);
        newGame.addCard(card23);
        Card card24 = new Card("Clubs", "Queen of Clubs", 10);
        newGame.addCard(card24);
        Card card25 = new Card("Clubs", "King of Clubs", 10);
        newGame.addCard(card25);
        Card card26 = new Card("Clubs", "Ace of Clubs", 1, true);
        newGame.addCard(card26);
        Card card27 = new Card("Hearts", "2 of Hearts", 2);
        newGame.addCard(card27);
        Card card28 = new Card("Hearts", "3 of Hearts", 3);
        newGame.addCard(card28);
        Card card29 = new Card("Hearts", "4 of Hearts", 4);
        newGame.addCard(card29);
        Card card30 = new Card("Hearts", "5 of Hearts", 5);
        newGame.addCard(card30);
        Card card31 = new Card("Hearts", "6 of Hearts", 6);
        newGame.addCard(card31);
        Card card32 = new Card("Hearts", "7 of Hearts", 7);
        newGame.addCard(card32);
        Card card33 = new Card("Hearts", "8 of Hearts", 8);
        newGame.addCard(card33);
        Card card34 = new Card("Hearts", "9 of Hearts", 9);
        newGame.addCard(card34);
        Card card35 = new Card("Hearts", "10 of Hearts", 10);
        newGame.addCard(card35);
        Card card36 = new Card("Hearts", "Jack of Hearts", 10);
        newGame.addCard(card36);
        Card card37 = new Card("Hearts", "Queen of Hearts", 10);
        newGame.addCard(card37);
        Card card38 = new Card("Hearts", "King of Hearts", 10);
        newGame.addCard(card38);
        Card card39 = new Card("Hearts", "Ace of Hearts", 1, true);
        newGame.addCard(card39);
        Card card40 = new Card("Diamonds", "2 of Diamonds", 2);
        newGame.addCard(card40);
        Card card41 = new Card("Diamonds", "3 of Diamonds", 3);
        newGame.addCard(card41);
        Card card42 = new Card("Diamonds", "4 of Diamonds", 4);
        newGame.addCard(card42);
        Card card43 = new Card("Diamonds", "5 of Diamonds", 5);
        newGame.addCard(card43);
        Card card44 = new Card("Diamonds", "6 of Diamonds", 6);
        newGame.addCard(card44);
        Card card45 = new Card("Diamonds", "7 of Diamonds", 7);
        newGame.addCard(card45);
        Card card46 = new Card("Diamonds", "8 of Diamonds", 8);
        newGame.addCard(card46);
        Card card47 = new Card("Diamonds", "9 of Diamonds", 9);
        newGame.addCard(card47);
        Card card48 = new Card("Diamonds", "10 of Diamonds", 10);
        newGame.addCard(card48);
        Card card49 = new Card("Diamonds", "Jack of Diamonds", 10);
        newGame.addCard(card49);
        Card card50 = new Card("Diamonds", "Queen of Diamonds", 10);
        newGame.addCard(card50);
        Card card51 = new Card("Diamonds", "King of Diamonds", 10);
        newGame.addCard(card51);
        Card card52 = new Card("Diamonds", "Ace of Diamonds", 1, true);
        newGame.addCard(card52);
        
        System.out.println("black jack game");
        
        Scanner swagScanner = new Scanner(System.in);

        System.out.println("enter number of players: ");
        int numPlayers = swagScanner.nextInt();

        // Adding all the player's with their starting hand to the game;
        int randomNum1;
        int randomNum2;
        for (int i = 1; i <= numPlayers; i++) {

            randomNum1 = (int) (Math.random() * newGame.getNumberOfCards());
            randomNum2 = (int) (Math.random() * newGame.getNumberOfCards());
            Player currPlayer = new Player(newGame.randomCard(randomNum1), newGame.randomCard(randomNum2), i);
            newGame.addPlayer(currPlayer);
        }

        //Main game
        int roundNumber = 1;
        while (true) {
            
            System.out.println("Round number " + roundNumber);

            // For each players turn
            for (int j = 0; j < newGame.getNumberOfPlayers(); j++) {

                System.out.println("Player " + newGame.getPlayer(j).getPlayerNum() + "'s hand:");

                Player currPlayer = newGame.getPlayer(j);

                for (int k = 0; k < currPlayer.getNumCards(); k++) {

                    System.out.println((currPlayer.getCard(k)).getCardName());
                }

                System.out.println("_______________");
                System.out.println("Actions:\n1. Draw a card\n2. Stand");

                int playerChoice = swagScanner.nextInt();

                if (playerChoice == 1) {

                    int randCard = (int) (Math.random() * newGame.getNumberOfCards());
                    currPlayer.addCard(newGame.randomCard(randCard));
                    System.out.println("Added the following card to your deck: " + newGame.getCard(randCard).getCardName());
                }     

                System.out.println("(enter 1 to finish turn)");
                swagScanner.nextInt();
            }

            newGame.checkGameState();

            System.out.println("Exit? (enter '1' to exit, enter any other number to continue)");
            
            int response = swagScanner.nextInt();

            if (response == 1) {
                break; 
            } else {
                roundNumber++;
            }
        }
        
        swagScanner.close();
    }

}