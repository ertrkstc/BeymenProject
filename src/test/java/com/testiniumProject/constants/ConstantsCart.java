package com.testiniumProject.constants;

import org.openqa.selenium.By;

public class ConstantsCart {
    public static final By productBasketPrice = By.cssSelector(".m-orderSummary__calculate > li:nth-of-type(1) > .m-orderSummary__value");
    public static final By productQuantity = By.cssSelector("div.m-basket__quantity");
    public static final By quantityOptionTwo = By.cssSelector("div.m-basket__quantity > div > select > option[value='2']");
    public static final By removeItem = By.cssSelector(".m-basket__remove");
}
