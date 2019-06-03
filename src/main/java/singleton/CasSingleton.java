package singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * CAS实现单例模式
 *
 * @author qiudao
 */
class CasSingleton {

    //利用AtomicReference
    private static final AtomicReference<CasSingleton> INSTANCE = new AtomicReference<>();

    //私有化构造器
    private CasSingleton() {
    }

    /**
     * 用CAS确保线程安全
     */
    public static CasSingleton getInstance() {
        // 自旋获取
        while (true) {
            CasSingleton current = INSTANCE.get();
            // 已初始化则直接返回
            if (current != null) {
                return current;
            }
            current = new CasSingleton();
            // 使用cas操作设值
            if (INSTANCE.compareAndSet(null, current)) {
                return current;
            }
        }
    }
}