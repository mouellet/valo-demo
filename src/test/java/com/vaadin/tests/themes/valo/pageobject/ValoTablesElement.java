package com.vaadin.tests.themes.valo.pageobject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.elements.CheckBoxElement;
import com.vaadin.testbench.elements.TableElement;
import com.vaadin.testbench.elements.TableRowElement;
import com.vaadin.testbench.elements.TreeTableElement;
import com.vaadin.testbench.support.FindByVaadin;

public class ValoTablesElement extends AbstractValoUIElement {

    private CheckBoxElement hierarchical;
    private CheckBoxElement footer;
    private CheckBoxElement sized;
    private CheckBoxElement expandRatios;
    private CheckBoxElement stripes;
    private CheckBoxElement verticalLines;
    private CheckBoxElement horizontalLines;
    private CheckBoxElement borderless;
    private CheckBoxElement headers;
    private CheckBoxElement compact;
    private CheckBoxElement small;
    private CheckBoxElement rowIndex;
    private CheckBoxElement rowCaption;
    private CheckBoxElement rowIcon;
    private CheckBoxElement componentsInCells;

    // @FindBy(className = "v-table")
    @FindByVaadin
    private TableElement table;

    @FindBy(className = "v-treetable")
    private TreeTableElement treeTable;

    public void checkDefaultValues() {
        assertTrue("checked".equals(stripes.getValue()));
        assertTrue("checked".equals(verticalLines.getValue()));
        assertTrue("checked".equals(horizontalLines.getValue()));
        assertTrue("checked".equals(headers.getValue()));
    }

    public int getRowCount() {
        return table.findElements(By.cssSelector(".v-table-row")).size()
                + table.findElements(By.cssSelector(".v-table-row-odd")).size();
    }

    public boolean columnContainsValue(int col, String value) {
        int rowCount = getRowCount();
        for (int i = 0; i < rowCount; i++) {
            TableRowElement row = table.getRow(i);
            TestBenchElement cell = row.getCell(col);
            if (cell.getText().equals(value)) {
                return true;
            }
        }
        return false;
    }

    public ValoTablesElement(WebDriver driver) {
        super(driver);
    }

}
