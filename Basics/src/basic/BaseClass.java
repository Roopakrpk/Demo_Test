package basic;


public class BaseClass {

	public static ConfigData config;
	public static void main(String[] args) {
		
		System.out.println(config);
		BrowserInvoke.startapplication(config.getBrowser(), config.getStagingUrl());
		System.out.println("End Step");		
	}
	

//	@AfterClass
//	public void teardown()
//	{
//	//	BrowserFactory.quitbrowser(driver);
//	}
//	

 }




