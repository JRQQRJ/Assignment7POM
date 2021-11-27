package com.Swaglab.Pages;

import com.automationbytarun.components.BaseActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SwagLabsCart extends BaseActions {

        WebDriver driver;

        public SwagLabsCart(WebDriver driver){
             super(driver);
             this.driver=driver;
         }

        public SwagLabsCart checkPoint3() {
            Assert.assertTrue(driver.getPageSource().contains("Sauce Labs Backpack"));
            Assert.assertTrue(driver.getPageSource().contains("Sauce Labs Fleece Jacket"));
            return this;
        }

    public SwagLabsCart checkOut() throws InterruptedException {

            clickIt("SwagLabsCart.btn_CheckOut");
        Thread.sleep(3000);
        return this;
    }


    }


