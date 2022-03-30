package autotests.tests.api;

import autotests.config.App;
import autotests.helpers.AllureRestAssuredFilter;
import autotests.models.Credentials;
import autotests.tests.BaseTest;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@Story("API login tests")
public class LoginTests extends BaseTest {

    @BeforeAll
    static void configureBaseUrl() {
        RestAssured.baseURI = App.config.selfServeApiUrl();
    }

    @Test
    @Tag("api")
    @DisplayName("Authorization with not existing account to self-serve")
    void notExistingAccountLoginTest() {
        Credentials credentials = new Credentials();
        credentials.setEmail("notExistingEmail@qa.guru");
        credentials.setPassword("r@ndomP@$$w0rd");

        given()
                .filter(AllureRestAssuredFilter.withCustomTemplates())
                .contentType(ContentType.JSON)
                .body(credentials)
                .when()
                .post("/self-serve-user/login")
                .then()
                .assertThat()
                .statusCode(401)
                .body("message", equalTo("This account doesn’t exist. Please contact your Turing Account Executive for assistance"))
                .body("method", equalTo("POST"))
                .body("path", equalTo("/api/self-serve-user/login"))
                .body("statusCode", equalTo(401));
    }
}
