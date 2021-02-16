package tasks.Task27;

public class LuxuryBankParitetCard extends CardParitretBank  {

     public String currency;
     public String opportunities;
     public String chargeForCredit;

    LuxuryBankParitetCard(String material, String bank, String value, String currency,
                          String opportunities, String chargeForCredit) {
        super(material, bank, value);
        this.currency = currency;
        this.opportunities = opportunities;
        this.chargeForCredit = chargeForCredit;
    }

    public void Currency () {
        System.out.println("Выбрав Лухури карту, вы можете выбирать валюту: " + currency);
    }

    public void Opportunities () {
        System.out.println("Выбрав Лухури карту, вы можете подключить дополнительные возможности: " + opportunities );
    }

    public void СhargeForCredit () {
        System.out.println("Выбрав Лухури карту, вы можете оплачивать кредиты: " + chargeForCredit);
    }

    @Override
    public void ToWithdrawMoney() {
        super.ToWithdrawMoney();
    }

    @Override
    public void PutTheMoney() {
        super.PutTheMoney();
    }

    @Override
    public void Payment() {
        super.Payment();
    }
}
