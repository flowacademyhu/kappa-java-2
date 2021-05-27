package hu.flowacademy.gyakorlat.currencyConverter;

public enum Currency {
    EUR(0),
    HUF(1),
    USD(2);

    private final int index;

    Currency(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
