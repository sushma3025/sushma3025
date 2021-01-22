package generics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage 
{
	public void SelectByIndex(WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
				
	}

	public void SelectByValue(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
				
	}
	public void SelectByVisibleText(WebElement element, String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
				
	}
}
