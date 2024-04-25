import org.openqa.selenium.By;

public class Locators {
    public static class HomePageLocators {
        public static final By LOCATION_INPUT = By.xpath("//input[@class='uitk-field-input is-hidden empty-placeholder']");
        public static final By DATE_INPUT = By.xpath("//input[@id='tt8sja']");
        public static final By SEARCH_BUTTON = By.id("search_button");
    }

    public static class HotelListPageLocators {
        public static final By HOTEL_LINK = By.xpath("//a[@data-stid='open-hotel-information']");
        public static final By DROPDOWN = By.id("sort-filter-dropdown-sort");
    }

    public static class HotelDetailPageLocators {
        public static final By RESERVE_BUTTON = By.xpath("//button[@data-stid='sticky-button']");
    }
}