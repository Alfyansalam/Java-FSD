package filehandling;

import java.io.File;

public class create {

	public static void main(String[] args) {
		try
		{
		File f = new File("example.txt");
		boolean success =f.createNewFile();
		if (success) {
            System.out.println("File got created");
        } else {
            System.out.println("File already exists");
        }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
