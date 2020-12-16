
public class Case2 {
    public static void UnitTest() throws Exception{
        ResponseGP resp = TestCaseGPAPI.callAPI("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjVmZDhkMGNhMTY0YjhiMDAxNzljYjE2NiIsImRhdGVMb2dpbiI6IjIwMjAtMTItMTVUMTU6MDg6NDYuMTYxWiIsImlhdCI6MTYwODA0NDkyNiwiZXhwIjoxNjA4MTMxMzI2fQ.TH2flBWreiWfKUZtP8IoQSBbuhQB6tZmSVq17iGu5X8");
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjVmZDhkMGNhMTY0YjhiMDAxNzljYjE2NiIsImRhdGVMb2dpbiI6IjIwMjAtMTItMTVUMTU6MDg6NDYuMTYxWiIsImlhdCI6MTYwODA0NDkyNiwiZXhwIjoxNjA4MTMxMzI2fQ.TH2flBWreiWfKUZtP8IoQSBbuhQB6tZmSVq17iGu5X8";
        System.out.println("Unit test 2: Token is incorrect");
        ResponseGP ress = TestCaseGPAPI.callAPI(token);
        if (!(ress.code.equals("1004"))) throw new AssertionError();
        if ((!"Parameter value is invalid".equals(ress.message))) throw new AssertionError();
        ResponseGP res = TestCaseGPAPI.callAPI( "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjVmZDhkMGNhMTY0YjhiMDAxNzljYjE2NiIsImRhdGVMb2dpbiI6IjIwMjAtMTItMTVUMTU6MDg6NDYuMTYxWiIsImlhdCI6MTYwODA0NDkyNiwiZXhwIjoxNjA4MTMxMzI2fQ.TH2flBWreiWfKUZtP8IoQSBbuhQB6tZmSVq17iGu5X8");
        if (((!resp.code.equals("1000")))) throw new AssertionError();
        if ((!"OK".equals(resp.message))) throw new AssertionError();
        System.out.println("Finished");

    }
}