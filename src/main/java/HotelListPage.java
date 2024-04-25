import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HotelListPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    HotelListPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public HotelListPage filterLowest() {
        WebElement dropDown = driver.findElement(Locators.HotelListPageLocators.DROPDOWN);
        dropDown.click();
        WebElement optionElement = dropDown.findElement(By.xpath("//option[@value='PRICE_LOW_TO_HIGH']"));
        optionElement.click();
        return this;
    }

    public HotelListPage filterHighest() {
        WebElement dropDown = driver.findElement(Locators.HotelListPageLocators.DROPDOWN);
        dropDown.click();
        WebElement optionElement = dropDown.findElement(By.xpath("//option[@value='PRICE_HIGH_TO_LOW']"));
        optionElement.click();
        return this;
    }

    public HotelDetailPage goToHotel() {
        WebElement hotelLink = driver.findElement(Locators.HotelListPageLocators.HOTEL_LINK);
        hotelLink.click();
        return new HotelDetailPage(driver);
    }


}