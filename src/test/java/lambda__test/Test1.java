package lambda__test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test1 {
@Test
   public void test() {
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    WebDriver driver = new ChromeDriver(options);
    driver.get("https://www.lambdatest.com/selenium-playground/input-form-demo");
    driver.manage().window().maximize();
driver.findElement(By.id("name")).sendKeys("bilal");
 driver.findElement(By.id("inputEmail4")).sendKeys("bilal");
 driver.findElement(By.id("inputPassword4")).sendKeys("bilal");
 driver.findElement(By.id("company")).sendKeys("bilal");
 driver.findElement(By.id("websitename")).sendKeys("bilal");
 driver.findElement(By.id("inputAddress1")).sendKeys("bilal");




}
}
