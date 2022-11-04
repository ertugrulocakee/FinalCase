package PageObjectModels;

import WebElements.SearchBox;
import org.openqa.selenium.*;

public class HomePageObjectModel extends  BasePageObjectModel{

    private  final  By acceptCookiesButton = By.id("onetrust-accept-btn-handler");

    private  final By loginAreaButton = new By.ByCssSelector("span.sf-OldMyAccount-d0xCHLV38UCH5cD9mOXq");
    private  final By loginOption = By.id("login");

    private  final  By emailTextField = By.id("txtUserName");

    private  final By passwordTextField = By.id("txtPassword");

    private SearchBox searchBox;

    private  final  By loginArea = By.id("myAccount");

    public HomePageObjectModel(WebDriver webDriver,SearchBox searchBox) {
        super(webDriver);
        this.searchBox = searchBox;
    }


    public  void acceptCookies(){

        select(acceptCookiesButton);

    }

    public  boolean isOnHomePage(){

        return isDisplayed(loginArea);

    }

    public SearchBox getSearchBox(){

        return  this.searchBox;

    }

    public void loginWithUser(){

         moveToElement(loginAreaButton);
         select(loginOption);
         averageStop();
         select(emailTextField);
         write(emailTextField,"---Please,Write email here.---");
         enter(emailTextField);
         averageStop();
         write(passwordTextField,"---Please,Write password here.---");
         enter(passwordTextField);
         averageStop();

    }
}
