package com.vaadin.tests.themes.valo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.vaadin.testbench.elements.LabelElement;
import com.vaadin.testbench.support.FindByVaadin;

public class ValoLabelsElement extends AbstractValoUIElement {

    @FindBy(className = "v-label-h1")
    public LabelElement h1;

    @FindBy(className = "v-label-h2")
    public LabelElement h2;

    @FindBy(className = "v-label-h3")
    public LabelElement h3;

    @FindBy(className = "v-label-h4")
    public LabelElement h4;

    @FindByVaadin(index = 4)
    public LabelElement huge;

    @FindBy(className = "v-label-large")
    public LabelElement large;

    @FindBy(className = "v-label-normal")
    public LabelElement normal;

    @FindBy(className = "v-label-small")
    public LabelElement small;

    @FindBy(className = "v-label-tiny")
    public LabelElement tiny;

    @FindBy(className = "v-label-bold")
    public LabelElement bold;

    @FindBy(className = "v-label-light")
    public LabelElement light;

    @FindBy(className = "v-label-colored")
    public LabelElement colored;

    @FindBy(className = "v-label-success")
    public LabelElement success;

    @FindBy(className = "v-label-failure")
    public LabelElement failure;

    public ValoLabelsElement(WebDriver driver) {
        super(driver);
    }

}
