package abstract$factory.demo1;

/**
 * 验证
 */
public class Demo
{
    public static void main(String[] args) throws IllegalAccessException, 
        InstantiationException, ClassNotFoundException
    {
        AbstractFactory abstractFactory = FactoryProducer.getFactory(BMWFactory.class);
        Car bmwCar = abstractFactory.getCar(BMW320.class);
        bmwCar.drive();

        Car bmwCar1 = abstractFactory.getCar(BMW530.class);
        bmwCar1.drive();

        Car bmwCar2 = abstractFactory.getCar(BMW740.class);
        bmwCar2.drive();

        AbstractFactory abstractFactory1 = FactoryProducer.getFactory(BenzFactory.class);
        Car benzCar = abstractFactory1.getCar(BenzC200.class);
        benzCar.drive();

        Car benzCar1 = abstractFactory1.getCar(BenzE300.class);
        benzCar1.drive();
    }
}
