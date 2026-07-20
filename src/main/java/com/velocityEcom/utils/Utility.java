package com.velocityEcom.utils;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Utility {
    //common method to read data from properties file
    public static String readDataFromPropertiesFile(String key) throws IOException {


        FileInputStream myFile = new FileInputStream("C:\\Users\\SATYENDRA\\IdeaProjects\\24thJanEcomBDD\\src\\main\\resources\\config.properties");
        Properties properties = new Properties();
        properties.load(myFile);
        String value = properties.getProperty(key);
        return value;
    }

    public static String readDataFromExcel(int row, int cell) throws IOException {
        FileInputStream myFile1 = new FileInputStream("D:\\Test.xlsx");
        String value = WorkbookFactory.create(myFile1).getSheet("Sheet8").getRow(row).getCell(cell).getStringCellValue();
        return value;
    }

    public static void takeScreenShot(WebDriver driver, String fileName) throws IOException {
        String timeStamp = new SimpleDateFormat("yyyy_mm_dd_hh_mm_SS").format(new Date());
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\SATYENDRA\\IdeaProjects\\24JanTestingSelenium\\Screenshotevidance\\" + fileName + timeStamp + ".png");
        FileHandler.copy(src, dest);
    }

    public static String readDataFromPropertiesFile1(String key) throws IOException {
        FileInputStream myfile2 = new FileInputStream("C:\\Users\\SATYENDRA\\IdeaProjects\\24JanTestingSelenium\\Login_Practice.properties");
        Properties properties = new Properties();
        properties.load(myfile2);
        String value1 = properties.getProperty(key);
        return value1;
    }

    public static String readDataFromExcel1(int row, int cell) throws IOException {
        FileInputStream myFile3 = new FileInputStream("D:\\Test.xlsx");
        String value1 = WorkbookFactory.create(myFile3).getSheet("Sheet7").getRow(row).getCell(cell).getStringCellValue();
        return value1;
    }

    public static void scrollIntoView(WebDriver driver, WebElement element) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", element);
//        System.out.println("scrolling into view");

        Actions actions=new Actions(driver);
        actions.scrollToElement(element).perform();
        System.out.println("scroll into view");
    }


}
