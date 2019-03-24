package TestLogin;

import DemoXunit.Login;
import DemoXunit.Shopping;
import TestLoginData.ShoppingTestParams;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by liuzhe on 2019/3/23.
 */
public class ShoppingsTest {


//   @BeforeClass
//           public void beforeClass(){
//       System.out.printf("我是beforeclass");
//       login.userLogin("zhangsan","123456");
//   }

    Login login = new Login();
    Shopping  shopping = new Shopping();

//    @BeforeMethod
    public void beforeMethod(){
        System.out.printf("我是beforemethod\n");
        login.userLogin("zhangsan","123456");

    }



    @Test(dataProvider = "getPrice",dataProviderClass = ShoppingTestParams.class )
    public void getPrice(int procId,int expect) {
        int price = shopping.getPrice(procId);
        System.out.printf(String.valueOf(price));
        Assert.assertEquals(price,expect);

    }

//    @AfterMethod
//    public void afterMethod(){
//        System.out.printf("我是aftermethod\n");
//        login.userLogin("","");
//
//    }

//   @AfterClass
//    public void afterClass(){
//        System.out.printf("我是afterclass");
//        login.userLogin("","");
//    }
}
