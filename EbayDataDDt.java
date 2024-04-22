package hybridData;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EbayDataDDt
{
	public static Object[][] EbayData(String Source) throws Exception
	{
		Object[][] data = null;
		  
		  XSSFWorkbook wb = new XSSFWorkbook(Source);
		  XSSFSheet ws = wb.getSheet("Sheet1");
		  int row = ws.getPhysicalNumberOfRows();
		  
		  data = new Object[row-1][2];
		  
		  for(int i= 1; i<row; i++)
		  {
			  data[i-1][0]= ws.getRow(i).getCell(0).getStringCellValue();
			  data[i-1][1]= ws.getRow(i).getCell(1).getStringCellValue();
		  }
		return data;
	}
	
}
