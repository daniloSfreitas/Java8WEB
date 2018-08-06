package unidade2;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class BackupApp {

	public static void main(String[] args) throws IOException {
		Path home = Paths.get("/home/paulo/Downloads/ABC Curso/2Disciplina/src/unidade2BK");
        String filtro = "*.java";
        DirectoryStream<Path> stream = Files.newDirectoryStream(home, filtro);
        for(Path p: stream){
        	Path txt = home.resolve(p);
        	Path backup = home.resolve(p+"bak");
        	Files.copy(txt, backup, StandardCopyOption.REPLACE_EXISTING);
        }
	}

}