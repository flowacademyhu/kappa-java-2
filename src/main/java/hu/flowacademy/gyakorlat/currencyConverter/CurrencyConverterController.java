package hu.flowacademy.gyakorlat.currencyConverter;

public class CurrencyConverterController {
    private final ICurrencyConverterService currencyConverterService;

    public CurrencyConverterController(ICurrencyConverterService currencyConverterService) {
        this.currencyConverterService = currencyConverterService;
    }

    public double convertCurrency(Currency from, Currency to, double amount) {
        // input validálás
        return currencyConverterService.convert(from, to, amount);
    }
}
