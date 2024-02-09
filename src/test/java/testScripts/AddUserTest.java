package testScripts;

//This TestScript got Failed 

import java.util.Map;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;
import genericLibraries.IConstantPath;

public class AddUserTest extends BaseClass {
	@Test
	public void addUserTest() throws InterruptedException {
		SoftAssert soft = new SoftAssert();
		home.clickUserTab();
		soft.assertTrue(users.getPageHeader().contains("Users"));
		users.clickNewButton();
		Thread.sleep(3000);		
		excel.excelInit(IConstantPath.EXCEL_PATH, "Sheet1");
		soft.assertEquals(addUser.getPageHeader(), "Add New User");
		Map<String , String >map = excel.readFromExcel("Add User");
	
		
		addUser.setEmail(map.get("Email"));
		addUser.setPassword(map.get("Password"));
		addUser.setFirstname(map.get("Firstname"));
		addUser.setLastname(map.get("Lastname"));
		addUser.setAddress(map.get("Address"));
		addUser.setContactInfo(map.get("Contact Info"));
		addUser.uploadPhoto(map.get("Photo"));
		addUser.clickSave();
		soft.assertEquals(users.getSuccessMessage(), "Success!");
		
		soft.assertAll();
	}
	


}


