package com.Isagri.pages;

import com.Isagri.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PigUp {

    public PigUp() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(css = "body > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1) > a:nth-child(1)")
    public WebElement bookDemoButton;

    @FindBy(xpath = "//input[@id='lastname-d42b6386-a82c-451b-a6b3-e5b9f5d4655e_7215']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='firstname-d42b6386-a82c-451b-a6b3-e5b9f5d4655e_7215']")
    public WebElement firstName;

    @FindBy(css = "#company-d42b6386-a82c-451b-a6b3-e5b9f5d4655e_7215")
    public WebElement companyName;

    @FindBy(xpath = "//input[@id='email-d42b6386-a82c-451b-a6b3-e5b9f5d4655e_7215']")
    public WebElement email;

    @FindBy(id = "phone-d42b6386-a82c-451b-a6b3-e5b9f5d4655e_7215")
    public WebElement phone;

    @FindBy(id = "country-d42b6386-a82c-451b-a6b3-e5b9f5d4655e_7215")
    public WebElement country;

    @FindBy(xpath = "//input[@id='how_many_sows_do_you_have_-d42b6386-a82c-451b-a6b3-e5b9f5d4655e_7215']")
    public WebElement quantity;

    @FindBy(id = "message-d42b6386-a82c-451b-a6b3-e5b9f5d4655e_7215")
    public WebElement message;

    @FindBy(xpath = "//input[@value='SUBMIT']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"hs_cos_wrapper_module_163880002567897_\"]/p[1]")
    public WebElement conformationMessage;

}
