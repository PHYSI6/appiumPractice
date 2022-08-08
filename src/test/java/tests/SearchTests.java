package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.WelcomePage;

@Tag("android")
@DisplayName("Search tests")
public class SearchTests extends BaseTest {
    WelcomePage welcomePage = new WelcomePage();
    @DisplayName("Search test")
    @Test
    void searchTest() {
        welcomePage
                .checkIfPageIsOpen()
                .clickSkipButton()
                .clickSearchContainer()
                .inputTextIntoSearchField("Appium")
                .verifyContentFound();
    }

}