package excelWork;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkbookCode
{
static FileInputStream f;
static XSSFWorkbook w;
static XSSFSheet sh;
public static String readDataString(int i,int j) throws IOException
{
f=new FileInputStream("C:\\Users\\user\\Desktop\\Excelsample.xlsx");
w=new XSSFWorkbook(f);
sh=w.getSheet("CourseAndFees");
XSSFRow r=sh.getRow(i);
XSSFCell c=r.getCell(j);
return (c.getStringCellValue());
}
public static String readDataInteger(int i, int j) throws IOException
{f=new FileInputStream("C:\\Users\\user\\Desktop\\Excelsample.xlsx");
w=new XSSFWorkbook(f);
sh=w.getSheet("CourseAndFees");
XSSFRow r=sh.getRow(i);
XSSFCell c=r.getCell(j);
int a=(int) c.getNumericCellValue();	
	return String.valueOf(a);
	
}
public static String readDataIntstr(int i, int j) throws IOException
{
	f=new FileInputStream("C:\\Users\\user\\Desktop\\Excelsample.xlsx");
w=new XSSFWorkbook(f);
sh=w.getSheet("CourseAndFees");
XSSFRow r=sh.getRow(i);
XSSFCell c=r.getCell(j);
return (c.getStringCellValue());
	
}
}