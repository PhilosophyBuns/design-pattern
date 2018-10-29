package abstract$factory.demo1;

public abstract class AbstractFactory {
    abstract Car getCar(Class<? extends Car> clazz) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException;
}