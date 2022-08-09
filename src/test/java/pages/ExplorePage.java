package pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.assertj.core.api.Assertions.assertThat;

public class ExplorePage {
    private final SelenideElement searchContainer = $(AppiumBy.id("org.wikipedia.alpha:id/search_container"));
    private final SelenideElement searchField = $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text"));
    private final List<SelenideElement> listOfSearchResults = $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"));

    @Step("Click \"Search Wikipedia\" field")
    public ExplorePage clickSearchContainer() {
        searchContainer.click();

        return this;
    }

    @Step("Input \"{0}\" into search field")
    public ExplorePage inputTextIntoSearchField(String text) {
        searchField.sendKeys(text);
        return this;
    }

    @Step("Verify content found")
    public SearchResultPage verifyContentFound() {
        assertThat(listOfSearchResults.size()).isGreaterThan(0);

        return new SearchResultPage();
    }
}
