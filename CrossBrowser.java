package selpkg1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CrossBrowser  {

	public static void main(String[] args) {
			//Invoking browser
	/*	
			//launching firefox browser
			System.setProperty("webdriver.gecko.driver", "G:\Browser Drivers\\geckodriver.exe");
			WebDriver driver1 = new FirefoxDriver();							
				driver1.get("https://rahulshettyacademy.com"); //hitting this url in browser tab
				//driver.getTitle(); //browser tab name is the title of that page
				System.out.println("Launching Firefox browser....");
				System.out.println("Page title of Rahul Shetty website is :- "+driver1.getTitle()); // if you want to get and print page title		
				//similarly, print current page url
				System.out.println("Current Page url of Rahul Shetty website is :- "+driver1.getCurrentUrl());
			driver1.close();
			//driver1.quit();

		*/
		
			//launching chrome browser
			System.setProperty("webdriver.chrome.driver", "G:\\Browser Drivers\\chromedriver.exe");		//key & value pair	 
			WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com"); //hitting this url in browser tab
				//driver.getTitle(); //browser tab name is the title of that page
				System.out.println("Launching Chrome browser....");
				System.out.println("Page title of Rahul Shetty website is :- "+driver.getTitle()); // if you want to get and print page title	
				//similarly, print current page url
				System.out.println("Current Page url of Rahul Shetty website is :- "+driver.getCurrentUrl());
			driver.close();
			//driver.quit();

			
			//launching microsoft edge browser
			System.setProperty("webdriver.edge.driver", "G:\\Browser Drivers\\msedgedriver.exe");			//key & value pair 
			WebDriver driver2 = new EdgeDriver();
				driver2.get("https://rahulshettyacademy.com"); //hitting this url in browser tab
				//driver.getTitle(); //browser tab name is the title of that page
				System.out.println("Launching Microsoft Edge browser....");
				System.out.println("Page title of Rahul Shetty website is :- "+driver2.getTitle()); // if you want to get and print page title	
				//similarly, print current page url
				System.out.println("Current Page url of Rahul Shetty website is :- "+driver2.getCurrentUrl());
			driver2.close();
			//driver2.quit();
			
			}
	}
