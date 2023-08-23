package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ShopingCartPage extends TestBase {
	@FindAll(@FindBy(css = "ul >li"))
	List<WebElement> items;

	@FindBy(xpath="(//button[@class ='call-to-action'])[2]")
	WebElement chkBtn;
	
	public ShopingCartPage() {
		PageFactory.initElements(driver, this);
	}
	public boolean isItemAdded() {
		if(items.size()>0)
		return true;
		else
			return false;
	}
	public void chkOut() {
		chkBtn.click();
	}
}
