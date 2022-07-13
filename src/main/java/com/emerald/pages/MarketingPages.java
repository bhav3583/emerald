package com.emerald.pages;

import com.emerald.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class MarketingPages extends Utility {
    private static final Logger log = LogManager.getLogger(MarketingPages.class.getName());

    public MarketingPages() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Last month')]")
    WebElement month;

    @FindBy(xpath = "//a[contains(text(),'Last week')]")
    WebElement week;

    //@FindBy(xpath = "//div[@id='cookies-consent']/div/div/div/div/div[2]/button[1]")
    @FindBy(xpath = "//div[@id='cookies-consent']/div/div/div/div/div[2]/button[1]/span")
    WebElement accept;

    @FindBy(xpath = "//div[@class='row align-items-center']//div[@class='btn-group']/a[2]")
    WebElement page20;

    @FindBy(xpath = "//span[@class='intent_publication_date font-weight-normal']")
    List<WebElement> publicationDate;

    public void clickOnAcceptButton() {
        clickOnElement(accept);
    }

    public void clickOnLastMonthLink() {
        waitForElementWithFluentWait(By.xpath("//a[contains(text(),'Last month')]"), 10, 2);
        clickOnElement(month);
    }

    public void clickOnPerPage20() {
        clickOnElement(page20);
    }

    public void VerifyPublicationByMonth() throws ParseException {
        String timeStamp = new SimpleDateFormat("dd MMMM yyyy").format(Calendar.getInstance().getTime());
        System.out.println(timeStamp);

        List<String>dateList=new LinkedList<>();
        for (WebElement date : publicationDate) {
            dateList.add(date.getText());
        }
        System.out.println(dateList);

    }

    public void clickOnLastWeekLink() {
        clickOnElement(week);
    }

    public void verifyPublicationByWeek() {
        List<String> beforeList = new LinkedList<>();
        for (WebElement week : publicationDate) {
            beforeList.add(week.getText());
        }
        System.out.println(beforeList);
        clickOnElement(week);

        List<WebElement>afterList=new LinkedList<>();
        for(WebElement a:publicationDate){
            afterList.add(a);
            System.out.println(afterList);
        }

        Assert.assertEquals(beforeList,afterList);

    }

}


