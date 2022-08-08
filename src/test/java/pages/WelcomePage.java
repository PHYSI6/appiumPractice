package pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WelcomePage{
    private final SelenideElement skipButton = $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button"));

    @Step("Verify that page is open")
    public WelcomePage checkIfPageIsOpen(){
        assertTrue(skipButton.isDisplayed());

        return this;
    }
    @Step("Click \"Skip\" button")
    public ExplorePage clickSkipButton(){
        skipButton.click();

        return new ExplorePage();
    }
}
