package testes;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class conectac {

    @Test
    public void testando (){
        System.setProperty("webdriver.chrome.driver", "/home/pedrolana/Documents/Pessoal/Estudo/Test/Drivers/chromedriver");
        WebDriver wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get("https://www.google.com.br");

        wd.findElement(By.id("gb_70")).click();
        wd.findElement(By.id("identifierId")).sendKeys("pedrodelana@gmail.com");
        wd.findElement(By.className("CwaK9")).findElement(By.className("RveJvd snByac")).click();
        wd.findElement(By.id("identifierId")).sendKeys("pedrodelana@gmail.com");




    }
}
