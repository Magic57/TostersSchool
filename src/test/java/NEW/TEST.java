package NEW;
import io.restassured.response.Response;
import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;


public class TEST {
    @Test
    public void check1(){
        Response response = given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/store/order/5")
                .header("api_key", "api_key")
                .header("Accept", "application/json")
                .header("Content-Type","application/json;;charset=UTF-8")
                .when()
                .get ()
                .then()
                .extract().response();
        System.out.println(response.statusCode());
        System.out.println(response.getBody().asString());
    }
}

