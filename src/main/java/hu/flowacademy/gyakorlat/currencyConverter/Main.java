package hu.flowacademy.gyakorlat.currencyConverter;

public class Main {
    public static void main(String[] args) {
        CurrencyConverterService currencyConverterService = new CurrencyConverterService();
        CurrencyConverterController currencyConverterController = new CurrencyConverterController(currencyConverterService);

        double eurToHuf = currencyConverterController.convertCurrency(Currency.EUR, Currency.HUF, 9876);

        System.out.println(eurToHuf);
    }
}
