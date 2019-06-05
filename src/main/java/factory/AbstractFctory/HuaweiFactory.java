package factory.AbstractFctory;

import factory.product.phone.HuaweiPhone;
import factory.product.phone.Phone;
import factory.product.phonecases.HuaweiPhoneCases;
import factory.product.phonecases.PhoneCases;

/**
 * 华为工厂
 * @author qiudao
 */
public class HuaweiFactory implements AbstractFactory {
    @Override
    public Phone getPhone() {
        return new HuaweiPhone();
    }

    @Override
    public PhoneCases getPhoneCases() {
        return new HuaweiPhoneCases();
    }
}
