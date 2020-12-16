//Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác nhưng mật khẩu
//mới không hợp lệ (không đảm bảo dài ngắn hoặc chứa ký tự đặc biệt hoặc giống mật khẩu
//cũ).

import java.io.IOException;

public class Case7 {
    public static void UnitTest() throws Exception {
        ResponseLG resp = TestCaseLGAPI.callAPI( "0987654320","123456","5fd8d0ca164b8b00179cb166");
        String pass = "123456";
        String newpass ="abc";
        String token = resp.token;
        System.out.println("Unit test 7: Mat khau moi khong hop le");
        Change_password.ResponseCP res = TestCaseCPAPI.callAPI(pass, newpass,token);
        if (((!res.code.equals("1003")))) throw new AssertionError("wrong code");
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!");
    }
}