package calculabe;

public class PhysicalProduct implements Calculable{
    public double calculateFinalPrice(double price, double disccount) {
        return (price * (disccount/100));
    }
}
