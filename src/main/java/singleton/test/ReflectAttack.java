package singleton.test;

import singleton.Eager;
import singleton.EnumSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射破坏单例对象
 *
 * @author qiudao
 */
public class ReflectAttack {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        test2();
    }

    /**
     * 测试反射破坏普通单例
     */
    public static void test1() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        //通过反射获取单例类私有构造器
        Constructor constructor = Eager.class.getDeclaredConstructors()[0];
        // 开放构造器权限
        constructor.setAccessible(true);
        // 通过构造器新建一个对象
        Eager instance1 = (Eager) constructor.newInstance();
        Eager instance2 = Eager.getInstance();
        Eager instance3 = Eager.getInstance();
        // 反射创建的对象与getInstance方法获取的对象比较
        System.out.println("instance1 == instance2：" + (instance1 == instance2));
        // 比较getInstance方法返回的对象是否是同一个
        System.out.println("instance2 == instance3：" + (instance3 == instance2));
    }

    /**
     * 测试反射破坏枚举单例
     */
    public static void test2() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        //通过反射获取单例类私有构造器
        Constructor constructor = EnumSingleton.class.getDeclaredConstructors()[0];
        // 开放构造器权限
        constructor.setAccessible(true);
        // 通过构造器新建一个对象
        EnumSingleton instance1 = (EnumSingleton) constructor.newInstance();
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        EnumSingleton instance3 = EnumSingleton.INSTANCE;
        // 反射创建的对象与getInstance方法获取的对象比较
        System.out.println("instance1 == instance2：" + (instance1 == instance2));
        // 比较getInstance方法返回的对象是否是同一个
        System.out.println("instance2 == instance3：" + (instance3 == instance2));
    }
}
