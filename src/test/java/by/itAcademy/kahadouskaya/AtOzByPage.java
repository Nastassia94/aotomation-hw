package by.itAcademy.kahadouskaya;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtOzByPage {
    @Test
    public void verifyAnUnregisteredUser()  {
        WebDriver driver = new ChromeDriver();
        OzByPage OzByPage = new OzByPage(driver);

        OzByPage.getPage();
        OzByPage.clickLoginButton();
        OzByPage.getElmSignInTitle();
        OzByPage.clickSignInFormByEmail();
        OzByPage.sendKeysEmailInput("test.dostup@bk.ru");
        OzByPage.sendKeysPasswordInput("123456789");
        OzByPage.clickSubmitButton();

       assertEquals("Адрес электронной почты не зарегистрирован. Зарегистрироваться", OzByPage.getTextLoginError());

        driver.quit();
    }
}
