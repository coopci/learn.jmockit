package gubo.learn.jmockit;

import org.junit.Test;

import mockit.Injectable;
import mockit.Tested;

public class FileServiceTest {
	@Injectable 
	FileLoader fileLoader;
	@Tested
	FileService fileService;// = new FileService();

	@Test
	public void doBusinessOperationXyz() throws Exception {
		
		System.out.println("fileService:" + fileService);
		System.out.println("fileService.fileloader:" + fileService.fileloader);
		return;
	}
}
