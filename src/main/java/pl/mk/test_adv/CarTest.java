package pl.mk.test_adv;

public class CarTest {

    public static void main(String[] args) {
        Car[] carArray = new Car[4];
        carArray[0] = new Car(120, 5);
        carArray[1] = new Car(130, 7);
        carArray[2] = new Car(170, 2);
        carArray[3] = new Car(170, 7);

        System.out.printf("RESULT - the fastest car is: %n%s", Car.getMax(carArray));       //implicit toString()

    }


}
