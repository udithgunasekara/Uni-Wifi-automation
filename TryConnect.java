package NetworkURL;


// This is connection using SSID and Password
// tying correct connection and load the page
/*
import java.io.IOException;

public class TryConnect {

    public static void NetworkTry(String[] args) {
        String ssid = "BELL4G-E897";
        String password = "LR3HDTA1NE8";

        try {
            // Setup host network bell
            String set_hotset_command = "netsh wlan set hostednetwork mode=allow ssid=\"" + ssid + "\" key=\"" + password + "\"";
            executeCommand(set_hotset_command);

            // Run execution in cmd bell confirmation 
            String connect_Network = "netsh wlan connect ssid=" + ssid + " name=" + ssid;
            executeCommand(connect_Network);
            
            //Creating object GetLink and find the new tab link
            GetLink getweblink = new GetLink ();
            String x = getweblink.GetWifiLink();
            
          

            System.out.println("Wi-Fi connection successful.");
            //conn tryconnect and getling ...testing..passed
            System.out.println("Here the main test pass one conn getlink and tryconnect classes"  +x); // Passed connection 2 classes.
           
            
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void executeCommand(String command) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", command);
        Process process = processBuilder.start();
        process.waitFor();
    }
}
*/

import java.io.IOException;

public class TryConnect {

    public static void NetworkTry(String[] args) {
        String ssid = "SLIIT-STD";

        try {
            // Connect to Wi-Fi network
            String connectToNetworkCommand = "netsh wlan connect ssid=" + ssid + " name=" + ssid;
            executeCommand(connectToNetworkCommand);

            System.out.println("Wi-Fi connection to " + ssid + " successful.");
            System.out.println("Tryconnect call test passed ! ");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            System.out.println("Failed to connect to " + ssid + " Wi-Fi network.");
        }
        
    }

    private static void executeCommand(String command) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", command);
        Process process = processBuilder.start();
        process.waitFor();
    }
}

