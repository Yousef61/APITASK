import ApiPackage.ApiPage;
import ApiPackage.Configuration;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CATAPI {
    String catFact;
    @BeforeClass
    public void setup() {
        Configuration config = new Configuration();
    }

    @Test
    public void testRandomCatFact() {

        Response response = ApiPage.getRandomCatFact();

        catFact = response.jsonPath().getString("text");

        Assert.assertFalse(catFact.isEmpty(), "Cat fact text should not empty");

        System.out.println("Random Cat Fact: " + catFact);
}

}

