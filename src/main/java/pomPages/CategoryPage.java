package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class CategoryPage {

	// Declaration

	@FindBy(xpath = "//h1[normalize-space(text())='Category']")
	private WebElement pageHeader;

	@FindBy(xpath = "//a[contains(text(),'New')]")
	private WebElement newButton;

	private String deletePath = "//td[text()='%s']/ancestor::tr/descendant::button[contains(text(),'Delete')]";
	

	@FindBy(name = "delete")
	private WebElement deleteButton;

	@FindBy(xpath = "//h4[contains(text(),'Success!')]")
	private WebElement successMessage;

	// Initialization
	public CategoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization

	public String getPageHeader() {
		return pageHeader.getText();
	}

	public void clickNewButton() {
		newButton.click();
	}

	public void deleteCategory(WebDriverUtility web, String categoryName) {
		web.convertPathToWebElement(deletePath, categoryName).click();
		deleteButton.click();
	}

	public String getSuccessMessage() {
		return successMessage.getText();
	}

}
