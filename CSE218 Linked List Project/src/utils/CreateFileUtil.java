package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreateFileUtil {
	
	public static File createFile(String output) {
		File folder = createFolder();
		File file = new File(folder.getAbsoluteFile() + "\\output.txt");
		try {
			file.createNewFile();
			printToFile(file, output);
			return file;
		} catch (IOException e) {
			System.out.println("File failed to create");
		}
		return null;
	}
	private static File createFolder() {
		File folder = new File("output");
		folder.mkdirs();
		return folder;
	}
	private static void printToFile(File file, String output) throws FileNotFoundException {
		PrintWriter print = new PrintWriter(file);
		Scanner scan = new Scanner(output);
		while(scan.hasNextLine()) {
			print.println(scan.nextLine());
		}
		print.close();
		scan.close();
	}
	public static String getOriginalString() {
		try {
			File folder = new File("data");
			File file = new File(folder.getAbsolutePath() + "\\blowingInTheWind.txt");
			Scanner scan = new Scanner(new FileReader(file));
			String original = "";
			while(scan.hasNextLine()) {
				original += scan.nextLine() + "\n";
			}
			scan.close();
			return original;
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		return null;
	}
}
