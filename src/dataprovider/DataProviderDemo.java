package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@DataProvider
	public static Object[][] getNames(){
		String a= "Ram";
		String b="Rakesh";
		String a1="Kumar";
		String b1="Sharma";
		return new Object[][]{{a,a1},{b,b1}};
	}
	
	@Test(dataProvider="getNames")
	public void verifyNames(String username, String password){
		System.out.println("Printing names :"+username+" "+password);
	}

}