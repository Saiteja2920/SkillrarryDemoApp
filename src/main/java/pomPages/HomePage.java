package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//Declaration
	
	@FindBy(xpath ="//a[normalize-space(text())='Home']")
	private WebElement pageHeader;
	
	@FindBy(xpath ="//span[text()='Users']")
	private WebElement usersTab;
	

	@FindBy(xpath ="//span[text()='Courses']")
	private WebElement coursesTab;
	
	
	@FindBy(xpath ="//a[contains(text(),'Course List')]")
	private WebElement courseListLink;
	
	@FindBy(xpath ="//a[contains(text(),'Category')]")
	private WebElement categoryLink;
	
	@FindBy(xpath = "//p[text()='SkillRary Admin']")
	private WebElement skillraryAdminIcon;
	
	@FindBy(xpath="//a[text()='Sign out']")
	private WebElement signoutLink;
	

	
	//Initialization
	
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	
	//Utilization
	public String getPageHeader() {
		return pageHeader.getText();
		
}
	public void clickUserTab() {
		usersTab.click();
	}
	public void clickCoursesTab() {
		coursesTab.click();
	}
	public void clickCourseListLink() {
		courseListLink.click();
	}
	public void clickCategoryLink() {
		categoryLink.click();
	}
	public void signOutOfApp() {
		skillraryAdminIcon.click();
		signoutLink.click();
	}
}

