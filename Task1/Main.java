package ASCII;

public class Main {

    public static void main(String[] args) {
        Person person2 = new Person("Robert", 2000);
        Person person3 = new Person("Michael", 2000);
        Person person4 = new Person("David", 2000);
        Person person5 = new Person("William", 2000);
        Person person1 = new Person("John", 2000);
        person1.output();
        person1.changeName("Greg");
        person1.output();
        person1.input("Finn", 1999);
        person1.output();
    }
}
