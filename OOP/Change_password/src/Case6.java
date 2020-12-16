//Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác đầy đủ nhưng
//trong giao diện thì người dùng nhập hai mật khẩu cũ khác nhau

import java.io.IOException;

public class Case6 {
    public static void UnitTest() throws Exception {
        ResponseLG resp = TestCaseLGAPI.callAPI( "0987654320","123456","5fd8d0ca164b8b00179cb166");
        String pass = "12345678";
        String newpass ="123123";
        String token = resp.token;
        System.out.println("Unit test 6: Mat khau nhap khong chinh xac");
        Change_password.ResponseCP res = TestCaseCPAPI.callAPI(pass, newpass,token);
        if ((!"1000".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");


    }
}