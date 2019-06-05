package factory.AbstractFctory;

import factory.product.phone.Phone;
import factory.product.phonecases.PhoneCases;

/**
 * 抽象工厂
 * @author qiudao
 */
public interface AbstractFactory {
    // 获取手机
    Phone getPhone();
    // 获取手机套
    PhoneCases getPhoneCases();
}
