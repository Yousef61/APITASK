package ApiPackage;

import io.restassured.RestAssured;

public class Configuration {
    public static final String BASE_URI = "https://cat-fact.herokuapp.com";

    static {
        RestAssured.baseURI = BASE_URI;
}

}
