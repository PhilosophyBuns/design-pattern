package factory;

/**
 * 验证
 */
public class Demo {
    public static void main(String[] args) {
        try {
            BMWFactory bmwFactory = new BMWFactory();
            BMWCar bmwCar1 = bmwFactory.getBMWCar(BMW320.class);
            bmwCar1.drive();
            BMWCar bmwCar2 = bmwFactory.getBMWCar(BMW530.class);
            bmwCar2.drive();
            BMWCar bmwCar3 = bmwFactory.getBMWCar(BMW740.class);
            bmwCar3.drive();
        } catch ( InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
