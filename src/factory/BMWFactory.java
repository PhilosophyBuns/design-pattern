package factory;

/**
 * 宝马工厂，覆盖所有宝马车型的构造方法
 */
public class BMWFactory {
    public BMWCar getBMWCar(Class<? extends BMWCar> type) throws  IllegalAccessException, InstantiationException {
        return type.newInstance();
    }

}
