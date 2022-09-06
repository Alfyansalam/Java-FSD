package filehandling;
//import java.io.File;
import java.io.FileWriter;
public class write {

	public static void main(String[] args) {
		try
		{
		FileWriter f = new FileWriter("example.txt");

        // writing to a file
        f.write("Hello!!");
        f.write("\nWelcome to the Java course of CodesDope.");

        // closing the file
        f.close();
		}catch(Exception e)
		{
			System.out.print(e);
		}
	}

}
