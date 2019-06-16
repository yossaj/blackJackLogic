import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;
    private String name;
    private Dealer dealersAction;
    private Card card;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }


    public int countCards() {
        return this.hand.size();
    }

    public void pickUpCard(Card card){
        this.hand.add(card);
    }

    public int showCardValue(){
        Card card = this.hand.get(0);
        return card.getRank().getValue();
    }

    public int handValue(){
        int total = 0;
        for(Card card : hand){
            total += card.getRankValue();
        }
        return total;
    }
}