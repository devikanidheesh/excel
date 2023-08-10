package excelWork;

import java.io.IOException;

public class WorkBookMain {

	public static void main(String[] args) throws IOException
	{
		String s=WorkbookCode.readDataString(0, 0);
		String sv=WorkbookCode.readDataString(1, 0);
		System.out.println(s);
		System.out.println(sv);
		String sr=WorkbookCode.readDataInteger(0, 1);
		String srv=WorkbookCode.readDataInteger(1, 1);
		System.out.println(sr);
		System.out.println(srv);
		String str=WorkbookCode.readDataIntstr(0,2);
		String strv=WorkbookCode.readDataIntstr(1,2);
		System.out.println(str);
		System.out.println(strv);
	}

}
