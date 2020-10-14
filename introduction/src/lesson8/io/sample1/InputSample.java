package lesson8.io.sample1;


public class InputSample {

	
	public static void main(String[] args) {
		FileUtil fileUtil = new FileUtil();
		String content = fileUtil.contentFile("input.txt");
		
		System.out.println(content);
	}
}
