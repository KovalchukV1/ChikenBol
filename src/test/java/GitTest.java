import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GitTest {
    WebDriver driver;

    @Test
    public void TestOne(){
        driver.get("google.com");
        driver.findElement(By.xpath("//locator"));
    }
}
