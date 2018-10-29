package abstract$factory.demo1;

/**
 * 超级工厂类，建造工厂的工厂
 */
public class FactoryProducer
{
    public static AbstractFactory getFactory(Class<? extends AbstractFactory> clazz)
            throws IllegalAccessException, InstantiationException, ClassNotFoundException
    {
        return clazz.newInstance();
    }
}
