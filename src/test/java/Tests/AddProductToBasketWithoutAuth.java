package Tests;

import PageObjectModels.BasketPageObjectModel;
import PageObjectModels.HomePageObjectModel;
import PageObjectModels.ProductDetailPageObjectModel;
import PageObjectModels.ProductsPageObjectModel;
import WebElements.SearchBox;
import org.testng.annotations.Test;

public class AddProductToBasketWithoutAuth extends BaseTest{

     HomePageObjectModel homePage;
     ProductsPageObjectModel productsPage;
     ProductDetailPageObjectModel productDetailPage;

     BasketPageObjectModel basketPage;


     @Test
     void homePageTests(){

         homePage = new HomePageObjectModel(driver,new SearchBox(driver));

         homePage.acceptCookies();

         homePage.isOnHomePage();

         homePage.getSearchBox().search();

     }

     @Test
     void productsPageTests(){

         productsPage = new ProductsPageObjectModel(driver);

         productsPage.selectProduct();

     }

     @Test
     void  productDetailPageTests(){

         productDetailPage = new ProductDetailPageObjectModel(driver);

         productDetailPage.hasProductTwoAndMoreSeller();


     }

    @Test
    void  basketPageTests(){

        basketPage = new BasketPageObjectModel(driver);

        basketPage.getNumberOfProducts();


    }


}
