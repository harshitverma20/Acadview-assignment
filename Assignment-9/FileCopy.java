import java.io.*;

class FileCopy{
	public static void main(String arg[])
	{
		File f1 = new File("C:\\Users\\harshit\\Desktop\\abc.txt");
		File f2 = new File("C:\\Users\\harshit\\Desktop\\xyz.txt");
		
		try{
			if( !( f1.isFile() ) )
				f1.createNewFile();
			
			if( !( f2.isFile() ) )
				f2.createNewFile();
			
			FileReader fr = new FileReader(f1);
			FileWriter fw = new FileWriter(f2,true);
			
			int c;
			while( (c=fr.read()) != -1 ){
				System.out.print((char)c);
				fw.write( c );
			}
			System.out.println("\n Action Successful!!");
			
			fw.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}