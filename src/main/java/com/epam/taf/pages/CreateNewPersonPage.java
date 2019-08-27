package com.epam.taf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewPersonPage extends AbstractPage {
    private static final String URL = "http://appellatecmsmssql.demo.int.thomsonreuters.com/ctrack/actor/person.do?action=create";

    @FindBy(id = "lastNm")
    private WebElement personLastName;

    @FindBy(xpath = "//*[@value='Save']")
    private WebElement saveButton;

    public CreateNewPersonPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(URL);
    }

    public void createPerson(String newPersonLastName) {
        personLastName.sendKeys(newPersonLastName);
        saveButton.click();
    }
}
