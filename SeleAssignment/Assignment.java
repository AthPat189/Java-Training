package com.cg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Automate_End_to_End_Buy_Order_functionality {

	ChromeDriver driver;

@Test	

public class Assignment1 {
 public static void main(String args[]) throws InterruptedException {
  WebDriverManager.chromedriver().setup();
  WebDriver driver = new ChromeDriver();
  WebDriverWait wait;
  
  //Load the URL "https://automationpractice.com/index.php" and maximize it
  driver.get("https://automationpractice.com/index.php");
  driver.manage().window().maximize();
  wait = new WebDriverWait(driver, 10);
  
  /* Login
   * User : pekiroc522@dufeed.com
   * Pass : test123
   */
  
  driver.findElement(By.className("login")).click();
  driver.findElement(By.id("email")).sendKeys("pekiroc522@dufeed.com");
  driver.findElement(By.id("passwd")).sendKeys("test123");
  driver.findElement(By.cssSelector("button[id='SubmitLogin'] span")).click();
  

  Actions actions = new Actions(driver);
  WebElement womensTab = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Women")))); 
  actions.moveToElement(womensTab);
  
  WebElement tshirtsMenu = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li[class='sfHover'] a[title='T-shirts']")));  
  actions.moveToElement(tshirtsMenu);
  actions.click();
  
  WebElement product = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//h5[@itemprop='name'])[1]"))));
  actions.moveToElement(product);
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  actions.click().build().perform();
 
  
  driver.findElement(By.xpath("(//span[normalize-space()='More'])[1]")).click();
  driver.findElement(By.id("quantity_wanted")).sendKeys("2");
  
  
  WebElement sizeSelect = driver.findElement(By.id("group_1"));
  Select select = new Select(sizeSelect);
  select.deselectByVisibleText("L");
  
  driver.findElement(By.id("color_14")).click();
  driver.findElement(By.xpath("//span[normalize-space()='Add to cart']")).click();
  driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']")).click();
  
  driver.quit();
  
  //Close the page
  driver.quit(); 
 }
}