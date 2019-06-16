public class Game {

    private Dealer dealer;
    private Player player;


    public Game(Player player, Dealer dealer){
        this.dealer = dealer;
        this.player = player;
    }

    public void dealerGetsReady(){
        this.dealer.pullOutMyDeck();
        this.dealer.shuffleDeck();
    }

    public Card dealerDeals(){
        return this.dealer.dealOne();
    }

    public void playerGetsCard(){
        Card tableCard = this.dealerDeals();
        this.player.pickUpCard(tableCard);
    }

    public int playerConfirmsHandSize() {
        return player.countCards();
    }

    public void dealerGetsCard(){

        dealer.dealSelf();
    }

    public int dealerCountsHand(){
        return dealer.countMyHand();
    }


    public void blackJackDeal(){
        this.playerGetsCard();
        this.dealerGetsCard();
        this.playerGetsCard();
        this.dealerGetsCard();
        if(dealer.handValue() < 16){
            this.dealerGetsCard();
        }
    }


    public boolean playersCardIsHighest() {

       if(player.showCardValue() > dealer.showCardValue()){
           return true;
       }else{
           return false;
       }
    }


    public boolean playersHandIsHigher() {

        if(player.handValue() > dealer.handValue() &&  player.handValue() <= 21){
            return true;
        }else{
            return false;
        }
    }


}
