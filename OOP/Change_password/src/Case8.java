//Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác đầy đủ nhưng mật
//khẩu mới gần giống mật khẩu cũ. Xâu con chung dài nhất của hai mật khẩu chiếm 80% trở
//lên kích thước của mật khẩu mới.

import java.io.IOException;

public class Case8 {
    public static void UnitTest() throws Exception {
        ResponseLG resp = TestCaseLGAPI.callAPI( "0987654320","123456","5fd8d0ca164b8b00179cb166");
        String pass = "123456";
        String newpass = "1234567";
        String token = resp.token;
        System.out.println("Unit test 8: Mat khau moi gan giong mat khau cu");
        Change_password.ResponseCP res = TestCaseCPAPI.callAPI(pass, newpass, token);
        if (((!res.code.equals("1003")))) throw new AssertionError("wrong code");
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError("wrong message");

        System.out.println("Finished");
    }
}