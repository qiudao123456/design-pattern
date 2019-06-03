package singleton;

import java.io.Serializable;

/**
 * 静态内部类实现单例
 *
 * @author qiudao
 */
public class InnerClass implements Serializable {
    private static final long serialVersionUID = 45545L;
    // 私有化构造器
    private InnerClass() {
    }

    // 定义静态内类
    private static class Holder {
        // 利用类加载的锁机制来避免线程安全问题
        private static InnerClass INSTANCE = new InnerClass();
    }

    public static InnerClass getInstance() {
        return Holder.INSTANCE;
    }
}
