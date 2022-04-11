package NEW;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;


public class TEST {
    @Test
    public void check1() {
        Response response = given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet/findByStatus")
                .header("api_key", "api_key")
                .queryParam("status", "pending")
                .header("Accept", "application/json")
                .header("Content-Type", "application/json;;charset=UTF-8")
                .header("Accept-Tncoding", "gzip, deflate,br")
                .when()
                .get()
                .then()
                .extract().response();
        assertEquals(200, response.getStatusCode(), "Status code " + response.getStatusCode());
        System.out.println(response.statusCode());
    }}



