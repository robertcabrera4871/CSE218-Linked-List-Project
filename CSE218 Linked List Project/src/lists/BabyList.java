package lists;

import links.BabyLink;

public class BabyList extends MasterList{
	private BabyLink first;
	
	public BabyList() {
		super();
	}
	
	public void displayList() {
		BabyLink current = first;
		while(current != null) {
			current.display();
			current = current.getNext();
		}
	}
	public void insert(String followingWord) {
		BabyLink newLink = new BabyLink(followingWord);
		newLink.setNext(first);
		first = newLink;
	}
	
	
	
}
