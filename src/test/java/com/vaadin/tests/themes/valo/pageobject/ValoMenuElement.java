package com.vaadin.tests.themes.valo.pageobject;

import org.openqa.selenium.support.FindBy;

import com.vaadin.testbench.elements.ButtonElement;
import com.vaadin.testbench.elements.CssLayoutElement;
import com.vaadin.testbench.elements.MenuBarElement;

public class ValoMenuElement extends CssLayoutElement {

    @FindBy(className = "v-menubar-user-menu")
    private MenuBarElement settings;

    private ButtonElement commonParts;
    private ButtonElement labels;
    private ButtonElement buttonsAndLinks;
    private ButtonElement textfields;
    private ButtonElement datefields;
    private ButtonElement comboboxes;
    private ButtonElement selects;
    private ButtonElement checkboxes;
    private ButtonElement sliders;
    private ButtonElement colorpickers;
    private ButtonElement menubars;
    private ButtonElement trees;
    private ButtonElement tables;
    private ButtonElement dragging;
    private ButtonElement panels;
    private ButtonElement splitpanels;
    private ButtonElement tabs;
    private ButtonElement accordions;
    private ButtonElement popupviews;
    private ButtonElement forms;

    public void click(Class<? extends AbstractValoUIElement> link) {
        if (ValoCommonPartsElement.class.isAssignableFrom(link)) {
            commonParts.focus();
            commonParts.click();

        } else if (ValoLabelsElement.class.isAssignableFrom(link)) {
            labels.focus();
            labels.click();

        } else if (ValoTextFieldsElement.class.isAssignableFrom(link)) {
            textfields.focus();
            textfields.click();

        } else if (ValoComboBoxesElement.class.isAssignableFrom(link)) {
            comboboxes.focus();
            comboboxes.click();

        } else if (ValoTablesElement.class.isAssignableFrom(link)) {
            tables.focus();
            tables.click();

        } else if (ValoPanelsElement.class.isAssignableFrom(link)) {
            panels.focus();
            panels.click();
        }
    }

}
