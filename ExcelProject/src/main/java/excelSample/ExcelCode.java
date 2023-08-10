package excelSample;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode 
{
static FileInputStream f;//class
static XSSFWorkbook w;//class
static XSSFSheet sh;//class
public static String readStringData(int i, int j) throws IOException
{
f=new FileInputStream("C:\\Users\\user\\Desktop\\Excelsample.xlsx");
w=new XSSFWorkbook(f);
sh=w.getSheet("StudDOB");//sheet name
XSSFRow r=sh.getRow(i);
XSSFCell c=r.getCell(j);
return(c.getStringCellValue());
}
public static String readIntegerData(int i, int j) throws IOException
{
f=new FileInputStream("C:\\Users\\user\\Desktop\\Excelsample.xlsx");
w=new XSSFWorkbook(f);
sh=w.getSheet("StudDOB");
XSSFRow r=sh.getRow(i);
XSSFCell c=r.getCell(j);
int a=(int) c.getNumericCellValue();
return String.valueOf(a);
}
}

