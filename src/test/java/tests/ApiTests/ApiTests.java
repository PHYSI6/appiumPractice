package tests.ApiTests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static specs.Specs.REQ_SPEQ;

@DisplayName("API tests Wikipedia")
public class ApiTests {

    @DisplayName("Get wiki topic")
    @Owner("Daniil Borisevich")
    @Test
    public void getWikiTopic(){
        given()
                .spec(REQ_SPEQ)
                .when().get("action=query&prop=extracts&exlimit=1&titles=appium&explaintext=1&exsectionformat=plain&format=json")
                .then()
                .statusCode(200);
    }
}
