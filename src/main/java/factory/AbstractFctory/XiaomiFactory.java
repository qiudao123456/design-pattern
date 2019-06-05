package factory.AbstractFctory;

import factory.product.phone.Phone;
import factory.product.phone.XiaomiPhone;
import factory.product.phonecases.PhoneCases;
import factory.product.phonecases.XiaomiPhoneCases;

/**
 * 小米工厂
 * @author qiudao
 */
public class XiaomiFactory implements  AbstractFactory {
    @Override
    public Phone getPhone() {
        return new XiaomiPhone();
    }

    @Override
    public PhoneCases getPhoneCases() {
        return new XiaomiPhoneCases();
    }

    public void  assemblePhone(){
        System.out.println("开始组装");
        this.getPhone().printBrand();
        this.getPhoneCases().printCasesName();
        System.out.println("组装完成");
    }
}
