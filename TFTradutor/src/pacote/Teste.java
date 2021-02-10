package pacote;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Teste {
	
	WebDriver driver;
	String url;

	@Before
	public void setUp() {
		url = "http://localhost:8080/Tradutor/index.html";
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\thiag\\git\\bau\\TFTradutor\\drivers\\Firefox\\0.29_64bits\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void Teste01() {
		driver.get(url);
		driver.manage().window().setSize(new Dimension(1536, 834));
		driver.findElement(By.name("palavraPortugues")).click();
		driver.findElement(By.name("palavraPortugues")).sendKeys("Agir");
		driver.findElement(By.cssSelector("input:nth-child(5)")).click();
		driver.findElement(By.id("divSecundaria")).click();
		
		String resultado ="Acted"; 
		
		assertEquals(resultado, driver.findElement(By.cssSelector("p[id='resultado']")).getText());
	}
	
	
	@Test
	public void Teste02() {
		driver.get(url);
		driver.manage().window().setSize(new Dimension(1536, 834));
		driver.findElement(By.name("palavraPortugues")).click();
		driver.findElement(By.name("palavraPortugues")).sendKeys("Conquistar");
		driver.findElement(By.cssSelector("input:nth-child(5)")).click();
		driver.findElement(By.id("divSecundaria")).click();
		
		String resultado ="Achieved"; 
		
		assertEquals(resultado, driver.findElement(By.cssSelector("p[id='resultado']")).getText());
	}
	
	
	@Test
	public void Teste03() {
		driver.get(url);
		driver.manage().window().setSize(new Dimension(1536, 834));
		driver.findElement(By.name("palavraPortugues")).click();
		driver.findElement(By.name("palavraPortugues")).sendKeys("Admira");
		driver.findElement(By.cssSelector("input:nth-child(5)")).click();
		driver.findElement(By.id("divSecundaria")).click();
		
		String resultado ="Admired"; 
		
		assertEquals(resultado, driver.findElement(By.cssSelector("p[id='resultado']")).getText());
	}
}
