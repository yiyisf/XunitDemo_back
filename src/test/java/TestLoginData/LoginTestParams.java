package TestLoginData;

import org.testng.annotations.DataProvider;

/**
 * Created by liuzhe on 2019/3/23.
 * 提供用户登录方法的数据
 */
public class LoginTestParams {
    @DataProvider
    public Object[][] getUsers(){
        return new Object[][]{
                {"","","用户名或密码不能为空"},
                {"123","","用户名或密码不能为空"},
                {"","234","用户名或密码不能为空"},
                {"张三","123456","欢迎张三"}

        };
    }

}
