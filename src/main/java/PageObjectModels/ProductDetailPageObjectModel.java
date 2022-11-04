package PageObjectModels;

import org.openqa.selenium.*;

import java.util.List;


public class ProductDetailPageObjectModel extends BasePageObjectModel {

    private  final By showAllSellerArea = By.xpath("//div[@class='title-area']/a");

    private  final By addProductButton = By.id("addToCart");

    private  final By goToBasket = By.xpath("//div[@class='checkoutui-ProductOnBasketHeader-zdTSacusLu4Cu0LDpmnB']/button");

    private  final By productInBasket = By.xpath("//div[@class='product_name_3Lh3t']/a");

    private  final  By toast = new By.ByCssSelector("a.hb-toast-link");

    private  final  By basket = By.id("shoppingCart");


    private  final  By addButtons = new By.ByCssSelector("button.add-to-basket.button.small");


    public ProductDetailPageObjectModel(WebDriver webDriver) {
        super(webDriver);
    }

    public  void  hasProductTwoAndMoreSeller(){


          longScrollDown();

          try{

              if(isDisplayed(showAllSellerArea)) {


                      getAllButtons().get(0).click();

                      longStop();

                      longStop();

                      longStop();

                      try{

                          if(isDisplayed(goToBasket)) {


                              select(goToBasket);

                              longStop();

                              select(productInBasket);

                              longScrollDown();

                              getAllButtons().get(0).click();

                              longStop();

                              longStop();

                              longStop();

                              select(goToBasket);

                              longStop();


                          }

                      }catch (NoSuchElementException exception){

                          longStop();

                          if(getAllButtons().size() == 1){

                              select(addProductButton);

                          }else{


                              getAllButtons().get(1).click();


                          }

                          averageStop();

                          select(toast);

                          averageStop();


                      }

              }else{

                  longScrollUp();

                  select(basket);

              }

          }catch (NoSuchElementException exception){

              System.out.println("There is only one seller for this product!");

          }

    }

    private List<WebElement> getAllButtons(){

        return findAllElements(addButtons);

    }

}
