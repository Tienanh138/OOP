
//Người dùng truyền đúng mã phiên đăng nhập và các tham số khác


public class Case1 {
    public static void UnitTest() throws Exception  {
        ResponseLG resp = TestCaseLGAPI.callAPI( "0987654320","123456","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjVmZDhkMGNhMTY0YjhiMDAxNzljYjE2NiIsImRhdGVMb2dpbiI6IjIwMjAtMTItMTVUMTU6MDk6NDIuMjczWiIsImlhdCI6MTYwODA0NDk4MiwiZXhwIjoxNjA4MTMxMzgyfQ.nzQrfdjs1JCLVS5hIUHonlDppLzVAWudQDnOmpmNM5g");
        String passwd = "123456";
        String newpass ="123123";
        String token = resp.token ;
        System.out.println("Unit test 1: Change Password OK");
        Change_password.ResponseCP res = TestCaseCPAPI.callAPI(passwd, newpass,token);
        if(!("1000".equals(res.code)))throw new AssertionError();
        if ((!"OK".equals(res.message))) throw new AssertionError();
        System.out.println("Finished!");
    }
}