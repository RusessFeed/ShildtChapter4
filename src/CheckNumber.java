public class CheckNumber {
    boolean isEvan(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFactor(int a, int b) {
        if (a % b == 0) return true;
        else return false;
    }
}

class CheckNumDemo {
    public static void main(String[] args) {
        CheckNumber validator = new CheckNumber();
        for (int i = 0; i < 10; i++) {
            if (validator.isEvan(i)) {
                System.out.println(i + " Число чётное");
            } else {
                System.out.println(i + " Число нечётное");
            }
        }
        boolean factor = validator.isFactor(10, 5);
        System.out.println(factor);
    }
}