package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(name ="searchbar")
	WebElement srcBox;
	
	@FindBy(id ="button-search")
	WebElement srcBtn;
	
	@FindBy(id ="cart")
	WebElement btnCart;
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public SearchResultPage searchItem(String item) {
		srcBox.sendKeys(item);
		srcBtn.click();
		return new SearchResultPage();
	}
	public void navigateToCart() {
		btnCart.click();
	}
}