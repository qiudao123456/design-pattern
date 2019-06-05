package factory.product.phone;

/**
 * 华为手机
 * @author qiudao
 */
public class HuaweiPhone implements Phone{
    @Override
    public void printBrand() {
        System.out.println("华为牌手机！");
    }
}
