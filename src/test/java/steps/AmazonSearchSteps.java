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

    @And ("^searches for (.*)$")
    public void buscarProducto(String producto){
        AmazonPage.buscarProducto(producto);
    }
    
    @And ("^navigates to the second pages$")
         public void navegarPagina2(){
            AmazonPage.irPagina();
        }

 }

