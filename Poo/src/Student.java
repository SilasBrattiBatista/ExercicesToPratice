public class Student {
    private String name;
    private double gradeOne;
    private double gradeTwo;
    private double gradeThree;

    public Student(String name, int age) {}

    public String getName() {
        return name;
    }

    public double getGradeOne() {
        return gradeOne;
    }

    public double getGradeTwo() {
        return gradeTwo;
    }

    public double getGradeThree() {
        return gradeThree;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGradeOne(double gradeOne) {
        this.gradeOne = gradeOne;
    }

    public void setGradeTwo(double gradeTwo) {
        this.gradeTwo = gradeTwo;
    }

    public void setGradeThree(double gradeThree) {
        this.gradeThree = gradeThree;
    }

    public double media() {
        double media = ((gradeOne + gradeTwo + gradeThree) / 3);
        return media;
    }
}