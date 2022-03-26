package com.devops.dxc.devops;
import static org.junit.Assert.assertTrue;


import org.springframework.boot.test.context.SpringBootTest;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


class ApplicationTests {

	private WebDriver driver;
	
    @Before
    public void setUp(){
        System.out.println("Iniciando configuración...");
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        driver = new ChromeDriver();
       // driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
       // driver.navigate().to("https://www.google.com");
    }
	@Test
	public void testCalcularSinImpuesto() {

		driver.manage().window().setSize(new Dimension(1366, 728));
	  driver.findElement(By.id("ahorro")).click();
	  driver.findElement(By.id("ahorro")).sendKeys("12000000");
	  driver.findElement(By.id("sueldo")).click();
	  driver.findElement(By.id("sueldo")).sendKeys("1000000");
	  driver.findElement(By.cssSelector("button")).click();
	  driver.findElement(By.cssSelector("button")).click();
	  {
		WebElement element = driver.findElement(By.cssSelector("button"));
		Actions builder = new Actions(driver);
		builder.doubleClick(element).perform();
	  }
	}
}
