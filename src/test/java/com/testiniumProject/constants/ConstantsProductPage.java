package com.testiniumProject.constants;

import org.openqa.selenium.By;

public class ConstantsProductPage {
    public static final By productNameAtProductPage = By.cssSelector("h1.o-productDetail__title > span");
    public static final By productPriceAtProductPage = By.cssSelector("ins#priceNew");
    public static final By productSizeNotDisabled = By.cssSelector("div.m-variation > span:not([class='m-variation__item -disabled'])");
    public static final By addBasket = By.cssSelector("button#addBasket");
}
