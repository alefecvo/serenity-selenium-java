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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//@DefaultUrl("https://google.com")
@RunWith(SerenityRunner.class)
public class LoginTest extends PageObject {

    @Managed
    WebDriver driver;

    @FindBy(name = "q")
    WebElement googleSearch;

    @Title("Executing Login Test")
    @Test
    public void doLogin() {
        openUrl("https://www.google.com.br/");

        WebElementFacade textBox = find(By.name("q"));

        textBox.shouldBePresent();
        textBox.typeAndEnter("Hello Serenity !");
    }
}
