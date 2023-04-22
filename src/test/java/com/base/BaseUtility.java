package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtility {

	static WebDriver driver;
	
	public static void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);

	}
	
	public static void enteringText(WebElement element, String text) {
		element.sendKeys(text);

	}
	
	public static String dataFromExcel(int rownum, int cellnum) throws IOException {

		Workbook w = new XSSFWorkbook(new FileInputStream(new File("C:\\Users\\ADMIN\\eclipse-workspace\\CucumberProject\\Test\\Data.xlsx")));

		return w.getSheet("Sheet1").getRow(rownum).getCell(cellnum).getStringCellValue();
	}
	
	
	
}
