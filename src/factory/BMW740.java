package factory;

/**
 * 具体产品BMW740
 */
public class BMW740 extends BMWCar {
    @Override
    public void drive() {
        System.out.println("BMW740，高端商务。");
    }
}
