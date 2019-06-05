package factory.factorymethod;

import factory.product.phone.Phone;
import factory.product.phone.XiaomiPhone;

/**
 * 工厂方法的具体工厂
 * @author qiudao
 */
public class XiaomiPhoneFactory implements Factory{
    @Override
    public Phone getPhone() {
        return new XiaomiPhone();
    }
}
