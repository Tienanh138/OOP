//Người dùng truyền đúng mã phiên đăng nhập. Nhưng người dùng đã bị khóa tài khoản
//(do hệ thống khóa đi).

import java.io.IOException;

public class Case4 {
    public static void UnitTest() throws Exception {
        ResponseLG ress = TestCaseLGAPI.callAPI( "0987654320","123456","5fd8d0ca164b8b00179cb166");
        String passwd = "123456";
        String newpass ="123123";
        String token = ress.token ;
        System.out.println("Unit test 4: Tai khoan da bi block");
        Change_password.ResponseCP res = TestCaseCPAPI.callAPI( passwd, newpass,token);
        if (((!res.code.equals("9995")))) throw new AssertionError();
        if ((!"User is not validated".equals(res.message))) throw new AssertionError();
        ResponseLG resp = TestCaseLGAPI.callAPI( "0987654320","123456","5fd8d0ca164b8b00179cb166");
        if (((!resp.code.equals("1000")))) throw new AssertionError();
        System.out.println("Finished");

    }
}