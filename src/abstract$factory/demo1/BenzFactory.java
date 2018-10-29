package abstract$factory.demo1;

/**
 * 奔驰工厂，覆盖所有奔驰车型的构造方法
 */
public class BenzFactory extends AbstractFactory
{
    @Override
    public Car getCar(Class<? extends Car> clazz) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException
    {
        return clazz.newInstance();
    }
}
