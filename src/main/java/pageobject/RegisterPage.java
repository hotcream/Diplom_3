package pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage {

    public static String url = "https://stellarburgers.nomoreparties.site";
    public static String name = RandomStringUtils.randomAlphabetic(10);
    public static String email = RandomStringUtils.randomAlphabetic(10) + "@yandex.ru";
    public static String password = RandomStringUtils.randomAlphabetic(8);
    public static String shortPassword = RandomStringUtils.randomAlphabetic(5);

    // Поле ввода имени
    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/div/form/fieldset[1]/div/div/input")
    private SelenideElement nameFieldOnRegistrationPage;

    // Поле ввода почты
    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/div/form/fieldset[2]/div/div/input")
    private SelenideElement emailFieldOnRegistrationPage;

    // Поле ввода пароля
    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/div/form/fieldset[3]/div/div/input")
    private SelenideElement passwordFieldOnRegistrationPage;

    // Поле ошибки
    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/div/form/fieldset[3]/div/p")
    private SelenideElement errorFieldOnRegistrationPage;

    // Кнопка зарегистрироваться
    @FindBy(how = How.XPATH, using = ".//button[text()='Зарегистрироваться']")
    private SelenideElement registerButtonOnRegistrationPage;

    // Кнопка логин
    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/div/div/p/a")
    private SelenideElement loginButtonOnRegistrationPage;

    @Step("Заполнение имени")
    public void fillNameFieldOnRegisterPage(String text) {
        nameFieldOnRegistrationPage.shouldBe(Condition.visible);
        nameFieldOnRegistrationPage.sendKeys(text);
    }

    @Step("Заполнение почты")
    public void fillEmailFieldOnRegisterPage(String text) {
        emailFieldOnRegistrationPage.shouldBe(Condition.visible);
        emailFieldOnRegistrationPage.sendKeys(text);
    }

    @Step("Заполнение пароля")
    public void fillPasswordFieldOnRegisterPage(String text) {
        passwordFieldOnRegistrationPage.shouldBe(Condition.enabled);
        passwordFieldOnRegistrationPage.sendKeys(text);
    }

    @Step("Нажатие кнопки регистрации")
    public void pressRegisterButtonOnRegisterPage() {
        registerButtonOnRegistrationPage.shouldBe(Condition.enabled);
        registerButtonOnRegistrationPage.click();
    }

    @Step("Нажатие кнопки логина")
    public void pressLoginButtonOnRegisterPage() {
        loginButtonOnRegistrationPage.shouldBe(Condition.enabled);
        loginButtonOnRegistrationPage.click();
    }

    public SelenideElement getErrorFieldOnRegistrationPage() {
        return errorFieldOnRegistrationPage;
    }
}