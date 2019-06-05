package factory.test;

import factory.factorymethod.Factory;
import factory.factorymethod.HuaweiPhoneFactory;
import factory.factorymethod.XiaomiPhoneFactory;
import factory.product.phone.Phone;

/**.
 * 测试工厂方法
 * @author qiudao
 */
public class TestFactoryMethod {
    public static void main(String[] args) {
        System.out.println("工厂方法测试.......");
        Factory xiaomiPhoneFactory  = new XiaomiPhoneFactory();
        Phone xiaomiPhoe = xiaomiPhoneFactory.getPhone();
        xiaomiPhoe.printBrand();
        HuaweiPhoneFactory huaweiPhoneFactory = new HuaweiPhoneFactory();
        Phone huaweiPhone = huaweiPhoneFactory.getPhone();
        huaweiPhone.printBrand();
    }
}
