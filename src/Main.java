//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle paz = new Vehicle(150, 15600, 258);

        int range = paz.getRange();

        System.out.println("Наш пазик может проехать " + range + " миль");

    }
}