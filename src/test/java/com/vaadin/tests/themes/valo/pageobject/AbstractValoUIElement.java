package com.vaadin.tests.themes.valo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.vaadin.testbench.TestBenchTestCase;
import com.vaadin.testbench.elements.ButtonElement;
import com.vaadin.testbench.elements.MenuBarElement;
import com.vaadin.testbench.elements.VerticalLayoutElement;
import com.vaadin.testbench.support.TestBenchPageFactory;

public abstract class AbstractValoUIElement extends TestBenchTestCase {

    @FindBy(className = "valo-content")
    public VerticalLayoutElement content;

    @FindBy(className = "v-menubar-user-menu")
    public MenuBarElement settings;

    @FindBy(id = "common")
    public ButtonElement commonParts;

    @FindBy(id = "labels")
    public ButtonElement labels;

    @FindBy(id = "buttons-and-links")
    public ButtonElement buttonsLinks;

    @FindBy(id = "testfields")
    public ButtonElement testfields;

    @FindBy(id = "datefields")
    public ButtonElement datefields;

    @FindBy(id = "comboboxes")
    public ButtonElement comboboxes;

    @FindBy(id = "selects")
    public ButtonElement selects;

    @FindBy(id = "checkboxes")
    public ButtonElement checkboxes;

    @FindBy(id = "sliders")
    public ButtonElement sliders;

    @FindBy(id = "colorpickers")
    public ButtonElement colorpickers;

    @FindBy(id = "menubars")
    public ButtonElement menubars;

    @FindBy(id = "trees")
    public ButtonElement trees;

    @FindBy(id = "tables")
    public ButtonElement tables;

    @FindBy(id = "dragging")
    public ButtonElement dragging;

    @FindBy(id = "panels")
    public ButtonElement panels;

    @FindBy(id = "splitpanels")
    public ButtonElement splitpanels;

    @FindBy(id = "tabs")
    public ButtonElement tabs;

    @FindBy(id = "accordions")
    public ButtonElement accordions;

    @FindBy(id = "popupviews")
    public ButtonElement popupviews;

    @FindBy(id = "forms")
    public ButtonElement forms;

    public AbstractValoUIElement(WebDriver driver) {
        setDriver(driver);
    }

    public AbstractValoUIElement navigateTo(String link) {
        if ("common".equals(link)) {
            commonParts.click();
            return TestBenchPageFactory.initElements(getDriver(), ValoCommonPartsElement.class);

        } else if ("labels".equals(link)) {
            labels.click();
            return TestBenchPageFactory.initElements(getDriver(), ValoLabelsElement.class);

        } else if ("comboboxes".equals(link)) {
            comboboxes.click();
            return TestBenchPageFactory.initElements(getDriver(), ValoComboBoxesElement.class);

        } else if ("tables".equals(link)) {
            tables.click();
            return TestBenchPageFactory.initElements(getDriver(), ValoTablesElement.class);

        } else {
            return null;
        }
    }

}
