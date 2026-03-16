/*
Create a Car class with methods to represent a specific model over three years. Implement methods to set the model name,
average prices for each year, and calculate and display the lowest and highest prices. Add a subclass CarModel to
create specific instances, using it in the main class to set prices and display information.*
*/


public class Main {
    public static void main(String[] args) {
        ModelCar unoMille = new ModelCar();
        unoMille.setModelName("Uno Mille");
        unoMille.setYear2022(true);
        unoMille.setMediumPrice();

        unoMille.showInfos();

    }
}
