package NetworkURL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// ERROR FOUND: we can't find the url loaded url in after connecting wifi.

public class GetLink {
	private String currentURL;

    public void GetWifiLink() {

//        System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium\\chromedriver");
//
//        ChromeOptions options = new ChromeOptions();
//
//        WebDriver driver = new ChromeDriver(options);

        //run Tryconnect class
        System.out.println("Test getlink.java succesfull !");

        
        //currentURL = driver.getCurrentUrl(); //Pass currentURL value to Main.java
        System.out.println("URL of the login page: " + currentURL);

        // Close the browser
        //driver.quit();
        currentURL = "https://news.ycombinator.com/news"; //test case getting url
        //pass value currentUrl  
    }
    
	public String passinglink() {
		// TODO Auto-generated method stub
		GetWifiLink();
		String savelink = currentURL;
		System.out.println("Here im out from Getlink class passinglink function !");
		return savelink;
	}
	
}
