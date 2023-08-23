package testscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.SearchResultPage;

public class PlaceOrderTest extends TestBase {
	HomePage homePage;
	SearchResultPage resultPage;
	@BeforeTest
	public void setup() {
		intialize();
	}
  @Test(priority=1)
  public void searchItemTest() {
	  homePage = new HomePage();
	  resultPage = homePage.searchItem("Parry Hotter");
//	  resultPage = new SearchResultPage();
	  resultPage.viewItemDetail();
  }
  @Test(priority=2)
  public void addItemTest() {
	  resultPage = new SearchResultPage();
	  resultPage.addItem();
  }
 // @Test
  public void CheckoutItemTest() {
  }
}