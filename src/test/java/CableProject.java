import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class CableProject {

    @Test
    public void getChromeDriver() throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();


      WebDriver driver = new ChromeDriver();
        driver.get("http://online.cableproject.net/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath(".//html/body/div[1]/div[2]/div[1]/form/div/fieldset[1]/div[1]/input")).sendKeys("Serge");
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/form/div/fieldset[1]/div[2]/input")).sendKeys("4353453");
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/form/div/fieldset[1]/div[3]/input")).sendKeys("test@test.ts");
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/form/div/fieldset[1]/div[4]/input")).sendKeys("qwert");
        driver.findElement(By.id("sign_up_id")).click();

        driver.findElement(By.id("floor_plan")).click();

        StringSelection stringSelection = new StringSelection("PSSS.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        Robot robot = new Robot();
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(300);
        robot.keyRelease(KeyEvent.VK_V);
        robot.delay(300);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(300);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(300);

        //driver.wait(2000);


        driver.findElement(By.id("create_link")).click();
        StringSelection zoom = new StringSelection("15");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(zoom, null);
        Robot robot2 = new Robot();
        robot2.delay(1000);
        robot2.keyPress(KeyEvent.VK_CONTROL);
        robot2.delay(300);
        robot2.keyPress(KeyEvent.VK_V);
        robot2.delay(300);
        robot2.keyRelease(KeyEvent.VK_V);
        robot2.delay(300);
        robot2.keyRelease(KeyEvent.VK_CONTROL);
        robot2.delay(300);
        robot2.keyPress(KeyEvent.VK_ENTER);
        robot2.delay(300);
        robot2.keyRelease(KeyEvent.VK_ENTER);
        robot2.delay(300);




        Robot robot3 = new Robot();

        int x = 380;
        int y = 185;
        robot3.mouseMove(x, y);

        robot3.mousePress(InputEvent.BUTTON1_MASK);
        robot3.mouseRelease(InputEvent.BUTTON1_MASK);

        robot3.mouseMove(x, y+80);
        robot3.mousePress(InputEvent.BUTTON1_MASK);
        robot3.mouseRelease(InputEvent.BUTTON1_MASK);

        driver.findElement(By.id("rectangle_tof")).click();
        int q=700;
        int w=400;
        Robot robot5 = new Robot();

        robot5.mouseMove(q,w);
        robot5.mousePress(InputEvent.BUTTON1_MASK);
        robot5.delay(500);
        robot5.mouseRelease(InputEvent.BUTTON1_MASK);
        robot5.mouseMove(q-200, w-200);
        robot5.mousePress(InputEvent.BUTTON1_MASK);
        robot5.delay(500);
        robot5.mouseRelease(InputEvent.BUTTON1_MASK);

        driver.findElement(By.id("take_off")).click();
        Robot robot4 = new Robot();
        int e=750;
        int r=450;
        robot4.mouseMove(e, r);
        robot4.mousePress(InputEvent.BUTTON1_MASK);
        robot4.delay(500);
        robot4.mouseRelease(InputEvent.BUTTON1_MASK);
        robot4.delay(500);
        robot4.mouseMove(e, r+100);
        robot4.mousePress(InputEvent.BUTTON1_MASK);
        robot4.delay(500);
        robot4.mouseRelease(InputEvent.BUTTON1_MASK);
        robot4.mouseMove(e+100, r+100);
        robot4.mousePress(InputEvent.BUTTON1_MASK);
        robot4.delay(500);
        robot4.mouseRelease(InputEvent.BUTTON1_MASK);
        robot4.delay(500);
        robot4.mouseMove(e+100, r-80);
        robot4.mousePress(InputEvent.BUTTON1_MASK);
        robot4.delay(500);
        robot4.mouseRelease(InputEvent.BUTTON1_MASK);
        robot4.delay(500);
        robot4.mousePress(InputEvent.BUTTON1_MASK);
        robot4.delay(500);
        robot4.mouseRelease(InputEvent.BUTTON1_MASK);
        robot4.delay(500);

        robot4.mouseMove(e+100, r-60);
        robot4.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot4.delay(500);
        robot4.mouseRelease(InputEvent.BUTTON3_MASK);
        robot4.delay(500);
//        robot4.keyPress(KeyEvent.VK_TAB);
//      robot4.delay(300);

//        robot4.keyPress(KeyEvent.VK_ENTER);

      //driver.findElement(By.xpath("//*[@id=\"main_content\"]/div[2]/div[2]/div/div[1]/div[9]")).click();


      //  robot5.mouseMove(q-150,w-150);
      //  robot5.mousePress(InputEvent.BUTTON3_DOWN_MASK);
      //  robot5.delay(300);
      //  robot5.mouseRelease(InputEvent.BUTTON3_MASK);
      //  robot5.delay(300);

      //  robot4.keyPress(KeyEvent.VK_TAB);
      //  robot4.keyPress(KeyEvent.VK_DOWN);
      //  robot4.keyPress(KeyEvent.VK_TAB);
      //  robot4.keyPress(KeyEvent.VK_1);
      //  robot4.keyPress(KeyEvent.VK_TAB);
      //  robot4.keyPress(KeyEvent.VK_2);

       // robot4.keyPress(KeyEvent.VK_ENTER);





    }



}