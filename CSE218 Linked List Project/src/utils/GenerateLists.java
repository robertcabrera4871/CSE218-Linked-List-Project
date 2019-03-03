package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import links.MasterLink;
import lists.MasterList;

public class GenerateLists {
	private static File data = createFile();
	private static MasterList mL = new MasterList();

	private GenerateLists() {
	}

	private static File createFile() {
		File folder = new File("data");
		File newFile = null;
		for (File fileCheck : folder.listFiles()) {
			newFile = new File(fileCheck.getAbsolutePath());
		}
		return newFile;
	}

	public static MasterList generate() {
		Scanner scanUnique = null;
		Scanner scanFollowing = null;
		try {
			 scanUnique = new Scanner(data);
			 scanFollowing = new Scanner(data);
			createLists(scanUnique, scanFollowing);
			return mL;
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} finally{
			scanUnique.close();
			scanFollowing.close();
		}
		return null;
	}

	private static void createLists(Scanner scanUnique, Scanner scanFollowing) {
		scanFollowing.next();
		while (scanFollowing.hasNext()) {
			String compare = scanUnique.next();
			String next = scanFollowing.next();
			if (isUnique(compare)) {
				mL.insert(compare);
				mL.getFirst().getFollowingWords().insert(next);
			}
		}
	}

	private static boolean isUnique(String compare) {
		if (mL.isEmpty()) {
			return true;
		}
		MasterLink current = mL.getFirst();
		while (current != null) {
			if (current.getUniqueWord().equals(compare)) {
				return false;
			}
			current = current.getNext();
		}
		return true;
	}
}
