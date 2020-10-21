package carFactory;
//Sub class
public class Car2 extends Factory {

    @Override
    public void car() {
        super.car();
        System.out.println(CarBrand.ALFAROMEO);
    }
}
