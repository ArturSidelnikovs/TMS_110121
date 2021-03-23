package Task2;

/*
2) Написать клиент для работы обменника.
Люди могут подходить к обменнику чтобы купить/продать доллары или ЕВРО.
Количество долларов и ЕВРО в обменнике не должно превышать какого-то заранее
заданного предела и не должно оказаться меньше нуля.
Каждый человек так же не может купить или продать долларов или ЕВРО больше,
чем какое-то определенное значение. В нашей программе, имитирующей торговый центр,
работает несколько обменников. Одновременно в одном обменнике может находится только один человек.
Человек может как покупать или продавать валюту так и делать обе эти операции одновременно
(покупать доллары и продавать ЕВРО).

Задачи следует решать с применением потоков.
 */

import java.util.Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Human {

    private Converter converter;
    private int sumOfOperationInCurrency;
    private int secondOperationInCurrency;
    private List<String> operations;
    private List<String> currency;
    private int amountOfOperations;
    private Random random = new Random();


    {
        operations = new ArrayList<>();
        operations.add("Sell");
        operations.add("Buy");
        operations.add("Both");

        currency = new ArrayList<>();
        currency.add("USD");
        currency.add("EUR");
    }

    public Converter getExchangeOffice() {
        return converter;
    }

    public void setExchangeOffice(Converter exchangeOffice) {
        this.converter = exchangeOffice;
    }

    public int getSumOfOperationInCurrency() {
        return sumOfOperationInCurrency;
    }

    public void setSumOfOperationInCurrency(int sumOfOperationInCurrency) {
        this.sumOfOperationInCurrency = sumOfOperationInCurrency;
    }

    public List<String> getOperations() {
        return operations;
    }

    public void setOperations(List<String> operations) {
        this.operations = operations;
    }

    public List<String> getCurrency() {
        return currency;
    }

    public void setCurrency(List<String> currency) {
        this.currency = currency;
    }

    public int getSecondOperationInCurrency() {
        return secondOperationInCurrency;
    }

    public void setSecondOperationInCurrency(int secondOperationInCurrency) {
        this.secondOperationInCurrency = secondOperationInCurrency;
    }

    public int getAmountOfOperations() {
        return amountOfOperations;
    }

    public void setAmountOfOperations(int amountOfOperations) {
        this.amountOfOperations = amountOfOperations;
    }

    public Human(Converter converter) {
        this.converter = converter;
        this.amountOfOperations = random.nextInt(2);
        this.sumOfOperationInCurrency = random.nextInt(2000) + 100;
        if (amountOfOperations == 1) {
            this.secondOperationInCurrency = random.nextInt(2000) + 100;
        }
    }

    // Продает валюту банку

    private void sellCurrency() {
        String currency = this.currency.get(random.nextInt(2));
        int amountOfMoneyAfterSelling = 0;
        if (currency.equalsIgnoreCase("USD") && !converter.isTooMuchUSD()) {
            if (sumOfOperationInCurrency + converter.getAmountOfUSD() > 20_000) {
                System.out.println("The bank can't take so much money");

            } else {
                amountOfMoneyAfterSelling = (int) (sumOfOperationInCurrency * Converter.CURRENT_EXCHANGE_RATE_OF_USD);
                converter.setAmountOfBLR(converter.getAmountOfBLR() - amountOfMoneyAfterSelling);
                converter.setAmountOfUSD(converter.getAmountOfUSD() + sumOfOperationInCurrency);
                System.out.printf("Solo operation:  Sold %d %s to the %s, and get %d rubles.%s", sumOfOperationInCurrency, currency,
                        Thread.currentThread().getName(), amountOfMoneyAfterSelling, "\n");
            }

        } else if (currency.equalsIgnoreCase("EUR") && !converter.isTooMuchEUR()) {
            if (sumOfOperationInCurrency + converter.getAmountOfEUR() > 20_000) {
                System.out.println("The bank can't take so much money");

            } else {
                amountOfMoneyAfterSelling = (int) (sumOfOperationInCurrency * Converter.CURRENT_EXCHANGE_RATE_OF_EUR);
                converter.setAmountOfBLR(converter.getAmountOfBLR() - amountOfMoneyAfterSelling);
                converter.setAmountOfEUR(converter.getAmountOfEUR() + sumOfOperationInCurrency);
                System.out.printf("Solo operation:  Sold %d %s to the %s, and get %d rubles%s", sumOfOperationInCurrency, currency,
                        Thread.currentThread().getName(), amountOfMoneyAfterSelling, "\n");
            }
        }
    }

    // Покупает валюту у банка.

    private void buyCurrency() {
        String currency = this.currency.get(random.nextInt(2));
        int amountOfMoneyAfterBuying = 0;
        if (currency.equalsIgnoreCase("USD")) {
            if (sumOfOperationInCurrency > converter.getAmountOfUSD()) {
                System.out.println("The bank doesn't have enough money to make an operation.");
            } else {
                amountOfMoneyAfterBuying = (int) (sumOfOperationInCurrency * Converter.CURRENT_EXCHANGE_RATE_OF_USD);
                converter.setAmountOfBLR(converter.getAmountOfBLR() + amountOfMoneyAfterBuying);
                converter.setAmountOfUSD(converter.getAmountOfUSD() - sumOfOperationInCurrency);
                System.out.printf("Solo operation:  Bought %d %s from the %s, and spent on it %d rubles.%s", sumOfOperationInCurrency, currency,
                        Thread.currentThread().getName(), amountOfMoneyAfterBuying, "\n");
            }

        } else if (currency.equalsIgnoreCase("EUR")) {
            if (sumOfOperationInCurrency > converter.getAmountOfEUR()) {
                System.out.println("The bank doesn't have enough money to make an operation.");

            } else {
                amountOfMoneyAfterBuying = (int) (sumOfOperationInCurrency * Converter.CURRENT_EXCHANGE_RATE_OF_EUR);
                converter.setAmountOfBLR(converter.getAmountOfBLR() + amountOfMoneyAfterBuying);
                converter.setAmountOfEUR(converter.getAmountOfEUR() - sumOfOperationInCurrency);
                System.out.printf("Solo operation:  Bought %d %s from the %s, and spent on it %d rubles.%s", sumOfOperationInCurrency, currency,
                        Thread.currentThread().getName(), amountOfMoneyAfterBuying, "\n");
            }
        }
    }

    // Если обе операции.

    private void BothOperation() {
        String cellCurrency = this.currency.get(random.nextInt(2));
        int amountOfMoneyAfterSelling = 0;
        int amountOfMoneyAfterBuying = 0;
        if (cellCurrency.equalsIgnoreCase("USD")) {
            if (sumOfOperationInCurrency + converter.getAmountOfUSD() > 20_000) {
                System.out.println("The bank can't take so much money");

            } else {
                amountOfMoneyAfterSelling = (int) (sumOfOperationInCurrency * Converter.CURRENT_EXCHANGE_RATE_OF_USD);
                converter.setAmountOfBLR(converter.getAmountOfBLR() - amountOfMoneyAfterSelling);
                converter.setAmountOfUSD(converter.getAmountOfUSD() + sumOfOperationInCurrency);
            }

            if (secondOperationInCurrency > converter.getAmountOfEUR()) {
                System.out.println("The bank doesn't have enough money to make an operation.");

            } else {
                amountOfMoneyAfterBuying = (int) (secondOperationInCurrency * Converter.CURRENT_EXCHANGE_RATE_OF_EUR);
                converter.setAmountOfBLR(converter.getAmountOfBLR() + amountOfMoneyAfterBuying);
                converter.setAmountOfEUR(converter.getAmountOfEUR() - secondOperationInCurrency);
            }

            System.out.printf("Both operations:  Sold %d %s to the %s, and get %d rubles.%s" +
                            "Bought %d EUR from the %s, and spent on it %d rubles.%s", sumOfOperationInCurrency, cellCurrency,
                    Thread.currentThread().getName(), amountOfMoneyAfterSelling, "\n", secondOperationInCurrency,
                    Thread.currentThread().getName(), amountOfMoneyAfterBuying, "\n");


        } else if (cellCurrency.equalsIgnoreCase("EUR")) {
            if (sumOfOperationInCurrency + converter.getAmountOfEUR() > 20_000) {
                System.out.println("The bank can't take so much money");

            } else {
                amountOfMoneyAfterSelling = (int) (sumOfOperationInCurrency * Converter.CURRENT_EXCHANGE_RATE_OF_EUR);
                converter.setAmountOfBLR(converter.getAmountOfBLR() - amountOfMoneyAfterSelling);
                converter.setAmountOfEUR(converter.getAmountOfEUR() + sumOfOperationInCurrency);
            }
            if (secondOperationInCurrency > converter.getAmountOfUSD()) {
                System.out.println("The bank doesn't have enough money to make an operation.");

            } else {
                amountOfMoneyAfterBuying = (int) (secondOperationInCurrency * Converter.CURRENT_EXCHANGE_RATE_OF_USD);
                converter.setAmountOfBLR(converter.getAmountOfBLR() + amountOfMoneyAfterBuying);
                converter.setAmountOfUSD(converter.getAmountOfUSD() - secondOperationInCurrency);
            }
            System.out.printf("Both operations:  Sold %d %s to the %s, and get %d rubles%s" +
                            "Bought %d USD from the %s, and spent on it %d rubles.%s", sumOfOperationInCurrency, cellCurrency,
                    Thread.currentThread().getName(), amountOfMoneyAfterSelling, "\n", secondOperationInCurrency,
                    Thread.currentThread().getName(), amountOfMoneyAfterBuying, "\n");
        }
    }

    // Выполнение операции.

    public void operation() {
        if (converter.getAmountOfUSD() <= 0 && converter.getAmountOfEUR() <= 0 &&
                converter.getAmountOfEUR() > 20_000 && converter.getAmountOfUSD() > 20_000) {
            Thread.currentThread().interrupt();
        }
        String operation = operations.get(random.nextInt(2));
        switch (amountOfOperations) {
            case 0:
                if (operation.equalsIgnoreCase("Sell")) {

                    sellCurrency();

                } else if (operation.equalsIgnoreCase("Buy")) {

                    buyCurrency();
                }
                break;
            case 1:
                BothOperation();
                break;
        }
    }

}