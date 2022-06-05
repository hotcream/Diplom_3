package pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.*;

public class MainPage {

    public static String url = "https://stellarburgers.nomoreparties.site/";

    // Кнопка входа в аккаунт
    @FindBy(how = How.XPATH, using = ".//button[text()='Войти в аккаунт']")
    private SelenideElement loginButtonOnMainPage;

    // Кнопка оформить заказ
    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/section[2]/div/button")
    private SelenideElement orderButton;

    // Кнопка личный кабинет
    @FindBy(how = How.LINK_TEXT,using = "Личный Кабинет")
    private SelenideElement personalAccountButton;

    // Кнопка начинки
    @FindBy(xpath = "//*[text()='Начинки']")
    private SelenideElement fillingsButton;

    // Кнопка вкладки начинки
    @FindBy(xpath = ".//*[@class='text text_type_main-medium mb-6 mt-10' and text()='Начинки']")
    private SelenideElement fillingsTab;

    // Кнопка соусы
    @FindBy(xpath = "//*[text()='Соусы']")
    private SelenideElement saucesButton;

    // Кнопка вкладки соусы
    @FindBy(xpath = ".//*[@class='text text_type_main-medium mb-6 mt-10' and text()='Соусы']")
    private SelenideElement saucesTab;

    // Кнопка булки
    @FindBy(xpath = ".//*[//*[@id=\"root\"]/div/main/section[1]/div[1]/div[1]/span]")
    private SelenideElement bunsButton;

    // Кнопка вкладки булки
    @FindBy(xpath = ".//*[@class='text text_type_main-medium mb-6 mt-10' and text()='Булки']")
    private SelenideElement bunsTab;

    @Step("Клик по разделу 'Начинки'")
    public void clickFilling() {
        fillingsButton.shouldBe(exist).click();
    }

    @Step("Клик по разделу 'Соусы'")
    public void clickSauces() {
        saucesButton.shouldBe(exist).click();
    }

    @Step("Клик по разделу 'Булки'")
    public void clickBuns() {
        bunsButton.shouldBe(visible).click();
    }

    @Step("Нажатие кнопки входа")
    public void pressLoginButtonOnMainPage(){
        loginButtonOnMainPage.click();
    }

    @Step("Нажатие кнопки личный кабинет")
    public void pressPersonalAccountButton(){
        personalAccountButton.click();
    }

    @Step("Проверка появления кнопки 'создать заказ' на главной странице")
    public SelenideElement getOrderButton(){
        return orderButton;
    }


    public SelenideElement getFillingsTab() {
        return fillingsTab;
    }


    public SelenideElement getSaucesTab() {
        return saucesTab;
    }

    public SelenideElement getBunsTab() {
        return bunsTab;
    }


}