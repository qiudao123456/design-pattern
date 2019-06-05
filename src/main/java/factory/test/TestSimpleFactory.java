package factory.test;

import factory.product.phone.Phone;
import factory.simplefactory.SimpleFactory;

/**
 * 测试简单工厂
 * @author qiudao
 */
public class TestSimpleFactory {
    public static void main(String[] args) {
        // 创建工厂
        SimpleFactory factory = new SimpleFactory();
        Phone huaweiPhone = factory.getPhone(SimpleFactory.HUAWEI_NAME);
        huaweiPhone.printBrand();
        Phone xiaomiPhone = factory.getPhone(SimpleFactory.XIAOMI_NAME);
        xiaomiPhone.printBrand();
    }
}
