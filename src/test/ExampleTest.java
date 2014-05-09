package test;

import org.junit.Before;
import org.junit.Test;

import main.DocumentBox;
import main.IListener;

import static org.easymock.EasyMock.*;

 



public class ExampleTest { 
	
	private IListener mock;
	private DocumentBox documentBox;

	@Before
	public void setUp() throws Exception {
		mock = createMock(IListener.class);
		documentBox = new DocumentBox();
		documentBox.addListener(mock);
	}
	
	@Test
	public void testRemoveNonExistingDocument(){
		mock.documentAdded("New Document");
		expectLastCall().times(3);
		replay(mock);
		documentBox.addDocument("New Document", new byte[0]);
		documentBox.addDocument("New Document", new byte[0]);
		documentBox.addDocument("New Document", new byte[0]);		
		verify(mock);
	}
}



