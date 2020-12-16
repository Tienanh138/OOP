public class Case4 {
    public static void UnitTest() throws Exception{
        System.out.println("Test Case 4: The account is blocked");
        //call Login API with parameters satisfied
        //log in account
        String phonenumber = "0987654320";
        String password = "123456";
        String uuid = "5fd8d0ca164b8b00179cb166";
        ResponseLG res = TestCaseLGAPI.callAPI(phonenumber, password, uuid);
        if (!(res.code.equals("9995"))) throw new AssertionError("wrong code");
        if ((!"User is not validated".equals(res.message))) throw new AssertionError("wrong message");

        //call API Login to return login homepage
        //expecting 1000 response code and "OK" as response message
        ResponseGP resp1 = TestCaseGPAPI.callAPI(res.token);
        if (!(resp1.code.equals("1000"))) throw new AssertionError("wrong code");
        if (!(resp1.message.equals("OK"))) throw new AssertionError("wrong message");

        //Finish test case if the conditions satisfied
        System.out.println("Finished");
    }
}