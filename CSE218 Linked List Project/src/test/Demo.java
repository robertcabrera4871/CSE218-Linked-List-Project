package test;

import lists.MasterList;
import utils.GenerateLists;

public class Demo {

	public static void main (String[] args) {
		MasterList list = GenerateLists.generate();
		list.displayList();
	}
}
