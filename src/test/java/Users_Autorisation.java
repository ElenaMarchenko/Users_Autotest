import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Users_Autorisation {
    public static WebDriver driver;

    @Test
    public void LoginUsers() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\QA\\Tools\\CD\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://users.bugred.ru/");

        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("HellyHillel@gmail.com");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("HellyHillel");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input")).submit();

        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[1]/div/p/ins[1]/a/b")).click();
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[4]/td/input")).sendKeys("Helly1");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[5]/td[1]/button")).click();

        Thread.sleep(1000);

        WebElement Name=driver.findElement(By.xpath("//td[text()[normalize-space()='hellyhillel@gmail.com']]"));
        Assert.assertEquals(true, Name.isDisplayed());

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/ul/li[3]/a")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Helly9");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("HellyHillel9@gmail.com");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("HellyHillel9");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/form/table/tbody/tr[4]/td[2]/input")).submit();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/form/table/tbody/tr[4]/td[2]/input")).click();

        driver.get(driver.getCurrentUrl());

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("HellyHelly7");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[3]/td[2]/select")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[3]/td[2]/select/option[3]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("01012020");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("01022020");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys("To make my homework 1 am");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys("2050709060");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[8]/td[2]/input")).click();


    }
}
