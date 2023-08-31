package NetworkURL;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CaptivePortalCapture {

    public static void main(String[] args) {
        String urlToCheck = "http://google.com";
        TryConnect.NetworkTry(args);// Replace with the URL you expect to be redirected to the captive portal

        try {
            URL url = new URL(urlToCheck);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setInstanceFollowRedirects(false); // Disable automatic redirection

            int responseCode = connection.getResponseCode();
            
            if (responseCode >= 300 && responseCode <= 399) {
                String redirectUrl = connection.getHeaderField("Location");
                System.out.println("Captive Portal URL: " + redirectUrl);
            } else {
                System.out.println("Not redirected to the captive portal.");
            }
            System.out.println("11111 Test passed");

            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


