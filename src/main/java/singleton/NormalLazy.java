package singleton;

import java.io.Serializable;

/**
 * 普通懒汉型
 * @author qiudao
 */
public class NormalLazy implements Serializable {
    private static final long serialVersionUID = 45475L;
    //私有化构造器
    private  NormalLazy() {
    }

    //定义实例
    private static NormalLazy instance;

    // 直接加锁，保证线程安全
    public static synchronized NormalLazy getInstance() {
        if (instance == null) {
            instance = new NormalLazy();
        }
        return instance;
    }
}
