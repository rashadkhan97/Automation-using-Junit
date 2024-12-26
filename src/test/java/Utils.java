import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class Utils {
    public static void scroll(WebDriver driver, int height){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, "+height+")");
    }

    public static String generateRandomPhoneNumber() {
        Random random = new Random();
        String fixedPrefix = "0171"; // Fixed first four digits
        // Generate the remaining 7 digits
        int remainingDigits = 1000000 + random.nextInt(9000000); // Ensures it's between 1000000 and 9999999

        return fixedPrefix+remainingDigits;
    }

    public static String generateRandomPassword(){
            String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String lowerCase = "abcdefghijklmnopqrstuvwxyz";
            String numeric = "0123456789";
            String specialChar = "!@#$%^&*/";
            String allChar = upperCase + lowerCase + numeric + specialChar;

            Random random = new Random();
            StringBuilder password = new StringBuilder();

            password.append(upperCase.charAt(random.nextInt(upperCase.length())));
            password.append(lowerCase.charAt(random.nextInt(lowerCase.length())));
            password.append(numeric.charAt(random.nextInt(numeric.length())));
            password.append(specialChar.charAt(random.nextInt(specialChar.length())));

            for (int i = 4; i < 8; i++) {
                password.append(allChar.charAt(random.nextInt(allChar.length())));
            }

            return password.toString();
    }

}
