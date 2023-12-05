package by.itAcademy.kahadouskaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OzByPage {
    private String url = "https://oz.by/";
    private String elmLoginButton = "//div[contains(@class, 'user-bar__item')]//span[contains(text(), 'Войти')]";
    private String elmSignInTitle = "//p[contains(@class, 'i-h i-h_2 i-popup__title')][contains(text(), 'Вход')]";
    private String elmSignInFromEmailButton = "//a[contains(@id, 'loginFormLoginEmailLink')][contains(text(), 'Электронная почта')]";
    private String elmInputEmail = "//input[contains(@class, 'i-input i-input_full-width i-popup__input')][contains(@placeholder, 'Электронная почта')]";
    private String elmInputPassword = "//input[contains(@class, 'i-input i-input_full-width i-input_with-padding i-popup__input')][contains(@placeholder, 'Пароль')]";
    private  String elmSubmitButton = "//button[contains(@type, 'submit')][contains(text(), 'Войти')]";
    private String elmMessageErrorUnregisteredUser = "//div[contains(@class, 'i-popover__line')]";


    private WebDriver driver;
    public OzByPage(WebDriver driver){
        this.driver = driver;
    }
    public void getPage(){
        driver.get(url);
    }


    public void clickLoginButton() {
        driver.findElement(By.xpath(elmLoginButton)).click();
    }
    public Object getElmSignInTitle() {
        waitABit(1000);
        return elmSignInTitle;
    }
    public void clickSignInFormByEmail() {
   driver.findElement(By.xpath(elmSignInFromEmailButton)).click();
        waitABit(1000);
   }

  public void sendKeysEmailInput(String email) {
      driver.findElement(By.xpath(elmInputEmail)).sendKeys(email);
      waitABit(1000);
  }

  public void sendKeysPasswordInput(String password) {
       driver.findElement(By.xpath(elmInputPassword)).sendKeys(password);
      waitABit(1000);
  }

    public void clickSubmitButton() {
      driver.findElement(By.xpath(elmSubmitButton)).click();
        waitABit(2000);
    }

    public String getTextLoginError() {
     return driver.findElement(By.xpath(elmMessageErrorUnregisteredUser)).getText();

    }
    public void waitABit(long delayInMilliseconds) {
        try {
            Thread.sleep(delayInMilliseconds);
        } catch (InterruptedException ignored) {}
    }

}
