public class Person {
    int age;
    String name;
    boolean isPatriot;

    Person() {
        age = 18;
        name = "Zelim";
        isPatriot = true;
    }

    Person(int age, String name, boolean isPatriot) {
        this.age = age;
        this.name = name;
        this.isPatriot = isPatriot;
    }
}

class PersonDemo {
    public static void main(String[] args) {
        Person zelim = new Person();

        System.out.println(zelim.age);
        System.out.println(zelim.name);
        System.out.println(zelim.isPatriot);

        System.out.println();

        Person superZelim = new Person(19, "Super Zelim", true);
        System.out.println(superZelim.age);
        System.out.println(superZelim.name);
        System.out.println(superZelim.isPatriot);
    }
}
