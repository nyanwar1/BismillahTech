import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest2
{

    ChromeDriver driver;

    @Before
    public  void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "C:/btech/driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.target.com/");
        driver.manage().window().maximize();
        System.out.println("Hello world!");

    }





}
