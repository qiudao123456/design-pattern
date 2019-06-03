package singleton;

import java.io.Serializable;

/**
 * 饿汉型单例模式
 *
 * @author qiudao
 * @date 2019/6/3
 */
public class Eager implements Serializable {
    private static final long serialVersionUID = 4545L;

    //私有化构造器
    private Eager() {
        if (instance != null) {
            throw new IllegalArgumentException("无法通过反射创建单例");
        }
    }

    // 启动时直接初始化
    private static Eager instance = new Eager();

    // 获取实例接口
    public static Eager getInstance() {
        return instance;
    }

    public Object readResolve(){
        return instance;
    }
}
