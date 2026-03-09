public class AgePerson {
    private String name;
    private int age;

    public AgePerson(String name, int age) {}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void verifyAge() {
        if (this.age < 18) {
            System.out.println("You are of legal age");
        } else  {
            System.out.println("You aren't legal age");
        }
    }


}
