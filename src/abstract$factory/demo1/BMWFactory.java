package abstract$factory.demo1;

/**
 * 宝马工厂，覆盖所有宝马车型的构造方法
 */
public class BMWFactory extends AbstractFactory
{
    @Override
    public Car getCar(Class<? extends Car> clazz) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException
    {
        return clazz.newInstance();
    }
}
