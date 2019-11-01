package com.InetBanking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro=new Properties();
	public ReadConfig(){
		
		File src=new File("./Configuration/Config.properties");
		
	try{
		FileInputStream fis=new FileInputStream(src);
		pro.load(fis);
		
	}
	catch(Exception e){
		System.out.println("Exception is:"+e.getMessage());
	}
	
	}
	public String getApplicationUrl(){
		String url=pro.getProperty("baseUrl");
		return url;
	}
	public String getUserName(){
		String username=pro.getProperty("username");
		return username;
	}
   public String getPassword(){
	   String password=pro.getProperty("password");
	   return password;
   }
   
}  
