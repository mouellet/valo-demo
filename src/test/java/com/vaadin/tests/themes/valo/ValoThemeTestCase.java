package com.vaadin.tests.themes.valo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vaadin.testbench.TestBench;
import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.TestBenchTestCase;
import com.vaadin.testbench.elements.TableRowElement;
import com.vaadin.testbench.support.TestBenchPageFactory;
import com.vaadin.tests.themes.valo.pageobject.AbstractValoUIElement;
import com.vaadin.tests.themes.valo.pageobject.ValoComboBoxesElement;
import com.vaadin.tests.themes.valo.pageobject.ValoCommonPartsElement;
import com.vaadin.tests.themes.valo.pageobject.ValoLabelsElement;
import com.vaadin.tests.themes.valo.pageobject.ValoTablesElement;

public class ValoThemeTestCase extends TestBenchTestCase {

    private AbstractValoUIElement page;

    @Before
    public void setUp() {
        this.setDriver(TestBench.createDriver(new FirefoxDriver()));
        this.getDriver().manage().window().maximize();
        this.getDriver().get("http://localhost:8080/valotheme");

        page = TestBenchPageFactory
                .initElements(this.getDriver(), ValoCommonPartsElement.class);
    }

    @Test
    public void valo_menuItemClick_navigatesToAssociatedPage() {
        assertNotNull(page);
        assertTrue((page instanceof ValoCommonPartsElement));

        page = page.navigateTo("labels");
        assertNotNull(page);
        assertTrue((page instanceof ValoLabelsElement));

        page = page.navigateTo("comboboxes");
        assertNotNull(page);
        assertTrue((page instanceof ValoComboBoxesElement));

        page = page.navigateTo("tables");
        assertNotNull(page);
        assertTrue((page instanceof ValoTablesElement));
    }

    @Test
    public void labelsPage_hugeLabelValue_valid() {
        page = page.navigateTo("labels");
        assertEquals("Huge type for display text.", ((ValoLabelsElement) page).huge.getText());
    }

    @Test
    public void comboBoxesPage_disabledComboBox_isDisabled() {
        page = page.navigateTo("comboboxes");
        assertFalse(((ValoComboBoxesElement) page).disabled.isEnabled());
    }

    @Test
    public void tablesPage_defaultTableOptions_valid() {
        ValoTablesElement tablesPage = (ValoTablesElement) page.navigateTo("tables");

        assertTrue("checked".equals(tablesPage.stripes.getValue()));
        assertTrue("checked".equals(tablesPage.verticalLines.getValue()));
        assertTrue("checked".equals(tablesPage.horizontalLines.getValue()));
        assertTrue("checked".equals(tablesPage.headers.getValue()));
    }

    @Test
    public void tablesPage_tableColumn_containsValue() {
        ValoTablesElement tablesPage = (ValoTablesElement) page.navigateTo("tables");

        boolean containsValue = false;
        try {
            int rowCount = tablesPage.table.findElements(By.cssSelector(".v-table-row")).size()
                    + tablesPage.table.findElements(By.cssSelector(".v-table-row-odd")).size();
            for (int i = 0; i < rowCount; i++) {
                TableRowElement row = tablesPage.table.getRow(i);
                TestBenchElement cell = row.getCell(1);
                if (cell.getText().equals("CHILD")) {
                    containsValue = true;
                }
            }
        } catch (NoSuchElementException e) {
            fail();
        }

        assertTrue(containsValue);
    }

    @After
    public void tearDown() {
        this.getDriver().quit();
    }

}
