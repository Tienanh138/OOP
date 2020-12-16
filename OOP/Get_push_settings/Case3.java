import java.io.IOException;

public class Case3 {
    public static void UnitTest() throws Exception {
        ResponseGP resp = TestCaseGPAPI.callAPI("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjVmZDhkMGNhMTY0YjhiMDAxNzljYjE2NiIsImRhdGVMb2dpbiI6IjIwMjAtMTItMTVUMTU6MDg6NDYuMTYxWiIsImlhdCI6MTYwODA0NDkyNiwiZXhwIjoxNjA4MTMxMzI2fQ.TH2flBWreiWfKUZtP8IoQSBbuhQB6tZmSVq17iGu5X8");
        String token = resp.token;
        System.out.println("Unit test 3: The internet connected");
        ResponseGP res = TestCaseGPAPI.callAPI( token);
        if (!(res.code.equals("1000"))) throw new AssertionError();
        if ((!"OK".equals(res.message))) throw new AssertionError();
        System.out.println("Finished");
    }
}