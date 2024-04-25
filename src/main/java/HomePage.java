import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {
    private final WebDriver driver;
    private final WebDriverWait wait;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public HomePage enterDestination(String destination) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.HomePageLocators.LOCATION_INPUT));
        WebElement locationInput = driver.findElement(Locators.HomePageLocators.LOCATION_INPUT);
        locationInput.clear();
        locationInput.sendKeys(destination);
        locationInput.sendKeys(Keys.ENTER);
        return this;
    }

    public HomePage selectDates(String checkInDate) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.HomePageLocators.DATE_INPUT));
        WebElement checkInInput = driver.findElement(Locators.HomePageLocators.DATE_INPUT);
        checkInInput.clear();
        checkInInput.sendKeys(checkInDate);
        checkInInput.sendKeys(Keys.ENTER);
        return this;
    }


    public HotelListPage clickSearchButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.HomePageLocators.SEARCH_BUTTON));
        WebElement searchButton = driver.findElement(Locators.HomePageLocators.SEARCH_BUTTON);
        searchButton.click();
        return new HotelListPage(driver);
    }

}
