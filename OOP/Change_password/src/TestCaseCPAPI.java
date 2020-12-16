import com.google.gson.Gson;
import java.net.URL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;


public class TestCaseCPAPI {
    public static Change_password.ResponseCP callAPI(String new_password, String password, String token) throws IOException {
        URL ur = new URL(Constant.Change_password +
                "?token=" + token + "&password=" + password + "&new_password=" + new_password);
        HttpURLConnection conn = (HttpURLConnection) ur.openConnection();

        conn.setRequestMethod("POST");
        conn.setDoOutput(true);

        try (DataOutputStream writer = new DataOutputStream(conn.getOutputStream())) {

            StringBuilder content;
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()))) {
                String line;
                content = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }
            Gson g = new Gson();
            System.out.println(content.toString());
            return g.fromJson(content.toString(), Change_password.ResponseCP.class);
        } finally {
            conn.disconnect();
        }

    }

}
