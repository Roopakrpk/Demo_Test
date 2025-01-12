package basic;


public class BaseClass {

	public static ConfigData config;
	public static void main(String[] args) {
		
		System.out.println(config);
		BrowserInvoke.startapplication(config.getBrowser(), config.getStagingUrl());
		System.out.println("End Step");	
		System.out.println("Script successfully started");
		System.out.println("Script successfully ended");
		System.out.println("Browser Closed");
	}
	

//	@AfterClass
//	public void teardown()
//	{
//	//	BrowserFactory.quitbrowser(driver);
//	}
//	

 }




