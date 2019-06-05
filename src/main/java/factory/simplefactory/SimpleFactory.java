package factory.simplefactory;

import factory.product.phone.HuaweiPhone;
import factory.product.phone.Phone;
import factory.product.phone.XiaomiPhone;

/**
 * 简单工厂
 *
 * @author qiudao
 */
public class SimpleFactory  {
    // 小米的名
    public final static String XIAOMI_NAME = "xiaomi";
    //华为的名字
    public final static String HUAWEI_NAME = "huawei";
    /**获得手机**/
    public  Phone getPhone(String name) {
        Phone phone;
        // 静态编码校验
        if (XIAOMI_NAME.equals(name)) {
            phone = new XiaomiPhone();
        } else if (HUAWEI_NAME.equals(name)) {
            phone = new HuaweiPhone();
        } else {
            throw new NullPointerException("无对应手机");
        }
        return phone;
    }
}
