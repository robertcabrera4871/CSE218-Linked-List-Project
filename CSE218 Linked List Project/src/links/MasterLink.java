package links;

import lists.BabyList;

public class MasterLink {
	private String uniqueWord;
	private BabyList followingWords;
	private MasterLink next;

	public MasterLink(String unique) {
		this.uniqueWord = unique;
		this.setFollowingWords(new BabyList());
		this.next = null;
	}

	public String getUniqueWord() {
		return uniqueWord;
	}

	public void setUniqueWord(String uniqueWord) {
		this.uniqueWord = uniqueWord;
	}

	public BabyList getFollowingWords() {
		return followingWords;
	}

	public void setFollowingWords(BabyList followingWords) {
		this.followingWords = followingWords;
	}

	public MasterLink getNext() {
		return next;
	}

	public void setNext(MasterLink next) {
		this.next = next;
	}

	public void display() {
		System.out.println("uniqueWord: " + uniqueWord);
	}


}
