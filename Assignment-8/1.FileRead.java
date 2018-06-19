import java.io.*;

class FileRead{
	public static void main(String args[])throws IOException
	{
		FileReader fr= new FileReader("E:\\games\\Prototype2\\abc.txt");
		BufferedReader bf = new BufferedReader(fr);
		
		int ch;
		while((ch=bf.read()) != -1){
			System.out.print((char)ch);
		}
	}
}