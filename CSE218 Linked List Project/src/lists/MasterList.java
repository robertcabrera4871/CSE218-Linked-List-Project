package lists;

import links.MasterLink;

public class MasterList {
	private MasterLink first;
	
	public MasterList() {
		first = null;
	}
	public void displayList() {
		System.out.println("Unique Words and Following Words");
		System.out.println("--------------------------------");
		MasterLink current = first;
		while(current != null) {
			current.display();
			current.getFollowingWords().displayList();
			current = current.getNext();
		}
	}
	public String getRandom() {
		MasterLink current = first;
		int x = (int)(Math.random() * countLinks());
		for(int i = 0; i < x; i++) {
			current = current.getNext();
		}
		return current.getUniqueWord();
	}
	public int countLinks() {
		int count = 0;
		MasterLink current = first;
		while (current != null) {
			count++;
			current = current.getNext();
		}
		return count;
	}
	public MasterLink insert(String uniqueWord) {
		MasterLink newLink = new MasterLink(uniqueWord);
		newLink.setNext(first);
		first = newLink;
		return newLink;
	}
	public MasterLink find(String key) {
		MasterLink current = first;
		while(!current.getUniqueWord().equals(key)) {
			if(current.getNext() == null) {
				return null;
			} else {
				current = current.getNext();
			}
		}
		return current;
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
