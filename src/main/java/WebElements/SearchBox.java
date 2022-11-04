package WebElements;

import PageObjectModels.BasePageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePageObjectModel {

    private final By searchInputField = new By.ByCssSelector("input.desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b");

    private  final By searchButton = new By.ByCssSelector("div.SearchBoxOld-cHxjyU99nxdIaAbGyX7F");


    public SearchBox(WebDriver webDriver) {
        super(webDriver);
    }


    public  void search(){

        select(searchInputField);
        write(searchInputField,"bilgisayar");
        select(searchButton);

    }


}
