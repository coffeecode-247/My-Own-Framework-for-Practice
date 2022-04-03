package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchPage {
    public WikiSearchPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "searchInput")
    public WebElement wikiSearchBox;
    //In here: we don't need to create "search box" web element to be clicked,
    //because, "Keys.ENTER" has already taken care of that function.

    @FindBy(id = "firstHeading")
    public WebElement mainHeaderAfterSearch;

    @FindBy(className = "fn")
    public WebElement imageHeaderAfterSearch;

}