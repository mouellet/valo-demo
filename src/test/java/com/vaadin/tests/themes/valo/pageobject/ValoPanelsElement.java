package com.vaadin.tests.themes.valo.pageobject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.vaadin.testbench.elements.ButtonElement;
import com.vaadin.testbench.elements.PanelElement;
import com.vaadin.testbench.support.FindByVaadin;

public class ValoPanelsElement extends AbstractValoUIElement {

    @FindByVaadin(caption = "Sized")
    private PanelElement sized;

    @FindByVaadin(vaadinSelector = "//com.vaadin.ui.Panel[caption=\"Sized\"]//com.vaadin.ui.Button")
    private ButtonElement button;

    public void clickButtonInSizedPanel() {
        assertTrue(button.getSize().getWidth() >= 130);
        button.click();
    }

    public ValoPanelsElement(WebDriver driver) {
        super(driver);
    }

}
