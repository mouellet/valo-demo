package com.vaadin.tests.themes.valo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.vaadin.testbench.elements.CheckBoxElement;
import com.vaadin.testbench.elements.TableElement;
import com.vaadin.testbench.elements.TreeTableElement;

public class ValoTablesElement extends AbstractValoUIElement {

    @FindBy(id = "hierarchical")
    public CheckBoxElement hierarchical;

    @FindBy(id = "footer")
    public CheckBoxElement footer;

    @FindBy(id = "sized")
    public CheckBoxElement sized;

    @FindBy(id = "expandRatios")
    public CheckBoxElement expandRatios;

    @FindBy(id = "stripes")
    public CheckBoxElement stripes;

    @FindBy(id = "verticalLines")
    public CheckBoxElement verticalLines;

    @FindBy(id = "horizontalLines")
    public CheckBoxElement horizontalLines;

    @FindBy(id = "borderless")
    public CheckBoxElement borderless;

    @FindBy(id = "headers")
    public CheckBoxElement headers;

    @FindBy(id = "compact")
    public CheckBoxElement compact;

    @FindBy(id = "small")
    public CheckBoxElement small;

    @FindBy(id = "rowIndex")
    public CheckBoxElement rowIndex;

    @FindBy(id = "rowCaption")
    public CheckBoxElement rowCaption;

    @FindBy(id = "rowIcon")
    public CheckBoxElement rowIcon;

    @FindBy(id = "componentsInCells")
    public CheckBoxElement componentsInCells;

    @FindBy(className = "v-table")
    public TableElement table;

    @FindBy(className = "v-treetable")
    public TreeTableElement treeTable;

    public ValoTablesElement(WebDriver driver) {
        super(driver);
    }

}
