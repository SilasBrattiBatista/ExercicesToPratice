package currency.converter;

public class CurrencyConverter implements FinancialConversion {
    @Override
    public double convertDolartoReal(double dolar) {
        return (dolar / 5.27);
    }
}
