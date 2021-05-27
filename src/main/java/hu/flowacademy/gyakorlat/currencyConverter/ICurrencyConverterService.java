package hu.flowacademy.gyakorlat.currencyConverter;

public interface ICurrencyConverterService {
    double convert(Currency fromCurrency, Currency toCurrency, double amount);
}
