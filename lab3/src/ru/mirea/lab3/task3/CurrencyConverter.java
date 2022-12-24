package ru.mirea.lab3.task3;

public class CurrencyConverter {

    private String original;
    private String target;

    private Currency[] currencies;

    public CurrencyConverter() {
        currencies = new Currency[3];
        currencies[0] = new Currency("RUB", 1);
        currencies[1] = new Currency("USD", 0.016);
        currencies[2] = new Currency("EUR", 0.0152);
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public double convert (double original){
        double originalEx = 0;
        double targetEx = 0;
        for (Currency currency : currencies) {
            if (currency.getName().equals(this.original)) {
                originalEx = currency.getExchangeRate();
            }
            if (currency.getName().equals(this.target)) {
                targetEx = currency.getExchangeRate();
            }
        }
        return original * targetEx / originalEx;
    }
}
class Currency {
    private final String name;
    private final double exchangeRate;

    public Currency(String name, double exchangeRate) {
        this.name = name;
        this.exchangeRate = exchangeRate;
    }

    public String getName() {
        return name;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }
}
