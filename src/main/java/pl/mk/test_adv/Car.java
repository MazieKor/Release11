package pl.mk.test_adv;

public class Car {

    ////DO NOT MODIFY ANYTHING BELOW THIS LINE

    int maxSpeed;
    int acceleration;

    public Car(int maxSpeed, int acceleration) {
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
    }

    @Override
    public String toString() {
        return "Car with maxSpeed=" + maxSpeed + " and acceleration=" + acceleration;
    }

    public static Car getMax(Car[] cars) {
        if (cars == null || cars.length == 0)
            throw new IllegalStateException("Bad array size");

        int maxSpeed = cars[0].maxSpeed;
        int maxAcceler = cars[0].acceleration;
        int maxCarIndex = 0;

        for (int i = 1; i < cars.length; i++) {
            if (cars[i].maxSpeed > maxSpeed) {
                maxSpeed = cars[i].maxSpeed;
                maxCarIndex = i;
            } else if (cars[i].maxSpeed == maxSpeed) {
                if (cars[i].acceleration > maxAcceler) {
                    maxAcceler = cars[i].acceleration;
                    maxCarIndex = i;
                }
            }
        }
        return cars[maxCarIndex];
    }

}
