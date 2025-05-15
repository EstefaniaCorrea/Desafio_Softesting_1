package steps;

import io.cucumber.java.en.*;
import pages.AmazonSearchPages;

public class AmazonSearchSteps {

    private AmazonSearchPages AmazonPage = new AmazonSearchPages();

 @Given ("^The user navigates to https://www.amazon.com/$")
    public void navegateToAmazon (){
        AmazonPage.navegateTo();
        AmazonPage.espera();
    }

}
