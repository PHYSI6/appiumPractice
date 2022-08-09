package pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class InfoPage {
    private final SelenideElement pageTitle = $(AppiumBy.xpath("(//*[@resource-id='pcs']/android.view.View/android.view.View)[1]"));

    @Step("Select first element in list")
    public InfoPage clickSearchContainer(String expectedText) {
        pageTitle.shouldHave(text(expectedText));

        return this;
    }
}
