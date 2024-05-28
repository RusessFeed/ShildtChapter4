public class Vehicle {
    int passengers;
    int fuelCap;
    int mpg;

    Vehicle(int passengers, int fuelCap, int mpg) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
    }


    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }

    int getRange() {
        return fuelCap * mpg;
    }
}

class VehicleDemo {
   /* public static void main(String[] args) {
        Vehicle minvan = new Vehicle();
        int range;

        minvan.passengers = 7;
        minvan.fuelCap = 16;
        minvan.mpg = 21;

        range = minvan.fuelCap * minvan.mpg;
        System.out.println("Минивэн может перевезти " + minvan.passengers + " пассажиров на расстояние " + range + " миль" );

    }
    */
}

class TwoVehicles {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportsCar = new Vehicle(2, 14, 12);

        int range1, range2;
        
        range1 = minivan.fuelCap * minivan.mpg;
        range2 = sportsCar.fuelCap * sportsCar.mpg;

        System.out.println("Метод fuelNeeded выведет " + minivan.fuelNeeded(100));

        ferrari();

        System.out.println("Минивэн может перевезти " + minivan.passengers + " пассажиров на расстояние " + range1 + " миль" );
        System.out.println("Спорткар может перевезти " + sportsCar.passengers + " пассажиров на расстояние " + range2 + " миль" );

        if (minivan.getRange() > sportsCar.getRange()) {
            System.out.println("у минивэна рэнж больше в общем");
        } else {
            System.out.println("у спорткара больше");
        }
    }
    static void ferrari() {
        int i;
        for (i = 0; i < 10; i++) {
            if (i == 5) return;
            System.out.println(i);
        }
    }
}
