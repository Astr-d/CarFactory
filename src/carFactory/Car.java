package carFactory;

public class Car extends Factory {

    CarBrand brand;

    public Car(CarBrand brand) {
        this.brand = brand;
    }

    @Override
    public void car() {
        System.out.println(brand);

    }
}