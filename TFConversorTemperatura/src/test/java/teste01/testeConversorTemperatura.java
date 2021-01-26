package teste01;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testeConversorTemperatura {

	String url;
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		url = "http://localhost:8080/ConversorTemperatura/index.html";
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\thiag\\eclipse-workspace\\TFConversorTemperatura\\drivers\\Firefox\\0.29_64bits\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.manage().window().maximize();

	}

	@After
	public void tearDown() throws Exception {
	    driver.quit();
	}

	@Test
	public void test01() {
	    driver.get(url);
	    driver.findElement(By.name("valorTemperatura")).click();
	    driver.findElement(By.name("valorTemperatura")).sendKeys("100");
	    driver.findElement(By.id("tipoTemperatura")).click();
	    driver.findElement(By.cssSelector("option:nth-child(1)")).click();
	    driver.findElement(By.cssSelector("input:nth-child(8)")).click();
	    driver.findElement(By.cssSelector("div")).click();
	    
	    String resultado = "A temperatura de 100.0° Fahrenheit convertida para Celsius é de 212.0°.";
	    
	    assertEquals(resultado, driver.findElement(By.cssSelector("p[id='resultado']")).getText());
	}
	
	@Test
	public void test02() {
	    driver.get(url);
	    driver.findElement(By.name("valorTemperatura")).click();
	    driver.findElement(By.name("valorTemperatura")).sendKeys("212");
	    driver.findElement(By.id("tipoTemperatura")).click();
	    driver.findElement(By.cssSelector("option:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("input:nth-child(8)")).click();
	    driver.findElement(By.cssSelector("div")).click();
	    
	    String resultado = "A temperatura de 212.0° Celsius convertida para Fahrenheit é de 100.0°.";
	    
	    assertEquals(resultado, driver.findElement(By.cssSelector("p[id='resultado']")).getText());
	}

}
