package com.vaadin.tests.themes.valo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.vaadin.testbench.TestBenchTestCase;
import com.vaadin.testbench.elements.ButtonElement;
import com.vaadin.testbench.support.FindByVaadin;
import com.vaadin.testbench.support.TestBenchPageFactory;

public abstract class AbstractValoUIElement extends TestBenchTestCase {

    @FindBy(id = "testMenu")
    private ValoMenuElement menu = new ValoMenuElement();

    @FindByVaadin(caption = "Menu")
    private ButtonElement menuButton;

    public AbstractValoUIElement(WebDriver driver) {
        setDriver(driver);
    }

    public <T extends AbstractValoUIElement> T navigateTo(Class<T> link) {
        if (getDriver().manage().window().getSize().getWidth() < 800) {
            menuButton.click();
        }

        TestBenchPageFactory.initElements(getDriver(), menu);
        menu.click(link);
        return TestBenchPageFactory.initElements(getDriver(), link);
    }

}
