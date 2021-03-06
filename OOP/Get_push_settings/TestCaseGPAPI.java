import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


    public class TestCaseGPAPI {
        public static ResponseGP callAPI(String token) throws Exception {
            URL url = new URL(Constant.Get_push_settings + "?token=" + token);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setDoOutput(true);
            try (DataOutputStream writer = new DataOutputStream(con.getOutputStream())) {

                StringBuilder content;
                try (BufferedReader in = new BufferedReader(
                        new InputStreamReader(con.getInputStream()))) {
                    String line;
                    content = new StringBuilder();
                    while ((line = in.readLine()) != null) {
                        content.append(line);
                        content.append(System.lineSeparator());
                    }
                }
                Gson g = new Gson();
                System.out.println(content.toString());
                ResponseGP t = g.fromJson(content.toString(), ResponseGP.class);

            } finally {
                con.disconnect();
            }
            return null;
        }
    }

