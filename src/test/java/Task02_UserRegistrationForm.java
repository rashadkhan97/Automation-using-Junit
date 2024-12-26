import org.junit.jupiter.api.*;
import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Task02_UserRegistrationForm {
    WebDriver driver;
    Faker faker;

    @BeforeAll
    public void setup() {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--headed");
        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        faker = new Faker();
    }

    @Test
    @DisplayName("Check if user registration is submitting properly")
    public void practiceWebFrom() throws InterruptedException {

        //Random first name, last name, email address, password &phone number (from-->utils)
        String ranFirstName = faker.name().firstName();
        String ranLastName = faker.name().lastName();
        String emailAddress = ranFirstName+"10@gmail.com";
        String phoneNumber = Utils.generateRandomPhoneNumber();
        String password = Utils.generateRandomPassword();


        driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form");

        // Firstname, Lastname, UserEmail, Gender, Date of Birth, Nationality, Phone, Country(Bangladesh),
        List<WebElement> textbox = driver.findElements(By.className("ur-frontend-field"));
        textbox.get(0).sendKeys(ranFirstName);
        textbox.get(1).sendKeys(emailAddress);
        textbox.get(2).sendKeys(password);
        textbox.get(3).sendKeys(ranLastName);
        textbox.get(4).click(); //select gender --> male
        textbox.get(8).sendKeys(phoneNumber);

        //date
        List<WebElement> dateOfBirthElement = driver.findElements(By.cssSelector("[type=text]"));
        WebElement firstDob = dateOfBirthElement.get(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value', '1999-10-19')", firstDob);

        //nationality
        textbox.get(10).sendKeys("Bangladeshi");

        //Country element identify and dropdown to select bangladesh
        textbox.get(11).click();
        Actions actions = new Actions(driver);
        for (int i=1; i<19; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).perform();
        }
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);

        //scroll down
        Utils.scroll(driver, 1500);

        //Terms & Conditions
        textbox.get(28).click();
        Thread.sleep(2000);

        //submit button
        WebElement submitButtonElement = driver.findElement(By.className("ur-submit-button"));
        submitButtonElement.click();
        Thread.sleep(4000);

    }


    @AfterAll
    public void closeDriver() throws InterruptedException {
        Thread.sleep(3000);
        //driver.quit();
    }
}

