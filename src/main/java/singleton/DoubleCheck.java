package singleton;

import java.io.Serializable;

/**
 * 双检锁实现懒汉单例
 * @author qiudao
 */
public class DoubleCheck implements Serializable {
    private static final long serialVersionUID = 41545L;
    //私有化构造器
    private DoubleCheck() {
        if (instance != null) {
            throw new IllegalArgumentException("无法通过反射创建单例");
        }
    }

    private static DoubleCheck instance;

    public static DoubleCheck getInstance() {
        //第一重检查，检查是否已经初始化
        if (instance == null) {
            // 加锁，保证线程安全问题
            synchronized (DoubleCheck.class) {
                // 二重检查，防止该实例被二次初始化
                if (instance == null) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
