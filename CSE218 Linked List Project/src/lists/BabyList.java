package lists;

import links.BabyLink;

public class BabyList {
	private BabyLink first;

	public BabyList() {
		first = null;
	}

	public BabyLink getRandom() {
		BabyLink current = first;
		for(int i = 0; i < (int) (Math.random() * countLinks()); i++) {
			current = current.getNext();
		}
		return current;
	}

	public int countLinks() {
		int count = 0;
		BabyLink current = first;
		while (current != null) {
			count++;
			current = current.getNext();
		}
		return count;
	}

	public void displayList() {
		BabyLink current = first;
		while (current != null) {
			current.display();
			current = current.getNext();
		}
		System.out.println();
	}

	public void insert(String followingWord) {
		BabyLink newLink = new BabyLink(followingWord);
		newLink.setNext(first);
		first = newLink;
	}

	public BabyLink getFirst() {
		return first;
	}

	public void setFirst(BabyLink first) {
		this.first = first;
	}

	public boolean isEmpty() {
		return first == null;
	}

}
