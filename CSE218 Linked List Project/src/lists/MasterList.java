package lists;

import links.MasterLink;

public class MasterList {
	private MasterLink first;
	
	public MasterList() {
		first = null;
	}
	public void displayList() {
		MasterLink current = first;
		while(current != null) {
			current.display();
			current.getFollowingWords().displayList();
			current = current.getNext();
		}
	}
	public void insert(String uniqueWord) {
		MasterLink newLink = new MasterLink(uniqueWord);
		newLink.setNext(first);
		first = newLink;
	}
	public MasterLink getFirst() {
		return first;
	}
	public void setFirst(MasterLink first) {
		this.first = first;
	}
	public boolean isEmpty() {
		return first == null;
	}
}
