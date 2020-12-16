package OOP;

public class TestCase_Change_pass {
    public static void UnitTest_CP() throws Exception {
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOiI1ZmQ3OThlMGY5ZWZkZDAwMTc0ZmI1OTciLCJwaG9uZU51bWJlciI6IjA5ODc2NTQzMjEiLCJpYXQiOjE2MDc5NjUxNTF9.YZD9KPlc9O1vp3nZcp-j-l4Vbrg5_ozhK2zSe5QsUGY";
        String password = "123456";
        String new_password = "12345678";
        ResponseChange_pass resp = TestCase_Change_pass.callAPI(token, password, new_password);
        System.out.println("Unit test : Change Pasword");
        String code = "1000";
        String message = "OK";
        String data = resp.data1.token;
        ResponseChange_pass res = TestCase_Change_pass.callAPI(user_id, type, token);
        if (!("1000".equals(res.code))) throws new AssertionError( detailMessage:"wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError( detailMessage:"wrong message");
        System.out.println("Satisfied! Finish");
    }

    }
