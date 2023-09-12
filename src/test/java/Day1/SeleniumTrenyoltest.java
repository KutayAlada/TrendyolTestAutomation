package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;


public class SeleniumTrenyoltest {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.trendyol.com");

        WebElement Kapat = driver.findElement(By.className("modal-close"));
        Kapat.click();
        driver.findElement(By.className("link-text")).click();
        driver.findElement(By.id("login-email")).sendKeys("kutayalada2000@gmail.com");
        driver.findElement(By.id("login-password-input")).sendKeys("Edirne34");
        driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/button")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"browsing-gw-homepage\"]/div/div/div/article[1]/div/div/div[2]/a[8]")).click();
        driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[4]/div[1]/div/div[1]/div[1]/a/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[4]/div[1]/div/div[1]/div[2]/i")).click();
        driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[4]/div[1]/div/div[2]/div[2]/i")).click();
        driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[4]/div[1]/div/div[3]/div[2]/i")).click();
        driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[4]/div[1]/div/div[4]/div[2]/i")).click();
        driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[4]/div[1]/div/div[5]/div[2]/i")).click();
        driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[4]/div[1]/div/div[6]/div[2]/i")).click();
        driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[4]/div[1]/div/div[7]/div[2]/i")).click();
        driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[4]/div[1]/div/div[8]/div[2]/i")).click();
        driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[4]/div[1]/div/div[9]/div[2]/i")).click();
        driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[4]/div[1]/div/div[10]/div[2]/i")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[4]/div[1]/div/div[1]/div[1]/a")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);

        Iterator<String> iterator = windowHandles.iterator();
        String parentwindow = iterator.next();
        System.out.println(parentwindow);
        String childwindow = iterator.next();
        System.out.println(childwindow);

        driver.switchTo().window(childwindow);

        driver.findElement(By.className("add-to-basket")).click();
        Thread.sleep(2000);
        driver.close();
        driver.switchTo().window(parentwindow);

        driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[4]/div[1]/div/div[2]/div[1]/a")).click();
        Set<String> windowHandles1 = driver.getWindowHandles();
        System.out.println(windowHandles1);

        Iterator<String> iterator1 = windowHandles1.iterator();
        String parentwindow1 = iterator1.next();
        System.out.println(parentwindow1);
        String childwindow1 = iterator1.next();
        System.out.println(childwindow1);

        driver.switchTo().window(childwindow1);

        driver.findElement(By.className("add-to-basket")).click();
        Thread.sleep(2000);
        driver.close();
        driver.switchTo().window(parentwindow1);


        driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[4]/div[1]/div/div[3]/div[1]")).click();
        Set<String> windowHandles2 = driver.getWindowHandles();
        System.out.println(windowHandles2);

        Iterator<String> iterator2 = windowHandles2.iterator();
        String parentwindow2 = iterator2.next();
        System.out.println(parentwindow2);
        String childwindow2 = iterator2.next();
        System.out.println(childwindow2);

        driver.switchTo().window(childwindow2);

        driver.findElement(By.className("add-to-basket")).click();
        Thread.sleep(2000);
        driver.close();
        driver.switchTo().window(parentwindow2);

        driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[4]/div[1]/div/div[4]/div[1]/a")).click();
        Set<String> windowHandles3 = driver.getWindowHandles();
        System.out.println(windowHandles3);

        Iterator<String> iterator3 = windowHandles3.iterator();
        String parentwindow3 = iterator3.next();
        System.out.println(parentwindow3);
        String childwindow3 = iterator3.next();
        System.out.println(childwindow3);

        driver.switchTo().window(childwindow3);

        driver.findElement(By.className("add-to-basket")).click();
        Thread.sleep(2000);
        driver.close();
        driver.switchTo().window(parentwindow3);

        driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[4]/div[1]/div/div[5]/div[1]/a")).click();
        Set<String> windowHandles4 = driver.getWindowHandles();
        System.out.println(windowHandles4);

        Iterator<String> iterator4 = windowHandles4.iterator();
        String parentwindow4 = iterator4.next();
        System.out.println(parentwindow4);
        String childwindow4 = iterator4.next();
        System.out.println(childwindow4);

        driver.switchTo().window(childwindow4);

        driver.findElement(By.className("add-to-basket")).click();
        Thread.sleep(2000);
        driver.close();
        driver.switchTo().window(parentwindow4);

        driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[4]/div[1]/div/div[6]/div[1]/a")).click();
        Set<String> windowHandles5 = driver.getWindowHandles();
        System.out.println(windowHandles5);

        Iterator<String> iterator5 = windowHandles5.iterator();
        String parentwindow5 = iterator5.next();
        System.out.println(parentwindow5);
        String childwindow5 = iterator5.next();
        System.out.println(childwindow5);

        driver.switchTo().window(childwindow5);

        driver.findElement(By.className("add-to-basket")).click();
        Thread.sleep(2000);
        driver.close();
        driver.switchTo().window(parentwindow5);

        driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[4]/div[1]/div/div[7]/div[1]/a")).click();
        Set<String> windowHandles6 = driver.getWindowHandles();
        System.out.println(windowHandles6);

        Iterator<String> iterator6 = windowHandles6.iterator();
        String parentwindow6 = iterator6.next();
        System.out.println(parentwindow6);
        String childwindow6 = iterator6.next();
        System.out.println(childwindow6);

        driver.switchTo().window(childwindow6);

        driver.findElement(By.className("add-to-basket")).click();
        Thread.sleep(2000);
        driver.close();
        driver.switchTo().window(parentwindow6);

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"account-navigation-container\"]/div/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"pb-container\"]/aside/div/div[4]/a")).click();



        System.out.println(driver.getTitle());

    }

}
