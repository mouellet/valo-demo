package com.vaadin.tests.themes.valo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.vaadin.testbench.TestBenchTestCase;
import com.vaadin.testbench.elements.ButtonElement;
import com.vaadin.testbench.elements.MenuBarElement;
import com.vaadin.testbench.support.TestBenchPageFactory;

public abstract class AbstractValoUIElement extends TestBenchTestCase {

    @FindBy(className = "v-menubar-user-menu")
    protected MenuBarElement settings;

    @FindBy(id = "common")
    protected ButtonElement commonParts;

    @FindBy(id = "labels")
    protected ButtonElement labels;

    @FindBy(id = "buttons-and-links")
    protected ButtonElement buttonsLinks;

    @FindBy(id = "testfields")
    protected ButtonElement testfields;

    @FindBy(id = "datefields")
    protected ButtonElement datefields;

    @FindBy(id = "comboboxes")
    protected ButtonElement comboboxes;

    @FindBy(id = "selects")
    protected ButtonElement selects;

    @FindBy(id = "checkboxes")
    protected ButtonElement checkboxes;

    @FindBy(id = "sliders")
    protected ButtonElement sliders;

    @FindBy(id = "colorpickers")
    protected ButtonElement colorpickers;

    @FindBy(id = "menubars")
    protected ButtonElement menubars;

    @FindBy(id = "trees")
    protected ButtonElement trees;

    @FindBy(id = "tables")
    protected ButtonElement tables;

    @FindBy(id = "dragging")
    protected ButtonElement dragging;

    @FindBy(id = "panels")
    protected ButtonElement panels;

    @FindBy(id = "splitpanels")
    protected ButtonElement splitpanels;

    @FindBy(id = "tabs")
    protected ButtonElement tabs;

    @FindBy(id = "accordions")
    protected ButtonElement accordions;

    @FindBy(id = "popupviews")
    protected ButtonElement popupviews;

    @FindBy(id = "forms")
    protected ButtonElement forms;

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
