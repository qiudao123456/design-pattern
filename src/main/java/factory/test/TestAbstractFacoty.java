package factory.test;

import factory.AbstractFctory.AbstractFactory;
import factory.AbstractFctory.HuaweiFactory;
import factory.AbstractFctory.XiaomiFactory;
import factory.product.phone.Phone;
import factory.product.phonecases.PhoneCases;

/**
 * 测试抽象工厂
 * @author qiudao
 */
public class TestAbstractFacoty {
    public static void main(String[] args) {
        System.out.println("抽象工厂测试");
        AbstractFactory xiaomiFactory = new XiaomiFactory();
        Phone xiaomiPhone = xiaomiFactory.getPhone();
        PhoneCases xiaomiPhoneCases = xiaomiFactory.getPhoneCases();
        xiaomiPhone.printBrand();
        xiaomiPhoneCases.printCasesName();
        AbstractFactory huaweiiFactory = new HuaweiFactory();
        Phone huaweiPhone = huaweiiFactory.getPhone();
        PhoneCases huaweiPhoneCases = huaweiiFactory.getPhoneCases();
        huaweiPhone.printBrand();
        huaweiPhoneCases.printCasesName();
    }
}
