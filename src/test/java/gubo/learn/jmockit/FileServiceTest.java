package gubo.learn.jmockit;

import org.junit.Test;

import mockit.Injectable;
import mockit.Tested;

public class FileServiceTest {
	@Injectable 
	FileLoader fileLoader;
	// jmockit 1.8 可以把 fileLoader 注到fileService.fileLoader。 
	// 但是 jmockit 1.28  不会把 fileLoader 注到fileService.fileLoader。  会出异常:  java.lang.IllegalStateException: Missing @Injectable for field "gubo.learn.jmockit.FileLoader fileloader" in FileService

	@Tested
	FileService fileService;// = new FileService();

	@Test
	public void doBusinessOperationXyz() throws Exception {
		
		System.out.println("fileService:" + fileService);
		System.out.println("fileService.fileloader:" + fileService.fileloader);
		return;
	}
}
