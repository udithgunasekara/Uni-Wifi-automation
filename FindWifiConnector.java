package NetworkURL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FindWifiConnector {
    public static void main(String[] args) {
        List<String> availableNetworks = getAvailableNetworks();

        if (availableNetworks != null) {
            System.out.println("Available Wi-Fi networks:");
            for (String network : availableNetworks) {
                System.out.println(network);
                System.out.println("");
                
                
            }
            if (!availableNetworks.isEmpty()) {
                String lastNetwork = availableNetworks.get(availableNetworks.size() - 1);
                System.out.println("Name of the last network: " + lastNetwork);
            } else {
                System.out.println("No available Wi-Fi networks.");
            }
  
            
        } else {
            System.out.println("Failed to retrieve available Wi-Fi networks.");
        }
    }

    // Execute system command to scan available Wi-Fi networks and get their names
    private static List<String> getAvailableNetworks() {
        List<String> availableNetworks = new ArrayList<>();
        try {
            Process process = Runtime.getRuntime().exec("netsh wlan show networks mode=Bssid");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                // Extract the network names (SSIDs) from the output
                if (line.trim().startsWith("SSID")) {
                    String[] parts = line.split(":", 2);
                    if (parts.length == 2) {
                        String ssid = parts[1].trim();
                        availableNetworks.add(ssid);
                    }
                }
            }

            process.waitFor();
            reader.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return availableNetworks;
    }
}
