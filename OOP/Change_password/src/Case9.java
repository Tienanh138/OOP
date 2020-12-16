//Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác nhưng mật khẩu
//mới giống với một mật khẩu đã được dùng từ trước đây.

import java.io.IOException;

public class Case9 {
    public static void UnitTest() throws Exception {
        ResponseLG resp = TestCaseLGAPI.callAPI( "0987654320","123456","5fd8d0ca164b8b00179cb166");
        String pass = "123456";
        String newpass ="1234567";
        String token = resp.token;
        System.out.println("Unit test 9: New password the same as password which has been used before");
        Change_password.ResponseCP res = TestCaseCPAPI.callAPI(pass, newpass, token);
        if (!"1000".equals(res.code)) throw new AssertionError(res.message + " with code " + res.code);
        if("OK".equals(res.message));
    }
}
