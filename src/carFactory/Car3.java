package carFactory;
//Sub class
public class Car3 extends Factory {

    @Override
    public void car() {
        super.car();
        System.out.println(CarBrand.TOYOTA);
    }
}
