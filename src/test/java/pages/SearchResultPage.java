package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SearchResultPage extends TestBase{
	
	@FindBy(css = "ul > li.preview")
	WebElement itemIcon;
	
	@FindBy(xpath = "//button[contains(text(), 'Add to cart')]")
	WebElement addBtn;

	public  SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	public void viewItemDetail() {
		itemIcon.click();
	}
	public void addItem() {
		addBtn.click();
	}
}