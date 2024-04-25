import org.junit.jupiter.api.Test;

public class HotelBookingTests extends BaseTest {

    @Test
    public void searchForHotels() {
        HomePage homePage = new HomePage(driver);
        homePage.enterDestination("New York");
        homePage.selectDates("2024-04-26 - 2024-04-30");
        HotelListPage hotelListPage = homePage.clickSearchButton();
    }

    @Test
    public void filterLowestPriceHotels() {
        HomePage homePage = new HomePage(driver);
        homePage.enterDestination("Paris");
        homePage.selectDates("2024-04-26 - 2024-04-30");
        HotelListPage hotelListPage = homePage.clickSearchButton();
        hotelListPage.filterLowest();
    }

    @Test
    public void bookHotel() {
        HomePage homePage = new HomePage(driver);
        homePage.enterDestination("London");
        homePage.selectDates("2024-04-26 - 2024-04-30");
        HotelListPage hotelListPage = homePage.clickSearchButton();
        HotelDetailPage hotelDetailPage = hotelListPage.goToHotel();
        hotelDetailPage.clickReserveRoom();
    }

}



