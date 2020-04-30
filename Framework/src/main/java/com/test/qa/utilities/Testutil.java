package com.test.qa.utilities;

import java.util.ArrayList;

public class Testutil {
	
	public static long pageLoadTime = 20;
	public static long implicitwait = 20;
	static Xls_Reader reader;
 
 public static ArrayList<Object[]> getDataFromExcel() {
	  
	  ArrayList<Object[]> myData = new ArrayList<Object[]>();
	  try {
		  reader = new Xls_Reader("C:\\Users\\sandeep.c.gowda\\eclipse-workspace\\NewProject\\src\\test\\java\\utility\\testdata\\testdata.xlsx");
	  }catch (Exception e) {
		  e.printStackTrace();
	  }

	  
	  for (int rowNum = 2; rowNum <= reader.getRowCount("testsheet"); rowNum++)
	  {
		  String email = reader.getCellData("testdata", "email", rowNum);
		  String password = reader.getCellData("testdata", "password", rowNum);
		  Object ob[] = {email, password};//object Array List
		  myData.add(ob);
	  }
	  return myData;
  }

}
