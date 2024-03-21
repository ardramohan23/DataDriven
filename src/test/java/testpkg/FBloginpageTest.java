package testpkg;

import org.testng.annotations.Test;

import basepkg.BaseClass;
import pagepkg.FBloginpage;
import utilitiespkg.ExcelUtils;

public class FBloginpageTest extends BaseClass{
	
	@Test
	public void credentialPass() throws Exception {
		FBloginpage fb=new FBloginpage(driver);
		
		String x1="C:\\Users\\ARDRA MOHAN\\OneDrive\\Documents\\LUMINAR DIARIES\\FBtest.xlsx";
		String Sheet="Sheet1";
		
		int rowCount=ExcelUtils.getRowCount(x1, Sheet);
		for(int i=1;i<=rowCount;i++) {
			String UserName=ExcelUtils.getCellValue(x1, Sheet, i, 0);
			System.out.println("Username: "+UserName);
			String Password=ExcelUtils.getCellValue(x1, Sheet, i, 1);
			System.out.println("Password: "+Password);
			fb.setValues(UserName, Password);
			fb.login();
		}
	}
	
	

}
