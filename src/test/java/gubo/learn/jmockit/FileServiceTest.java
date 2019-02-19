package gubo.learn.jmockit;

import org.junit.Test;

import mockit.Injectable;
import mockit.Tested;

public class FileServiceTest {
	@Injectable 
	FileLoader fileLoader;
	// jmockit 1.8 ���԰� fileLoader ע��fileService.fileLoader�� 
	// ���� jmockit 1.28  ����� fileLoader ע��fileService.fileLoader��  ����쳣:  java.lang.IllegalStateException: Missing @Injectable for field "gubo.learn.jmockit.FileLoader fileloader" in FileService

	@Tested
	FileService fileService;// = new FileService();

	@Test
	public void doBusinessOperationXyz() throws Exception {
		
		System.out.println("fileService:" + fileService);
		System.out.println("fileService.fileloader:" + fileService.fileloader);
		return;
	}
}
