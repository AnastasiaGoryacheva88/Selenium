//package ru.netology;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class CartOrderTest {
//    private WebDriver driver;
//    @BeforeAll
//    static void setUoAll() {
//        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//    }
//    @BeforeEach
//    void setUp() { driver = new ChromeDriver();
//    }
//    @AfterEach
//    void tearDown() {
//        driver.quit();
//        driver = null;
//    }
//    @Test
//    void positiveTest() {
//        driver.get("http://localhost:9999");
//        driver.findElements(By.tagName("input")).get(0).sendKeys("Горячева Анастасия");
//        driver.findElements(By.tagName("input")).get(1).sendKeys("+79157777777");
//        driver.findElement(By.className("checkbox__box")).click();
//        driver.findElement(By.className("button__text")).click();
//        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
//        String actual = driver.findElement(By.tagName("p")).getText().trim();
//        assertEquals(expected, actual);
//    }
//}
