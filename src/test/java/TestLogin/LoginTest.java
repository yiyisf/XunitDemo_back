package TestLogin;

import DemoXunit.Login;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by liuzhe on 2019/3/23.
 */
public class LoginTest {
//   public static void main(String[] args) {
//        Login login = new Login();
//        login.userLogin("","");
//    }

//@Test
//    public void userLoginTest(){
//        Login login = new Login();
//        String result = login.userLogin("", "");
////        String result1 = login.userLogin("123", "");
////        String result2 = login.userLogin("", "123");
////        String result3 = login.userLogin("admin", "345678");
////        String result4 = login.userLogin("张三", "123456");
//        Assert.assertEquals("用户名或密码不能为空",result);
////        Assert.assertEquals("用户名或密码不能为空",result1);
////        Assert.assertEquals("用户名或密码不能为空",result2);
////        Assert.assertEquals("欢迎管理员",result3);
////        Assert.assertEquals("欢迎张三",result4);
//    }
//@Test
//    public void userLogin2Test(){
//        Login login = new Login();
//        String result = login.userLogin("", "");
//        String result1 = login.userLogin("123", "");
//        String result2 = login.userLogin("", "123");
//        String result3 = login.userLogin("admin", "345678");
//        String result4 = login.userLogin("张三", "123456");
//        Assert.assertEquals("用户名或密码不能为空",result);
//        Assert.assertEquals("用户名或密码不能为空",result1);
//        Assert.assertEquals("用户名或密码不能为空",result2);
//        Assert.assertEquals("欢迎管理员",result3);
//        Assert.assertEquals("欢迎张三",result4);
//    }



    @Test(parameters={"name","password","expect"})
//    参数化
    public void testLogin(String name,String password,String expect){

//        new一个对象
        Login login = new Login();
//        实际结果
        String actual = login.userLogin(name, password);
//        实际结果和预期结果对比
        Assert.assertEquals(actual,expect);
    }



//    @Test(dataProvider = "getUsers",dataProviderClass = LoginTestParams.class )
////    参数化
//    public void test1Login(String name,String password,String expect){
//
////        new一个对象
//        Login login = new Login();
////        实际结果
//        String actual = login.userLogin(name, password);
////        实际结果和预期结果对比
//        Assert.assertEquals(actual,expect);
//    }
//
//
}
