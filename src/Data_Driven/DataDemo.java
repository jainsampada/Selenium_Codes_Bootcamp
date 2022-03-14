package Data_Driven;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDemo {
	String uname,pass;
public void demo() throws IOException
{
	FileInputStream fis=new FileInputStream("E:\\Sampada\\Credentials.xlsx");

	XSSFWorkbook wb=new XSSFWorkbook(fis);
	
	XSSFSheet sheet=wb.getSheet("Login");
	
	System.out.println(sheet.getLastRowNum());
	for(int i=0;i<=sheet.getLastRowNum();i++)
	{
	uname=sheet.getRow(i).getCell(0).getStringCellValue();
	System.out.println(uname);
	pass=sheet.getRow(i).getCell(1).getStringCellValue();
	System.out.println(pass);
	
	}
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataDemo oo=new DataDemo();
		oo.demo();
	}

}
