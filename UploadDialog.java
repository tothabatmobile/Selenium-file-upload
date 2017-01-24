package com.sqs.pageobjects.sqs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UploadDialog {

  public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
    String  fileUploadName = "datafile";


    driver.get("https://www.cs.tut.fi/~jkorpela/forms/file.html");

    WebElement upload = driver.findElement(By.name(fileUploadName));

    upload.click();

    try {
      Thread.sleep(2000l);
    } catch (InterruptedException e) {
      e.printStackTrace();

    }

    upload.sendKeys("C:/etc/etc");


  }

}
