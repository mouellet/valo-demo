package com.vaadin.tests.themes.valo.pageobject;

import static org.junit.Assert.assertFalse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.vaadin.testbench.elements.ComboBoxElement;
import com.vaadin.testbench.support.FindByVaadin;

public class ValoComboBoxesElement extends AbstractValoUIElement {

    @FindBy(id = "normal-combobox")
    private ComboBoxElement normal;

    @FindBy(id = "grouped-combobox")
    private ComboBoxElement grouped;

    @FindBy(id = "explicit-size-combobox")
    private ComboBoxElement explicitSize;

    @FindBy(id = "no-text-input-allowed-combobox")
    private ComboBoxElement noTextInputAllowed;

    @FindBy(id = "error-combobox")
    private ComboBoxElement error;

    @FindBy(id = "error-borderless-combobox")
    private ComboBoxElement errorBorderless;

    @FindBy(id = "disabled-combobox")
    private ComboBoxElement disabled;

    @FindBy(id = "custom-color1-combobox")
    private ComboBoxElement customColor1;

    @FindBy(id = "custom-color2-combobox")
    private ComboBoxElement customColor2;

    @FindBy(id = "custom-color3-combobox")
    private ComboBoxElement customColor3;

    @FindByVaadin(caption = "Huge")
    private ComboBoxElement huge;

    @FindBy(id = "large-combobox")
    private ComboBoxElement large;

    @FindBy(id = "small-combobox")
    private ComboBoxElement small;

    @FindBy(id = "tiny-combobox")
    private ComboBoxElement tiny;

    @FindBy(id = "borderless-combobox")
    private ComboBoxElement borderless;

    public void checkDisabledIsNotEnabled() {
        assertFalse(disabled.isEnabled());
    }

    public ValoComboBoxesElement(WebDriver driver) {
        super(driver);
    }

}
