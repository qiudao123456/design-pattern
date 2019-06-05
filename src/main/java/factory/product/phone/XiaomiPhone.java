package factory.product.phone;

/**
 * 小米手机
 * @author qiudao
 */
public class XiaomiPhone implements Phone{
    @Override
    public void printBrand() {
        System.out.println("小米牌手机！");
    }
}
