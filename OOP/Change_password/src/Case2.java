//Người dùng gửi sai mã phiên đăng nhập (mã bị trống hoặc quá ngắn hoặc mã phiên
//đăng nhập cũ).

public class Case2 {
    public static void UnitTest() throws Exception{
        ResponseLG res = TestCaseLGAPI.callAPI( "0987654320","123456","5fd8d0ca164b8b00179cb166");
        String pass = "123456";
        String newpass ="123123";
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjVmZDhkMGNhMTY0YjhiMDAxNzljYjE2NiIsImRhdGVMb2dpbiI6IjIwMjAtMTItMTVUMTU6MDk6NDIuMjczWiIsImlhdCI6MTYwODA0NDk4MiwiZXhwIjoxN";
        System.out.println("Unit test 2: Token khong chinh xac");
                Change_password.ResponseCP ress = TestCaseCPAPI.callAPI(pass,newpass,token);
        if (!(ress.code.equals("1004"))) throw new AssertionError();
        if ((!"Parameter value is invalid".equals(ress.message))) throw new AssertionError();
        ResponseLG resp = TestCaseLGAPI.callAPI( "0987654320","123456","5fd8d0ca164b8b00179cb166");
        if (((!resp.code.equals("1000")))) throw new AssertionError();
        if ((!"OK".equals(resp.message))) throw new AssertionError();
        System.out.println("Finished");

    }
}