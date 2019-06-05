package factory.factorymethod;

import factory.product.phone.HuaweiPhone;
import factory.product.phone.Phone;

/**
 * 工厂方法的具体工厂
 * @author qiudao
 */
public class HuaweiPhoneFactory implements Factory{
    @Override
    public Phone getPhone() {
        return new HuaweiPhone();
    }
}
