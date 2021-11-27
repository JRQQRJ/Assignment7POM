package com.Swaglab.Pages;

import com.automationbytarun.components.BaseActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SwagLabsCheckout extends BaseActions {

        WebDriver driver;

         public SwagLabsCheckout(WebDriver driver){
             super(driver);
             this.driver=driver;
        }

        public SwagLabsCheckout checkPoiny4() throws InterruptedException {
            String shippingInfo = getTextFromElement("SwagLabsCheckout.shippingInfo") ;
            Assert.assertEquals(shippingInfo,"FREE PONY EXPRESS DELIVERY!", "Invalid Shipping Information");
            String paymentInfo = getTextFromElement("SwagLabsCheckout.paymentInfo") ;
            Assert.assertEquals(paymentInfo,"SauceCard #31337", "Invalid Payment Information");
            String item1Price = getTextFromElement("SwagLabsCheckout.item1Price") ;
            System.out.println(item1Price);
            Float  itemPrice1 = Float.valueOf(item1Price.substring(1,6));
            String item2Price = getTextFromElement("SwagLabsCheckout.item2Price") ;
            Float  itemPrice2 = Float.valueOf(item2Price.substring(1,6));
            String itemTotalPrice = getTextFromElement("SwagLabsCheckout.itemTotalPrice") ;
            Float total = Float.valueOf(itemTotalPrice.substring(13,18));
            return this;

        }

        public SwagLabsCheckout clickFinishButton() throws InterruptedException {

             clickIt("SwagLabsCheckout.btn_finish");
            Thread.sleep(3000);
            return this;
        }

    }


