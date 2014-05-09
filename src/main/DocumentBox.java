package main;

public class DocumentBox
{
	
	private IListener listener;

	public void addListener(IListener listener) {
	
		this.listener = listener;
	}

	public void removeDocument(String removeDocument) {
		// TODO Auto-generated method stub
		
	}

	public void addDocument(String string, byte[] bs) {
		// TODO Auto-generated method stub
		
		listener.documentAdded(string);
	}

	public void addDocument(String string) {
		// TODO Auto-generated method stub		
	}

		
}