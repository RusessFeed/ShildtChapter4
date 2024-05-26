public class Vehicle {
    int passengers;
    int fuelCap;
    int mpg;

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
        Vehicle minivan = new Vehicle();
        Vehicle sportsCar = new Vehicle();

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelCap = 16;
        minivan.mpg = 21;

        sportsCar.passengers = 2;
        sportsCar.fuelCap = 14;
        sportsCar.mpg = 12;

        range1 = minivan.fuelCap * minivan.mpg;
        range2 = sportsCar.fuelCap * sportsCar.mpg;

        System.out.println("Минивэн может перевезти " + minivan.passengers + " пассажиров на расстояние " + range1 + " миль" );
        System.out.println("Спорткар может перевезти " + sportsCar.passengers + " пассажиров на расстояние " + range2 + " миль" );


    }
}
