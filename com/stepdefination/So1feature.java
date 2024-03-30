package com.stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class So1feature {
	WebDriver driver;

	@Given("Open Google")
	public void open_google() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");

	}

	@When("Enter Virat Kolhi in search box")
	public void enter_virat_kolhi_in_search_box() {
		driver.findElement(By.name("q")).sendKeys("Virat kolhi");

	}

	@When("Hit the enter")
	public void hit_the_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

	@Then("Search result for virat kolhi in search box")
	public void search_result_for_virat_kolhi_in_search_box() {
		if(driver.getTitle().contains("Virat")) {
			System.out.println("Successfully search");
		}
		else {
			System.out.println("Failed ");
		}

	}

}
