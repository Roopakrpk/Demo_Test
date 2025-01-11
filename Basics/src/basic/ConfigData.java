package basic;

	import java.io.File;
	import java.io.FileInputStream;

	import java.util.Properties;


	public class ConfigData {
	Properties pro;
	
		
		public ConfigData()
		{
			File src = new File("/home/roopak/eclipse-workspace/Basics/src/basic/data.properties");
			
			try {
				FileInputStream fis= new FileInputStream(src);
				
				pro= new Properties();
				
				pro.load(fis);
			} catch (Exception e) {
				System.out.println("Not able to load config file "+e.getMessage());
			} 
		}
		
		public String getBrowser() {
			// TODO Auto-generated method stub
			return pro.getProperty("browser");
		}



		public String getStagingUrl() {
			// TODO Auto-generated method stub
			return pro.getProperty("testurl");
		}
	}


