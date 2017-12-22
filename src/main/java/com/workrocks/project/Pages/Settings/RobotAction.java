package com.workrocks.project.Pages.Settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotAction {
    private WebDriver wd;
    private WebDriverWait wait;
    Pages webpages = new Pages(wd);

    public RobotAction(WebDriver driver) {
        wd = driver;
        wait = new WebDriverWait(wd, 30, 500);
        PageFactory.initElements(wd, this);
        webpages = new Pages(wd);
    }

    public void selectItemInDropdown(){
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.waitForIdle();

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
