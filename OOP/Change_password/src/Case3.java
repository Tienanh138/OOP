//Người dùng truyền đúng mã phiên đăng nhập nhưng hệ thống không thể thiết lập việc
//xử lý yêu cầu (do lỗi truy cập CSDL chẳng hạn)

import java.io.IOException;

public class Case3 {
    public static void UnitTest() throws Exception {
        ResponseLG resp = TestCaseLGAPI.callAPI( "0987654320","123456","5fd8d0ca164b8b00179cb166");
        String pass = "123456";
        String newpass ="123123";
        String token = resp.token;
        System.out.println("Unit test 3: The internet disconnected");
        Change_password.ResponseCP res = TestCaseCPAPI.callAPI(pass, newpass,token);
        if (!(res.code.equals("1000"))) throw new AssertionError();
        if ((!"OK".equals(res.message))) throw new AssertionError();
        System.out.println("Finished");
    }
}