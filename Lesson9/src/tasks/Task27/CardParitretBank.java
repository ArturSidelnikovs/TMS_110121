package tasks.Task27;

/*
Задание 27
Создать иерархию классов, описывающих банковские карточки.
Иерархия должна иметь хотя бы три уровня.
 */

public class CardParitretBank extends BankCards  {


    CardParitretBank(String material, String bank, String value) {
        super(material, bank, value);
    }


    @Override
    public void PutTheMoney() {
        super.PutTheMoney();
    }

    @Override
    public void Payment() {
        super.Payment();
    }

    @Override
    public void ToWithdrawMoney() {
        super.ToWithdrawMoney();
    }
}

