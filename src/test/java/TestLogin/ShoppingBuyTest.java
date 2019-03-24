package TestLogin;

import DemoXunit.Login;
import DemoXunit.Products;
import DemoXunit.Shopping;
import TestLoginData.ShoppingTestParams;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by liuzhe on 2019/3/23.
 */
public class ShoppingBuyTest {
    Login login = new Login();

    Shopping shopping = new Shopping();

//    @BeforeMethod
//    public void beforeMethod() {
//        System.out.printf("我是beforemethod\n");
//        login.userLogin("zhangsan", "123456");
//
//    }
//      buys  商品实际数量
//      buys-count 库存
//      count 欲购买数量
    @Test(dataProvider = "getBuys", dataProviderClass = ShoppingTestParams.class)
    public void getPrice(int proId, int count, int expect) {

        Products pro = Products.getPro(proId);
        //如果测试中，导致商品库存减少，如果预期结果需要购买成功，则强制设置该商品库存充足
        if(expect == 1 && pro.getCount() < count){
            pro.setCount(count);
        }
        int buys = shopping.buys(proId, count);
        Assert.assertEquals(buys, expect);

    }

//    @AfterClass
//    public void afterClass() {
//        System.out.printf("我是afterclass");
//        login.userLogin("", "");
//    }
}
