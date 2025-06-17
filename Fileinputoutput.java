package xyz;
import java.io.*;


public class Fileinputoutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader reader=new FileReader("D:\\harshi chowdary\\java\\ai in sm.txt");
			int ch;
			while((ch=reader.read())!=-1) {
				System.out.print((char)ch);
				
			}
			reader.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error:"+e.getMessage());
		}

	}

}
