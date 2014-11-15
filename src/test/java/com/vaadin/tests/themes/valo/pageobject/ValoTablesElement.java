package com.vaadin.tests.themes.valo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.vaadin.testbench.elements.CheckBoxElement;
import com.vaadin.testbench.elements.TableElement;
import com.vaadin.testbench.elements.TreeTableElement;

public class ValoTablesElement extends AbstractValoUIElement {

    public CheckBoxElement hierarchical;
    public CheckBoxElement footer;
    public CheckBoxElement sized;
    public CheckBoxElement expandRatios;
    public CheckBoxElement stripes;
    public CheckBoxElement verticalLines;
    public CheckBoxElement horizontalLines;
    public CheckBoxElement borderless;
    public CheckBoxElement headers;
    public CheckBoxElement compact;
    public CheckBoxElement small;
    public CheckBoxElement rowIndex;
    public CheckBoxElement rowCaption;
    public CheckBoxElement rowIcon;
    public CheckBoxElement componentsInCells;

    @FindBy(className = "v-table")
    public TableElement table;

    @FindBy(className = "v-treetable")
    public TreeTableElement treeTable;

    public ValoTablesElement(WebDriver driver) {
        super(driver);
    }

}
