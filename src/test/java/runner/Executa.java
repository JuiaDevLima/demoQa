package runner;


import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;



@RunWith(Cucumber.class)
@CucumberOptions (
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@positivo",
		dryRun = false,
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty", "html:target/cucumber-report.html"}
		
		)

public class Executa extends Drivers { 
	
	
	public static void abrirNavegador() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com");

		}
	


	// metodo encerra navegador
	public static void fecharNavegador() {
		driver.quit();
	}

	

}


