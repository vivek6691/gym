package com.maven.project;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Runable_Cls extends Base_Cls {

	public static void main(String[] args) throws Throwable  { 

		//public static WebDriver driver;
		
		FileInputStream ff=new FileInputStream("C:\\Users\\VIVEK G\\eclipse-workspace\\Maven_Project\\src\\test\\java\\vv.properties");
		
		Properties p=new Properties();
		
		p.load(ff);
		
//		String un=p.getProperty("username");
//		
//		String psw=p.getProperty("password");
//		
	//	String bro=p.getProperty("brows");
//		
//	    //String launch=p.getProperty("URL");
//		
//		//String text=p.getProperty("textbox");
//	
		browser("chrome");	
//		
//		url("http://automationpractice.com/index.php?controller=authentication&back=my-account");
//        		
//        PageFactory.initElements(driver, Pom_Cls.class);
//		
//        username(Pom_Cls.name,un);
//        implict();
//        
//        password(Pom_Cls.password,psw);
//        implict();
//        
//        select(Pom_Cls.login);
//        implict();
      
		url("http://automationpractice.com/index.php?id_category=8&controller=category");
        implict();
        
        
        dress(Pom_Cls.dress);
        implict();
        
        summer(Pom_Cls.summer);
        implict();
        
        addcart(Pom_Cls.addcart);
        implict();
        
        proceed1(Pom_Cls.checkout1);
        implict();
        
        proceed2(Pom_Cls.checkout2);
        implict();
        
        
        proceed3(Pom_Cls.checkout3);
        implict();
        
        checkbox(Pom_Cls.agree);
        implict();
        
        proceed4(Pom_Cls.checkout4);
        implict();
        
        bank(Pom_Cls.banking);
        implict();
        
        confirmOrder(Pom_Cls.order);
        implict();
        
        backOrder(Pom_Cls.backorder);
        implict();
        
     //   screenShot();
        
        
   	
	}
	
	}


package com.mav.pro;

public class Run_cl {

}
