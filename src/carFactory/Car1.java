package carFactory;
//Sub class
public class Car1 extends Factory {

    @Override
    public void car() {
        super.car();
        System.out.println(CarBrand.CADILLAC);
    }
}
