public class Car {
    private String modelName;
    private boolean year2022;
    private boolean year2023;
    private boolean year2024;
    private double mediumPrice;

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public boolean isYear2022() {
        return year2022;
    }

    public void setYear2022(boolean year2022) {
        this.year2022 = year2022;
    }

    public boolean isYear2023() {
        return this.year2023;
    }

    public void setYear2023(boolean year2023) {
        this.year2023 = year2023;
    }

    public boolean isYear2024() {
        return this.year2024;
    }

    public void setYear2024(boolean year2024) {
        this.year2024 = year2024;
    }

    public double getMediumPrice() {
        return this.mediumPrice;
    }

    public void setMediumPrice() {

        if (this.year2022) {
            this.mediumPrice = 32.000;
        } else if (this.year2023) {
            this.mediumPrice = 65.000;
        }  else if (this.year2024) {
            this.mediumPrice = 125.000;
        } else  {
            System.out.println("It's a invalid year Model");
        }
    }

    public void showInfos() {
        System.out.println("Model: " + this.modelName);
        System.out.println("Year 2022: " + this.year2022);
        System.out.println("Medium Price: " + this.mediumPrice );
    }
}
