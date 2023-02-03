package org.sam;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleproject {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sandh\\EducationInfromation\\appium\\sampleproject\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com");
driver.manage().window().maximize();

String dr=driver.getTitle();
System.out.println(dr);


TakesScreenshot ts=(TakesScreenshot)driver;
File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
File f=new File("C:\\Users\\sandh\\EducationInfromation\\appium\\sampleproject\\drivers\\imagename.png");
FileUtils.copyFile(screenshotAs, f);
 driver.quit();

}









}












