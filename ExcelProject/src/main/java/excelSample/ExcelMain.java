package excelSample;

import java.io.IOException;

public class ExcelMain
{

	public static void main(String[] args) throws IOException 
	{
		String s=ExcelCode.readStringData(0, 0);
		String sv=ExcelCode.readStringData(1, 0);
		System.out.println(s);
		System.out.println(sv);
		String sr=ExcelCode.readIntegerData(0, 1);
		String srv=ExcelCode.readIntegerData(1, 1);
System.out.println(sr);
System.out.println(srv);
	}

}
