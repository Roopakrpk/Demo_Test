package basic;

import java.util.concurrent.TimeUnit;

public class BrowserInvoke  {
		
		public static void startapplication(String browser, String testurl)
		
		{
			if(browser.equals("chrome"))
			{
				
				System.out.println("chrome browser opened");
			}
			else if (testurl.equals("https://demo.itlearn360.com/")) {
			System.out.println("URL satisfied");	
			System.out.println("Browser Invoked");	
			System.out.println("Webpage loaded");
			System.out.println("Expected results shown in UI");
			
		}
}
}