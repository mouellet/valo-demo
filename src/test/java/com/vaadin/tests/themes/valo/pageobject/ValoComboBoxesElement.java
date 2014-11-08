package com.vaadin.tests.themes.valo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.vaadin.testbench.elements.ComboBoxElement;

public class ValoComboBoxesElement extends AbstractValoUIElement {

    @FindBy(id = "normal-combobox")
    public ComboBoxElement normal;

    @FindBy(id = "grouped-combobox")
    public ComboBoxElement grouped;

    @FindBy(id = "explicit-size-combobox")
    public ComboBoxElement explicitSize;

    @FindBy(id = "no-text-input-allowed-combobox")
    public ComboBoxElement noTextInputAllowed;

    @FindBy(id = "error-combobox")
    public ComboBoxElement error;

    @FindBy(id = "error-borderless-combobox")
    public ComboBoxElement errorBorderless;

    @FindBy(id = "disabled-combobox")
    public ComboBoxElement disabled;

    @FindBy(id = "custom-color1-combobox")
    public ComboBoxElement customColor1;

    @FindBy(id = "custom-color2-combobox")
    public ComboBoxElement customColor2;

    @FindBy(id = "custom-color3-combobox")
    public ComboBoxElement customColor3;

    @FindBy(id = "huge-combobox")
    public ComboBoxElement huge;

    @FindBy(id = "large-combobox")
    public ComboBoxElement large;

    @FindBy(id = "small-combobox")
    public ComboBoxElement small;

    @FindBy(id = "tiny-combobox")
    public ComboBoxElement tiny;

    @FindBy(id = "borderless-combobox")
    public ComboBoxElement borderless;

    public ValoComboBoxesElement(WebDriver driver) {
        super(driver);
    }

}
