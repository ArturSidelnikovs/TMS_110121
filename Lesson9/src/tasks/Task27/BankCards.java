package tasks.Task27;

/*
Задание 27
Создать иерархию классов, описывающих банковские карточки.
Иерархия должна иметь хотя бы три уровня.
 */

public class BankCards implements The_Сapacity_Of_The_Card {

    public String material;
    public String bank;
    public String value;

    BankCards (String material, String bank, String value) {
        this.material = material;
        this.bank = bank;
        this.value = value;
    }

    @Override
    public void ToWithdrawMoney () {
        System.out.println("С помощью карты данного банка вы можете класть деньги на карту до 5000 рублей");
    }

    @Override
    public void PutTheMoney() {
        System.out.println("С помощью карт данного банка вы можете снимать деньги с карты до 10000 рублей");
    }

    @Override
    public void Payment() {
        System.out.println("С помощью карт данного банка вы можете оплачивать любые покупки");
    }
}





