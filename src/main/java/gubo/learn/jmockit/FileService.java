package gubo.learn.jmockit;

import javax.annotation.Resource;
public class FileService {
	@Resource(name="gubo.learn.jmockit.FileLoader")
	FileLoader fileloader;
}
