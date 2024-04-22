package hybridFramework;

import org.testng.annotations.Test;

import hybridData.EbayDataDDt;
import pomPages.Fieldsearch;
import pomPages.OpenBrowser;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class HybridEbayCatProdSearch {
  @Test(dataProvider = "EbayData")
  public void CatSearch(String cat, String prod) 
  {
	  WebDriver driver = OpenBrowser.StartBrowser("Firefox", "https://www.ebay.com/");
	  
	  Fieldsearch fs= new Fieldsearch(driver);
	  fs.catsearch(cat, prod);
  }

  @DataProvider
  public Object[][] EbayData() throws Exception 
  {
	  Object[][] myData= EbayDataDDt.EbayData("C:\\Mind Q\\Selenium\\DDT\\ddt.xlsx");
	return myData;
  }
}
