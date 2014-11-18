package com.vaadin.tests.themes.valo.pageobject;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.vaadin.testbench.elements.TextAreaElement;
import com.vaadin.testbench.elements.TextFieldElement;
import com.vaadin.testbench.elementsbase.ServerClass;

@ServerClass("com.vaadin.ui.VerticalLayout")
public class ValoTextFieldsElement extends AbstractValoUIElement {

    @FindBy(className = "v-textfield")
    public List<TextFieldElement> textFields;

    @FindBy(className = "v-textarea")
    public List<TextAreaElement> textAreas;

    public void checkTextFields() {
        assertFalse(textFields.isEmpty());
    }

    public ValoTextFieldsElement(WebDriver driver) {
        super(driver);
    }

}
