
import java.net.HttpURLConnection;
import java.net.URL;

public class Case1 {
    public static void UnitTest() throws Exception {
        ResponseGP resp = TestCaseGPAPI.callAPI("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjVmZDhkMGNhMTY0YjhiMDAxNzljYjE2NiIsImRhdGVMb2dpbiI6IjIwMjAtMTItMTVUMTU6MDg6NDYuMTYxWiIsImlhdCI6MTYwODA0NDkyNiwiZXhwIjoxNjA4MTMxMzI2fQ.TH2flBWreiWfKUZtP8IoQSBbuhQB6tZmSVq17iGu5X8");
        String token = resp.token;
        System.out.println("Unit test 1: Get_push_settings Satisfied");
        ResponseGP res = TestCaseGPAPI.callAPI(resp.token);
        String code = "1000";
        String message = "OK";
        String data = "like_comment : 1" +
                "from_friends : 1" +
                "requested_friend : 1" +
                "suggested_friend : 1" +
                "birthday : 1" +
                "video : 1" +
                "report : 1" +
                "sound_on : 1" +
                "notification_on : 1" +
                "vibrant_on : 1" +
                "led_on : 1";
        if (!("1000".equals(res.code))) throw new AssertionError();
        if ((!"OK".equals(res.message))) throw new AssertionError();
        System.out.println("Finished!");
    }
}
