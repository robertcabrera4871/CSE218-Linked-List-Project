package utils;

import links.MasterLink;
import lists.MasterList;

public class GenerateParagraphUtil {
	private static MasterList list;
	private static String output;
	private static int pLength;

	private GenerateParagraphUtil() {
	}

	public static String generate(MasterList newList, String start, int userPLength) {
		list = newList;
		pLength = userPLength;
		return createParagraph(start, pLength);
	}

	private static String createParagraph(String start, int pLength) {
		MasterLink nextLink = null;
		for (int i = 0; i < pLength - 1; i++) {
			if (isInList(start) && i == 0) {
				output = start;
				String temp = list.find(start).getRandomBaby();
				nextLink = list.find(temp);
			} else if (!isInList(start)) {
				return "Cannot create paragraph," + start + " is not a valid Word";
			}
			if (nextLineCondition(i)) {
				output += "\n";
			}
			output += " " + nextLink.getUniqueWord();
			String next = nextLink.getRandomBaby();
			nextLink = list.find(next);
		}
		return output;
	}

	private static boolean nextLineCondition(int i) {
		int lines = 10;
		for(int y = 1; y <= lines; y++) {
			if(i == (pLength * y/lines))
				return true;
			}
		return false;
		}

	private static boolean isInList(String test) {
		if (list.find(test) != null) {
			return true;
		}
		return false;
	}
}
