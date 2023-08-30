package AutomationForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import NetworkURL.GetLink;
import NetworkURL.TryConnect;

public class FillForm {
    private static WebDriver driver;
    private static String linkfound;

    public static void main(String[] args) {
    	
    	LoginForm loginForm = new LoginForm();
        loginForm.showForm(); //1. call login form
        
        TryConnect.NetworkTry(args);
        
        GetLink getLink = new GetLink();
		getLink.GetWifiLink();       
 
        //Creaing getlink obj pup get link
        GetLink foundlink = new GetLink();
        
        linkfound = foundlink.passinglink();
        
        System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium\\chromedriver");

        driver = new ChromeDriver();

        String websiteUrl = linkfound; //Add sliit loggin port link. Get on backend in TryConnect.jv section

        System.out.println("Here the got link: "+linkfound);
        
    }

    public void performAutomation(String username, String password) {

        driver.get(linkfound);

        driver.findElement(By.id("ft_un")).sendKeys(username);
        driver.findElement(By.id("ft_pd")).sendKeys(password);

        driver.findElement(By.className("primary")).click();

        driver.quit();
    }
}
