package links;

public class BabyLink {
	private String followingWord;
	private BabyLink next;

	public BabyLink(String nextWord) {
		this.followingWord = nextWord;
		this.next = null;
	}

	public String getFollowingWord() {
		return followingWord;
	}

	public void setFollowingWord(String followingWord) {
		this.followingWord = followingWord;
	}

	public BabyLink getNext() {
		return next;
	}

	public void setNext(BabyLink next) {
		this.next = next;
	}

	public void display() {
		System.out.println("followingWord=" + followingWord);
	}

}
