package exceptionerror;
import java.io.File;
import java.util.Date;

public class file {
	public static void main(String[] args) {
		File file=new File("C:\\");
		String[] filelist=file.list();
		for(String name:filelist) {
			System.out.println(name);
		}
		
	}

}
