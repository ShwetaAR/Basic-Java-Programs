package programs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class WriteOwnJava8Programs {

	public static void main(String[] args) throws IOException {
		Stream<String> rows = Files
				.lines(Paths.get("C:\\Users\\sbaberi1\\eclipse-workspace\\Test Programs\\src\\data.txt"));
	}

}
