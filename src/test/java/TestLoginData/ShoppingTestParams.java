package TestLoginData;

import org.testng.annotations.DataProvider;

/**
 * Created by liuzhe on 2019/3/23.
 */

/**
 * Created by liuzhe on 2019/3/23.
 * 提供用户获取价格方法的数据
 * 商品ID
 * 商品预期价格
 */
public class ShoppingTestParams {
    @DataProvider
    public Object[][] getPrice() {
        return new Object[][]{
                {1, 200},
                {2, 120},
                {3, 80},
                {0, -1},//商品ID不存在
                {5,-1}//商品ID不存在

        };
    }

    @DataProvider
//    商品ID
//    商品欲购买数量
//    商品实际可购买的数量-库存
//
    public static Object[][] getBuys() {
        return new Object[][]{
                {1, 0,-1},
                {2, 10,1},
                {3, 1,1},
                {3, -1,-1},
                {0, 1,-3},
                {4, 1,-3},
                {3, 1000000,1},
//                {3, 1000000.00,1},
//                {3, "十",1}
        };
    }
}
