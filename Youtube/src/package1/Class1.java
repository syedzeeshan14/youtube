package package1;


import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Class1 {
	
	
@Test(dataProvider= "dp2")
public void testcase(String user, String password) {
	System.out.println("user is: "+user);
	System.out.println("Password is: " +password);
}
	@DataProvider
public Object[][] dp1() {
	Object[][] ob = new Object [2][2];
	ob [0][0]= "user1";
	ob [0][1]= "password 1";
	ob[1][0]="user2";
	ob[1][1]="password 2";
	return ob;
}
	@DataProvider
 public Object[][] dp2() throws BiffException, IOException{
	 File f = new File ("D:\\Excel\\test.xls");
	 Workbook wk =Workbook.getWorkbook(f);
	 Sheet ws =wk.getSheet(0);
	 int r = ws.getRows();
	 int c = ws.getColumns();
	 Object[][] ob = new Object[r][c];
	 for (int i=0;i<r;i++) {
		 for (int j=0;j<c;j++) {
			 Cell c1 = ws.getCell(j, i);
			 ob [i][j]=c1.getContents();
		 }
	 }
	 return ob;
			 
	
 }
}
