//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle paz = new Vehicle();
        paz.fuelCap = 150;
        paz.passengers = 15600;
        paz.mpg = 258;

        int range = paz.getRange();

        System.out.println("Наш пазик может проехать " + range + " миль");

    }
}