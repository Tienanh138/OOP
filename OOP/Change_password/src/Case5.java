//Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác nhưng mật khẩu cũ
//không đúng.

import java.io.IOException;

public class Case5 {
    public static void UnitTest() throws Exception {
        ResponseLG resp = TestCaseLGAPI.callAPI( "0987654320","123456","5fd8d0ca164b8b00179cb166");
        String pass = "12345678";
        String newpass ="123123";
        String token = resp.token;
        System.out.println("Unit test 5: Mat khau da nhap khong chinh xac");
        Change_password.ResponseCP res = TestCaseCPAPI.callAPI(pass, newpass,token);

        if ((!res.code.equals("1003"))) throw new AssertionError();
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError();
        System.out.println("Finished");
    }
}