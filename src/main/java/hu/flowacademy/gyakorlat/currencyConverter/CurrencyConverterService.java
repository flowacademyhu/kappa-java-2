package hu.flowacademy.gyakorlat.currencyConverter;

public class CurrencyConverterService implements ICurrencyConverterService {
    private static final double EUR_TO_HUF = 356.18;
    private static final double USD_TO_HUF = 294.03;
    private static final double USD_TO_EUR = 0.83;

    private static final double[][] CURRENCY_MATRIX = {
            //       EUR, HUF, USD
            /* EUR */{1, EUR_TO_HUF, 1 / USD_TO_EUR},
            /* HUF */{1 / EUR_TO_HUF, 1, 1 / USD_TO_HUF},
            /* USD */{USD_TO_EUR, USD_TO_HUF, 1},
    };

    public double convert(Currency fromCurrency, Currency toCurrency, double amount) {
        return amount * CURRENCY_MATRIX[fromCurrency.getIndex()][toCurrency.getIndex()];
    }
}
