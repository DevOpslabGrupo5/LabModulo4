package com.devops.dxc.devops;

import static org.junit.Assert.assertTrue;

import org.springframework.boot.test.context.SpringBootTest;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ApplicationTests {

	Logger logger = LoggerFactory.getLogger(ApplicationTests.class);

	private WebDriver driver;

	public void ApplicationTests() {
		driver = new ChromeDriver();
	}

	@Before
	public void setUp() {
		System.out.println("Iniciando configuración...");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200", "--ignore-certificate-errors",
		// 		"--disable-extensions", "--no-sandbox", "--disable-dev-shm-usage");
		driver = new ChromeDriver();
		// driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		// driver.navigate().to("https://www.google.com");
	}

	// Prueba calculo donde el impuesto es 0
	@Test
	public void testCalcularSinImpuesto() {
		driver.get("http://localhost:9000/register");
		driver.manage().window().setSize(new Dimension(1366, 728));
		driver.findElement(By.id("ahorro")).click();
		driver.findElement(By.id("ahorro")).sendKeys("");
		driver.findElement(By.id("ahorro")).sendKeys("12000000");
		driver.findElement(By.id("sueldo")).click();
		driver.findElement(By.id("sueldo")).sendKeys("");
		driver.findElement(By.id("sueldo")).sendKeys("1000000");
		driver.findElement(By.cssSelector("button")).click();
		assertTrue(driver.findElement(By.id("ImptoId")).getText().contains("0.0"));
		driver.close();
		driver.quit();

	}

	// Prueba calculo donde el impuesto es mayor a 0
	@Test
	public void testCalcularConImpuesto() {
		driver.get("http://localhost:9000/register");
		driver.manage().window().setSize(new Dimension(1366, 728));
		driver.findElement(By.id("ahorro")).click();
		driver.findElement(By.id("ahorro")).sendKeys("");
		driver.findElement(By.id("ahorro")).sendKeys("5000000");
		driver.findElement(By.id("sueldo")).click();
		driver.findElement(By.id("sueldo")).sendKeys("");
		driver.findElement(By.id("sueldo")).sendKeys("2800000");
		driver.findElement(By.cssSelector("button")).click();
		Double impuesto = Double.valueOf(driver.findElement(By.id("ImptoId")).getText());
		assertTrue(impuesto > 0);
		driver.close();
		driver.quit();

	}

	// Prueba calculo donde el saldo es 0 y por lo tanto el 10% es 0
	@Test
	public void testCalcularSinSaldo() {
		driver.get("http://localhost:9000/register");
		driver.manage().window().setSize(new Dimension(1366, 728));
		driver.findElement(By.id("ahorro")).click();
		driver.findElement(By.id("ahorro")).sendKeys("0");
		driver.findElement(By.id("sueldo")).click();
		driver.findElement(By.id("sueldo")).sendKeys("");
		driver.findElement(By.id("sueldo")).sendKeys("800000");
		driver.findElement(By.cssSelector("button")).click();
		assertTrue(driver.findElement(By.id("MontoId")).getText().contains("0"));
		driver.close();
		driver.quit();

	}

	// Prueba calculo cuando quedara con saldo 0 despues de este retiro
	@Test
	public void testCalcularSinFondo() {
		driver.get("http://localhost:9000/register");
		driver.manage().window().setSize(new Dimension(1366, 728));
		driver.findElement(By.id("ahorro")).click();
		driver.findElement(By.id("ahorro")).sendKeys("");
		driver.findElement(By.id("ahorro")).sendKeys("300000");
		driver.findElement(By.id("sueldo")).click();
		driver.findElement(By.id("sueldo")).sendKeys("");
		driver.findElement(By.id("sueldo")).sendKeys("800000");
		driver.findElement(By.cssSelector("button")).click();
		assertTrue(driver.findElement(By.id("SaldoId")).getText().contains("0"));
		driver.close();
		driver.quit();

	}
}
