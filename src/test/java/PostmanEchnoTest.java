import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchnoTest {

    @Test
    void shouldReturnSendData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Hi")
                .when()
                .post ("/post")
                .then()
                .statusCode(300)
                .body("data", equalTo("Hi"));
    }


}
