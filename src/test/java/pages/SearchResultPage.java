package pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage {
    private final SelenideElement firstElementTitle = $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"));

    @Step("Select first element in list")
    public InfoPage clickFirstElement() {
        firstElementTitle.click();

        return new InfoPage();
    }
}
