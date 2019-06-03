package singleton;

/**
 * 枚举实现单例
 *
 * @author qiudao
 */
public enum EnumSingleton {
    //实例对象
    INSTANCE;

    // 实例方法
    public void test() {
        System.out.println("方法");
    }
}
