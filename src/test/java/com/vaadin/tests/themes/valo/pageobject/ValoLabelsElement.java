package com.vaadin.tests.themes.valo.pageobject;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.vaadin.testbench.elements.LabelElement;

public class ValoLabelsElement extends AbstractValoUIElement {

    @FindBy(className = "v-label-h1")
    private LabelElement h1;

    @FindBy(className = "v-label-h2")
    private LabelElement h2;

    @FindBy(className = "v-label-h3")
    private LabelElement h3;

    @FindBy(className = "v-label-h4")
    private LabelElement h4;

    @FindBy(className = "v-label-huge")
    private LabelElement huge;

    @FindBy(className = "v-label-large")
    private LabelElement large;

    @FindBy(className = "v-label-normal")
    private LabelElement normal;

    @FindBy(className = "v-label-small")
    private LabelElement small;

    @FindBy(className = "v-label-tiny")
    private LabelElement tiny;

    @FindBy(className = "v-label-bold")
    private LabelElement bold;

    @FindBy(className = "v-label-light")
    private LabelElement light;

    @FindBy(className = "v-label-colored")
    private LabelElement colored;

    @FindBy(className = "v-label-success")
    private LabelElement success;

    @FindBy(className = "v-label-failure")
    private LabelElement failure;

    public void checkLabelValue() {
        assertEquals("Huge type for display text.", huge.getText());
    }

    public ValoLabelsElement(WebDriver driver) {
        super(driver);
    }

}
