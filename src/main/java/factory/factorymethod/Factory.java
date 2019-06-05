package factory.factorymethod;

import factory.product.phone.Phone;

/**
 * 工厂接口
 * @author qiudao
 */
public interface Factory {
    // 拿到手机
    Phone getPhone();
}
