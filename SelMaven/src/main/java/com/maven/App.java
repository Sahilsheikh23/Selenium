package com.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class App {
	WebDriver driver;
	@Test
	public void Setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		
	}
	
	@Test
	public void demo() {
		WebElement jewel = driver.findElement(By.xpath("(//a[contains(text(),'Jewelry')])[1]"));
		WebElement giftCards = driver.findElement(By.xpath("(//a[@href=\"/gift-cards\"])[1]"));
		Assert.assertTrue(jewel.isDisplayed());
		Assert.assertTrue(giftCards.isDisplayed());
		WebElement newsletter = driver.findElement(By.xpath("//input[@id='newsletter-email']"));
		newsletter.sendKeys("abc");
		Assert.assertEquals("abcd", "newsletter");
		
		
		
		}
}
