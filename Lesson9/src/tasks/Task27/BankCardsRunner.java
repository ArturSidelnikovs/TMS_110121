package tasks.Task27;

public class BankCardsRunner {
    public static void main(String[] args) {

        CardParitretBank cardParitretBank = new CardParitretBank("Пластик", "ПаритетБанк", "Рубли");
        LuxuryBankParitetCard luxuryBankParitetCard= new LuxuryBankParitetCard("Пластик", "ПаритетБанк",
                                                                               "Рубли", "Доллары", "Плата", "Да");

        luxuryBankParitetCard.ToWithdrawMoney();
        luxuryBankParitetCard.Opportunities();
        luxuryBankParitetCard.Payment();
        luxuryBankParitetCard.СhargeForCredit();
        luxuryBankParitetCard.PutTheMoney();
    }
}
