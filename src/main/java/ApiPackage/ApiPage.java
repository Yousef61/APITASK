package ApiPackage;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class ApiPage {
    public static Response getRandomCatFact() {
        return RestAssured
                .given()
                .when()
                .get("/facts/random")
                .then()
                .statusCode(200)
                .extract()
                .response();
    }

}
