package com.cybertek.step_definitions;

import com.cybertek.pages.WikiSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikiStepDefinitions {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on the Wikipedia home page")
    public void user_is_on_the_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }

    @When("User searches {string} in the wiki search page")
    public void user_searches_in_the_wiki_search_page(String string) {
        wikiSearchPage.wikiSearchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("User should see {string} in the wiki title")
    public void user_should_see_in_the_wiki_title(String expectedInTitle) {

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    @Then("User should see {string} in the main header")
    public void userShouldSeeInTheMainHeader(String expected) {

        String actualHeaderText = wikiSearchPage.mainHeaderAfterSearch.getText();

        Assert.assertEquals(actualHeaderText, expected);
    }

    /**
     * @param: expectedHeader: this is coming from the feature file, therefore
     * no need to create a string object for the expected header:
     */
    @Then("User should see {string} in the image header")
    public void userShouldSeeInTheImageHeader(String expectedHeader) throws InterruptedException {

        //This is the actual header text from the image header.
        String actualHeader = wikiSearchPage.imageHeaderAfterSearch.getText();
        Thread.sleep(2000);

        Assert.assertEquals(actualHeader, expectedHeader);
    }
}
