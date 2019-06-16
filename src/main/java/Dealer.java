import java.util.ArrayList;

public class Dealer {

    private Deck deck;
    private ArrayList<Card> hand;


    public Dealer(){
        this.deck = new Deck();
        this.hand = new ArrayList<Card>();
    }

    public void pullOutMyDeck(){
        this.deck.addCardsToDeck();

    }

    public void shuffleDeck(){
        this.deck.shuffleCards();
    }

    public int myDeckLength() {
        return this.deck.deckLength();
    }

    public Card dealOne() {
        return this.deck.removeTopCard();
    }

    public void dealSelf() {
        Card card = this.dealOne();
        this.hand.add(card);
    }

    public int countMyHand() {
        return this.hand.size();
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
