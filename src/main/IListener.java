package main;

public interface IListener
{
	void documentAdded(String title);
	void documentChanged(String title);
	void documentRemoved(String title);
	byte voteForRemoval(String title);
	byte[] voteForRemovals(String[] title);
	int getDocumentSize(String title);
}