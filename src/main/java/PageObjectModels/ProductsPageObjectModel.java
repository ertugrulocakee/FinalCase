package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ProductsPageObjectModel extends BasePageObjectModel{

    private  final By productItem = new By.ByCssSelector("li.productListContent-zAP0Y5msy8OHn5z7T_K_");

    public  static  String parent;

    public ProductsPageObjectModel(WebDriver webDriver) {
        super(webDriver);
    }

    private List<WebElement> getAllProducts(){

        return findAllElements(productItem);

    }


    public void selectProduct() {

        averageStop();

        averageScrollDown();


        Random r = new Random();
        int number = r.nextInt(getAllProducts().size());

        getAllProducts().get(number).click();

        averageStop();

         // It will return the parent window name as a String
         parent=driver.getWindowHandle();

        Set<String>s=driver.getWindowHandles();

         // Now iterate using Iterator
        Iterator<String> I1= s.iterator();

        while(I1.hasNext())
        {

            String child_window=I1.next();


            if(!parent.equals(child_window))
            {


                driver.switchTo().window(child_window);

                System.out.println(driver.switchTo().window(child_window).getTitle());


            }

        }


         longStop();


    }


}
