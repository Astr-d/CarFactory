package carFactory;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(CarBrand.CADILLAC);
        Car car1 = new Car(CarBrand.ALFAROMEO);
        Car car2 = new Car(CarBrand.TOYOTA);

        //Skriver ut
        car.car();
        car1.car();
        car2.car();
    }
}
