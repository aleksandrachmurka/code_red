package inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Input {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://google.com");

        InputStreamReader urlIn = new InputStreamReader(url.openStream());
        BufferedReader in = new BufferedReader(urlIn);

        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();
    }
}
