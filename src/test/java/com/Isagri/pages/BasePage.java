package com.Isagri.pages;

import com.Isagri.utility.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);


    }




}
