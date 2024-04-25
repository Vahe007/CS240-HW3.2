import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HotelDetailPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    HotelDetailPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickReserveRoom() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.HotelDetailPageLocators.RESERVE_BUTTON));
        WebElement reserveButton = driver.findElement(Locators.HotelDetailPageLocators.RESERVE_BUTTON);
        reserveButton.click();
    }

}
