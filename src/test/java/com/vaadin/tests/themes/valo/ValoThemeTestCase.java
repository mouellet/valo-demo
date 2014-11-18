package com.vaadin.tests.themes.valo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vaadin.testbench.ElementQuery;
import com.vaadin.testbench.TestBench;
import com.vaadin.testbench.TestBenchTestCase;
import com.vaadin.testbench.elements.HorizontalLayoutElement;
import com.vaadin.testbench.elements.TextFieldElement;
import com.vaadin.testbench.elements.VerticalLayoutElement;
import com.vaadin.testbench.support.TestBenchPageFactory;
import com.vaadin.tests.themes.valo.pageobject.AbstractValoUIElement;
import com.vaadin.tests.themes.valo.pageobject.ValoComboBoxesElement;
import com.vaadin.tests.themes.valo.pageobject.ValoCommonPartsElement;
import com.vaadin.tests.themes.valo.pageobject.ValoLabelsElement;
import com.vaadin.tests.themes.valo.pageobject.ValoPanelsElement;
import com.vaadin.tests.themes.valo.pageobject.ValoTablesElement;
import com.vaadin.tests.themes.valo.pageobject.ValoTextFieldsElement;

public class ValoThemeTestCase extends TestBenchTestCase {

    private AbstractValoUIElement page;

    @Before
    public void setUp() {
        this.setDriver(TestBench.createDriver(new FirefoxDriver()));
        this.getDriver().manage().window().maximize();
        // this.getDriver().manage().window().setSize(new Dimension(640, 960));
        this.getDriver().get("http://localhost:8080/valotheme");

        page = TestBenchPageFactory
                .initElements(this.getDriver(), ValoCommonPartsElement.class);
    }

    @Test
    public void valoMenu_menuItemClick_navigatesToAssociatedPage() {
        try {
            assertNotNull(page);
            assertTrue((page instanceof ValoCommonPartsElement));

            page = page.navigateTo(ValoLabelsElement.class);
            assertNotNull(page);
            assertTrue((page instanceof ValoLabelsElement));

            page = page.navigateTo(ValoTextFieldsElement.class);
            assertNotNull(page);
            assertTrue((page instanceof ValoTextFieldsElement));

            page = page.navigateTo(ValoComboBoxesElement.class);
            assertNotNull(page);
            assertTrue((page instanceof ValoComboBoxesElement));

            page = page.navigateTo(ValoTablesElement.class);
            assertNotNull(page);
            assertTrue((page instanceof ValoTablesElement));

            page = page.navigateTo(ValoPanelsElement.class);
            assertNotNull(page);
            assertTrue((page instanceof ValoPanelsElement));

        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void labelsPage_hugeLabelValue_valid() {
        try {
            ValoLabelsElement labelsPage = page.navigateTo(ValoLabelsElement.class);
            labelsPage.checkLabelValue();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void comboBoxesPage_disabledComboBox_isDisabled() {
        ValoComboBoxesElement comboBoxesPage = page.navigateTo(ValoComboBoxesElement.class);
        comboBoxesPage.checkDisabledIsNotEnabled();
    }

    @Test
    public void tablesPage_defaultTableOptions_valid() {
        ValoTablesElement tablesPage = page.navigateTo(ValoTablesElement.class);
        tablesPage.checkDefaultValues();
    }

    @Test
    public void tablesPage_tableColumn_containsValue() {
        ValoTablesElement tablesPage = page.navigateTo(ValoTablesElement.class);

        try {
            assertTrue(tablesPage.columnContainsValue(1, "CHILD"));

        } catch (NoSuchElementException e) {
            fail();
        }

    }

    @Test
    public void textFieldsPage_elementQueryVaadinSelector_example() {
        try {
            ValoTextFieldsElement textFieldsPage = page.navigateTo(ValoTextFieldsElement.class);

            ElementQuery<TextFieldElement> textField = new ElementQuery<TextFieldElement>(TextFieldElement.class)
                    .context(textFieldsPage.getContext())
                    .child(new ElementQuery<HorizontalLayoutElement>(HorizontalLayoutElement.class)
                            .child(new ElementQuery<VerticalLayoutElement>(VerticalLayoutElement.class)))
                    .index(4);

            TextFieldElement el = textField.first();
            assertTrue("Error".equals(el.getCaption()));

        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void panelsPage_findByVaadinSelector_valid() {
        try {
            ValoPanelsElement panelsPage = page.navigateTo(ValoPanelsElement.class);
            panelsPage.clickButtonInSizedPanel();
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void textFieldsPage_findListOfElementsByVaadin_elementListFound() {
        try {
            ValoTextFieldsElement textFieldsPage = page.navigateTo(ValoTextFieldsElement.class);
            textFieldsPage.checkTextFields();
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    @After
    public void tearDown() {
        this.getDriver().quit();
    }

}
