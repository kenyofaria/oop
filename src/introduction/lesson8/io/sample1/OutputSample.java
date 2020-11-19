package introduction.lesson8.io.sample1;


public class OutputSample {	
	public static void main(String[] args) {
		FileUtil fileUtil = new FileUtil("output.txt");
		fileUtil.writeInFile("Bruno");
	}
}
