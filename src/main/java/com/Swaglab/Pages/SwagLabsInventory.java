package com.Swaglab.Pages;

import com.automationbytarun.components.BaseActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SwagLabsInventory extends BaseActions {

        WebDriver driver;
        static int cartTotal=0;

        public SwagLabsInventory(WebDriver driver){
            super(driver);
            this.driver=driver;
        }
        public SwagLabsInventory clickAddToCartItem1() throws InterruptedException {
        clickIt("SwagLabsInventory.btn_SauceLabsBackpack");
        cartTotal=cartTotal+1;
        return this;
        }

        public SwagLabsInventory clickAddToCartItem2() throws InterruptedException {
        clickIt("SwagLabsInventory.btn_SauceLabsFleeceJacket");
        cartTotal=cartTotal+1;
        return this;
    }

        public SwagLabsInventory checkpoint1(){
            String cartItems =getTextFromElement("SwagLabsInventory.icon_cartValue");
            if(cartItems.contains(String.valueOf(cartTotal))) {
            }
            return this;

        }

        public SwagLabsInventory clickOnCartIcon() throws InterruptedException {
            clickIt("SwagLabsInventory.icon_cart");
            return this;
        }




    }


