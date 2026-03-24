package calculus.geometric;

public class RectangularRoomCalculator implements GeometricCalculus{
    public double calculateArea(double b, double h){
        double area = b * h;
        return area;
    }

    public double calculatePerimeter(double b, double h){
        double perimeter = 2 * (b + h);
        return perimeter;
    }
}
