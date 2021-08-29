package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static java.time.temporal.ChronoUnit.SECONDS;

//@DefaultUrl("https://google.com")
@RunWith(SerenityRunner.class)
public class GmailTest extends PageObject {

    @Managed
    WebDriver driver;


    @Title("Executing Gmail Login Test ")
    @Test
    public void doLoginGmail() throws InterruptedException {
        open();

        setImplicitTimeout(10, SECONDS);

        WebElementFacade txtEmail = find(By.id("identifierId"));
        txtEmail.shouldBePresent();
        txtEmail.sendKeys("trainer@way2automation.com");

        WebElementFacade btnProxima = find(By.xpath("//*[@id='identifierNext']/div/button/span"));
        btnProxima.shouldBePresent();
        btnProxima.click();

        withTimeoutOf(Duration.ofSeconds(10)).find(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("trainer@way2automation.com");

        Thread.sleep(3000);
    }
}
