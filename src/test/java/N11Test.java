import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class N11Test {

    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {

        System.out.println("Before Suite tüm testlerden önce bir defa çalışır.");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void beforeMethod(){

        System.out.println("Before Method her testten önce bir defa çalışır.");

    }

    @Test
    public void N11Test1() {
        System.out.println("Test 1");

        driver.get("https://www.n11.com/");

        driver.findElement(By.xpath("//a[@class='btnSignIn']")).click();
        //driver.findElement(By.cssSelector(".btnSignIn")).click();

        driver.findElement(By.id("email")).sendKeys("sezai.celik@hotmail.com");
        driver.findElement(By.name("password")).sendKeys("456852@Sc");

        driver.findElement(By.id("loginButton")).click();


        driver.findElement(By.id("searchData")).sendKeys("iphone11 pro max");
        driver.findElement(By.xpath("//span[@class='icon iconSearch']")).click();
    }

    @Test
    public void N11Test2() {
        System.out.println("Test 2");

    }

    @AfterMethod
    public void afterMethod(){

        System.out.println("After Method her testten sonra bir defa çalışır.");

    }

    @AfterSuite
    public void afterSuite() {

        System.out.println("After Suite tüm testlerden önce bir defa çalışır.");
    }
}
