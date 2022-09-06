package filehandling;

import java.io.File;
import java.util.Scanner;

public class reading {

	public static void main(String[] args) {
		try {
            File fileObj = new File("example.txt");

            Scanner sc = new Scanner(fileObj);

            
            while (sc.hasNextLine()) {
                String data = sc.nextLine(); 
               
                System.out.println(data); 
            }
        } catch (Exception e) {
            System.out.println(e);
        }
	}

}

