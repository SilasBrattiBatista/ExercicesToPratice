package calculabe;

public class Book implements Calculable{
    public double calculateFinalPrice(double price, double disccount) {
        return (price * (disccount/100));
    }
}
