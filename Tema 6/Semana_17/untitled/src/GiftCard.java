import java.util.List;

public class GiftCard {
    private float cardBalance = 0;
    private int cardNumber;

    public GiftCard(float cardBalance, int cardNumber) {
        this.cardBalance = cardBalance;
        this.cardNumber = cardNumber;
    }

    public float getCardBalance() {
        return cardBalance;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardBalance(float cardBalance) {
        this.cardBalance = cardBalance;
    }

    public void gasta(float spendAmount) {
        setCardBalance(getCardBalance() - spendAmount);
    }

    public void increaseBalance(float topUpBalance) {
        setCardBalance(getCardBalance() + topUpBalance);
    }

    public float fusionaCon(GiftCard card){
        return this.getCardBalance()+card.getCardBalance();
    }


}
