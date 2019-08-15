package com.asd;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollHelper {

	private static Robot ScrolltoElement;
	private static JavascriptExecutor execute;

	public static void scrollToElementByRobotClass() {
		try {
			ScrolltoElement = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		ScrolltoElement.keyPress(KeyEvent.VK_DOWN);
		ScrolltoElement.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void scrollToElementByJavaScriptExecutor(WebDriver driver) {

		execute = (JavascriptExecutor) driver;
		execute.executeScript("argument[0].scrollintoView(true);");
	}

	public static void ScrollToElementBy200JavaScript(WebDriver driver) {
		execute = (JavascriptExecutor) driver;
		execute.executeScript("window.scrollBy(0,200)", "");

	}

	// Scrolling complete down the page
	public static void scrollToCompleteDownByJavaScriptExecutor(WebDriver driver) {
		execute = (JavascriptExecutor) driver;
		execute.executeScript("window.scrollBy(0,1000)");
	}

}
