package tests.UiTests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.WelcomePage;

@Tag("android")
@DisplayName("Search tests")
public class SearchTests extends BaseTest {
    WelcomePage welcomePage = new WelcomePage();
    @DisplayName("Search test")
    @Owner("Daniil Borisevich")
    @ParameterizedTest
    @ValueSource(strings = {"Appium", "Java"})
    void searchTest(String text) {
        welcomePage
                .checkIfPageIsOpen()
                .clickSkipButton()
                .clickSearchContainer()
                .inputTextIntoSearchField(text)
                .verifyContentFound();
    }

    @DisplayName("Search and select item test")
    @Owner("Daniil Borisevich")
    @ParameterizedTest
    @ValueSource(strings = {"Appium", "Java"})
    void searchAndSelectItemTest(String text) {
        welcomePage
                .checkIfPageIsOpen()
                .clickSkipButton()
                .clickSearchContainer()
                .inputTextIntoSearchField(text)
                .verifyContentFound()
                .clickFirstElement()
                .clickSearchContainer(text);
    }

}