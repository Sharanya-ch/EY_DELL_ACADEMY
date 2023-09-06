package EY1708;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class DeleteDirectory {

	public static void main(String[] args) throws IOException{
		Path p = Paths.get("C:/Files/ABC8.txt");
		Path p2 = Paths.get("C:/Files/ABC");
		BasicFileAttributeView view = Files.getFileAttributeView(p, BasicFileAttributeView, class);
		BasicFileAttributes attr = view.readAttributes();
		
		
		FileTime creatinTime = attr.creationTime();
		System.out.println("Creation Time of my file was " + creatinTime);
		
		FileTime lastAccessedTime = attr.lastAccessTime();
		System.out.println("lastAccessTime of my file was " + lastAccessedTime);
		
		FileTime modifiedTime = attr.lastModifiedTime();
		System.out.println("last modified time  of my file was " + creatinTime);
		
				
		
	}
}
