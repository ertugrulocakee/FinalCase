package PageObjectModels;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class BasketPageObjectModel extends BasePageObjectModel{

    private final By itemCountLabel = By.xpath("//div[@class='container_HX1zs']/input");

    private  final  By emptyBasketArea = By.xpath("//div[@class='content_Z9h8v']/h1");
    private final By basketCountLabel = By.id("basket-item-count");

    public BasketPageObjectModel(WebDriver webDriver) {
        super(webDriver);
    }


    public boolean getNumberOfProducts(){


        try {

            if(isDisplayed(emptyBasketArea)){

                return  true;

            }

        }catch (NoSuchElementException exception) {

            System.out.println("The basket isn't empty!");

        }

                System.out.println(findElement(basketCountLabel).getText());
                System.out.println(findElement(itemCountLabel).getAttribute("value"));

                int count1 = Integer.parseInt(findElement(basketCountLabel).getText());
                int count2 = Integer.parseInt(findElement(itemCountLabel).getAttribute("value"));

                if( count1 == 2 || count2 == 2){

                    return true;

                }


        return false;

    }


}
